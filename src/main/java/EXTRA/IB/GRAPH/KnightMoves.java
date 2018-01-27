package EXTRA.IB.GRAPH;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by abhishek.gupt on 17/12/17.
 */

class KnightNode {
    int x, y, step;

    KnightNode(int x, int y, int step) {
        this.x = x;
        this.y = y;
        this.step = step;
    }
}
public class KnightMoves {

    public int knight(int N, int M, int x1, int y1, int x2, int y2) {


        Queue<KnightNode> q = new LinkedList<KnightNode>();
        boolean[][] vis = new boolean[N+1][M+1];

        for (int i = 1; i <= N; i++)
            for (int j = 1; j <= M; j++)
                vis[i][j] = false;

        q.add(new KnightNode(x1, y1, 0));

        if(x1 == x2 && y1 == y2) {
            return 0;
        }
        vis[x1][y1] = true;

        int ans = 1000000000;

        while(!q.isEmpty()) {
            KnightNode kn = q.remove();
            int x = kn.x;
            int y = kn.y;
            int step = kn.step;

            vis[x][y] = true;

            if(x == x2 && y == y2) {
                ans= Math.min(ans, step);
                //return step;
            }
            if(x - 1 > 0 && y -2 > 0 && vis[x-1][y-2] == false) {
                q.add(new KnightNode(x-1, y -2, step + 1));
            }
            if(x - 1 > 0 && y + 2 <= M && vis[x-1][y+2] == false) {
                q.add(new KnightNode(x-1, y + 2, step + 1));
            }
            if(x + 1 <= N && y -2 > 0 && vis[x+1][y-2] == false) {
                q.add(new KnightNode(x+1, y - 2, step + 1));
            }
            if(x + 1 <= N && y + 2 <= M && vis[x+1][y+2] == false) {
                q.add(new KnightNode(x + 1, y + 2, step + 1));
            }
            if(x - 2 > 0 && y + 1 <= M && vis[x-2][y+1] == false) {
                q.add(new KnightNode(x-2, y + 1, step + 1));
            }
            if(x - 2 > 0 && y - 1 > 0 && vis[x-2][y-1] == false) {
                q.add(new KnightNode(x-2, y -1, step + 1));
            }
            if(x + 2 <= N && y + 1 <= M && vis[x+2][y+1] == false) {
                q.add(new KnightNode(x + 2, y + 1, step + 1));
            }
            if(x + 2 <= N && y - 1 > 0 && vis[x+2][y-1] == false) {
                q.add(new KnightNode(x + 2, y - 1, step + 1));
            }
        }
        return ans==1000000000 ? -1 : ans;
    }
    public static void main(String[] args) {
        KnightMoves kc = new KnightMoves();
        System.out.println(kc.knight(8, 8 , 1, 1, 8, 8));
    }
}