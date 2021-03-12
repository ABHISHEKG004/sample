package com.design.lowlevel.others.MarketPlaceFlipkart.listeners;

import com.design.lowlevel.others.MarketPlaceFlipkart.operation.BestSellingFromCategory;
import com.design.lowlevel.others.MarketPlaceFlipkart.DataStore;
import com.design.lowlevel.others.MarketPlaceFlipkart.operation.AddProduct;
import com.design.lowlevel.others.MarketPlaceFlipkart.operation.BestSelling;
import com.design.lowlevel.others.MarketPlaceFlipkart.operation.BlackListUser;
import com.design.lowlevel.others.MarketPlaceFlipkart.operation.OperationProvider;
import com.design.lowlevel.others.MarketPlaceFlipkart.operation.Purchase;
import com.design.lowlevel.others.MarketPlaceFlipkart.operation.Return;

/**
 * Created by shiva.b on 02/12/17.
 */
public class MarketPlaceInit {

  public static void main(String[] args) {
    new MarketPlaceInit().init();
  }

  private void init() {

    DataStore dataStore = new DataStore();
    OperationProvider operationProvider = new OperationProvider();
    operationProvider.register("addProduct", new AddProduct(dataStore));
    operationProvider.register("bestSelling", new BestSelling(dataStore));
    operationProvider.register("bestSellingCategory", new BestSellingFromCategory(dataStore));
    operationProvider.register("blackListUser", new BlackListUser(dataStore));
    operationProvider.register("purchase", new Purchase(dataStore));
    operationProvider.register("return", new Return(dataStore));

    while (true) {

    }
  }
}
