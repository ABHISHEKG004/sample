package com.design.lowlevel.others.MarketPlaceFlipkart.operation;

import com.design.lowlevel.others.MarketPlaceFlipkart.DataStore;

/**
 * Created by shiva.b on 02/12/17.
 */
public class BestSelling implements Operation {

  private DataStore dataStore;

  public BestSelling(DataStore dataStore) {
    this.dataStore = dataStore;
  }

  public void execute(String request) {
    System.out.println(dataStore.getBestSellingProduct());
  }
}
