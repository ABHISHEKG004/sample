package EXTRA.Design.MarketPlaceFlipkart.operation;


import EXTRA.Design.MarketPlaceFlipkart.DataStore;
import EXTRA.Design.MarketPlaceFlipkart.Utils;
import EXTRA.Design.MarketPlaceFlipkart.pojo.Product;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Created by shiva.b on 02/12/17.
 */
public class AddProduct implements Operation {

  private DataStore dataStore;

  public AddProduct(DataStore dataStore) {
    this.dataStore = dataStore;
  }

  @Override
  public void execute(String request) throws Exception {
    ObjectMapper objectMapper = Utils.getObjectMapper();
    Product product = objectMapper.readValue(request, Product.class);
    if (product == null || product.getId() == null) {
      throw new Exception("illegal product");
    }
    dataStore.incrementAvailableProduct(product);
  }
}
