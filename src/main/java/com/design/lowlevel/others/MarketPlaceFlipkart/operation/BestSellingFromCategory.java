package com.design.lowlevel.others.MarketPlaceFlipkart.operation;


import java.io.IOException;

import com.design.lowlevel.others.MarketPlaceFlipkart.DataStore;
import com.design.lowlevel.others.MarketPlaceFlipkart.Utils;
import com.design.lowlevel.others.MarketPlaceFlipkart.enums.Category;
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
