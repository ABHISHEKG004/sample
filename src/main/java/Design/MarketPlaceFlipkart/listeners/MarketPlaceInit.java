package Design.MarketPlaceFlipkart.listeners;

import Design.MarketPlaceFlipkart.DataStore;
import Design.MarketPlaceFlipkart.operation.AddProduct;
import Design.MarketPlaceFlipkart.operation.BestSelling;
import Design.MarketPlaceFlipkart.operation.BestSellingFromCategory;
import Design.MarketPlaceFlipkart.operation.BlackListUser;
import Design.MarketPlaceFlipkart.operation.OperationProvider;
import Design.MarketPlaceFlipkart.operation.Purchase;
import Design.MarketPlaceFlipkart.operation.Return;

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
