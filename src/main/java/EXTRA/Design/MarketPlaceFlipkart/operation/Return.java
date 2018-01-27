package EXTRA.Design.MarketPlaceFlipkart.operation;

import java.io.IOException;

import EXTRA.Design.MarketPlaceFlipkart.DataStore;
import EXTRA.Design.MarketPlaceFlipkart.Utils;
import EXTRA.Design.MarketPlaceFlipkart.pojo.Product;
import EXTRA.Design.MarketPlaceFlipkart.pojo.User;

/**
 * Created by shiva.b on 02/12/17.
 */
public class Return implements Operation {

  private DataStore dataStore;

  public Return(DataStore dataStore) {
    this.dataStore = dataStore;
  }
  class ReturnProductInput {
    private User user;
    private Product product;

    ReturnProductInput(User user, Product product) {
      this.user = user;
      this.product = product;
    }

    public User getUser() {
      return user;
    }

    public Product getProduct() {
      return product;
    }
  }
  public void execute(String request) throws IOException {
    ReturnProductInput ip = Utils.getObjectMapper().readValue(request, ReturnProductInput.class);

    User user = ip.getUser();
    Product product = ip.getProduct();


  }
}
