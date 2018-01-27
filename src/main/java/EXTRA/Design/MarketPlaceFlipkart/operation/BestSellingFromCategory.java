package EXTRA.Design.MarketPlaceFlipkart.operation;


import java.io.IOException;

import EXTRA.Design.MarketPlaceFlipkart.DataStore;
import EXTRA.Design.MarketPlaceFlipkart.Utils;
import EXTRA.Design.MarketPlaceFlipkart.enums.Category;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Created by shiva.b on 02/12/17.
 */
public class BestSellingFromCategory implements Operation {

  private DataStore dataStore;

  public BestSellingFromCategory(DataStore dataStore) {
    this.dataStore = dataStore;
  }

  public void execute(String request) throws IOException {
    ObjectMapper objectMapper = Utils.getObjectMapper();
    Category category = objectMapper.readValue(request, Category.class);
    System.out.println(dataStore.getBestProductFromCategory(category));
  }
}
