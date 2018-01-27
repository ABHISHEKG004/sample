package EXTRA.Dunzo;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.google.gson.*;

/**
 * Created by abhishek.gupt on 14/12/17.
 */


class Movie {
    public String Poster;
    public String Title;
    public String Type;
    public String Year;
    public String imdbId;
}

class Solve {
    public String page;
    public int per_page;
    public int total;
    public int total_pages;
    public List<Movie> data = new ArrayList<Movie>();
}
public class Solution {



    public  static ArrayList<String> sendGet(String substr) throws Exception {

        ArrayList<String>  res = new ArrayList<String>();

        String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr;

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();


        String json = response.toString();
        Gson gson = new Gson();
        Solve ans = gson.fromJson(json, Solve.class);

        //System.out.println(ans.total_pages);

        for(int i=1;i<=ans.total_pages;i++){

            String pageUrl = "https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr + "&page="+i;
            URL obj1 = new URL(pageUrl);
            HttpURLConnection con1 = (HttpURLConnection) obj1.openConnection();

            con1.setRequestMethod("GET");


            BufferedReader in1 = new BufferedReader(
                    new InputStreamReader(con1.getInputStream()));
            String inputLine1;
            StringBuffer response1 = new StringBuffer();

            while ((inputLine1 = in1.readLine()) != null) {
                response1.append(inputLine1);
            }
            in1.close();

            String temp = response1.toString();

            Gson gson1 = new Gson();

            Solve ans1 = gson1.fromJson(temp, Solve.class);

            for(int j = 0;j<ans1.data.size();j++){
                //System.out.println(ans1.data.get(j).Title);

                res.add(ans1.data.get(j).Title);
            }


        }

        Collections.sort(res);
        //System.out.println(ans.data.get(0).Poster);

        //Movie muvi = gson.fromJson(ans.data[0], Movie.class);
        //System.out.println(muvi.Poster);

        return res;
    }


    static String[] getMovieTitles(String substr) {
        try {
            ArrayList<String> res = Solution.sendGet(substr);
            String[] ans = converList(res);
            return ans;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new String[]{};
    }

    private static String[] converList(ArrayList<String> res) {
        String[] x = new String[res.size()];
        for(int i = 0; i < res.size(); i++) {
            x[i] = res.get(i);
        }
        return x;
    }

    public static void main(String[] args) {
        getMovieTitles("spiderman");
    }

}
