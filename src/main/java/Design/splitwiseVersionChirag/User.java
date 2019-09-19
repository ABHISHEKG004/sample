package Design.splitwiseVersionChirag;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {

  private String id;

  private String name;

  private String emailId;
  private List<User> friends;


  public User(String name, String emailId) {
    this.name = name;
    this.emailId = emailId;
    this.id = UUID.randomUUID().toString();
    this.friends = new ArrayList<>();
  }

  public void addFriend(User user) {
    this.friends.add(user);
    user.getFriends().add(this);
  }

  public List<User> getFriends() {
    return friends;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
