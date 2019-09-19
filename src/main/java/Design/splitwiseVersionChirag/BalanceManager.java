package Design.splitwiseVersionChirag;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BalanceManager {

  private Map<User, Map<User, BigDecimal>> balanceOfUsers;

  private UserService userService;

  public BalanceManager (UserService userService) {
    this.userService = userService;
    balanceOfUsers = new HashMap<>();
    for (User user: userService.getUsers()) {
      balanceOfUsers.put(user, new HashMap<User, BigDecimal>());
      for (User friend: user.getFriends()) {
        balanceOfUsers.get(user).put(friend, new BigDecimal("0.0"));
      }
    }
  }

  public Map<User, BigDecimal> getPendingBalanceForAUser(User user) {
    return balanceOfUsers.get(user);
  }

  public void updateBalance(User user1, User user2, BigDecimal balance) {
    if (user1.getFriends().contains(user2) && user2.getFriends().contains
      (user1)) {
      Map<User, BigDecimal> balanceOfUser1 = balanceOfUsers.get(user1);
      Map<User, BigDecimal> balanceOfUser2 = balanceOfUsers.get(user2);
      balanceOfUser1.put(user2, balanceOfUser1.get(user2).add(balance));
      balanceOfUser2.put(user1, balanceOfUser2.get(user1).subtract(balance));
    }
  }



}
