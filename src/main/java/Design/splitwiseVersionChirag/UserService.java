package Design.splitwiseVersionChirag;

import java.util.ArrayList;
import java.util.List;

public class UserService {


  private List<User> users;

  public UserService() {
    this.users = new ArrayList<>();
  }

  public List<User> getUsers() {
    return users;
  }

  public void addUser(User user) {
    this.users.add(user);
  }

}
