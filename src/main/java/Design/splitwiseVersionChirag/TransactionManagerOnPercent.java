package Design.splitwiseVersionChirag;

import java.math.BigDecimal;
import java.util.Map;

public class TransactionManagerOnPercent extends TransactionManager {

  public TransactionManagerOnPercent(BalanceManager balanceManager) {
    super(balanceManager);
  }

  @Override
  public void recordTransactionOn(User payingUser, BigDecimal amount,
                                  Map<User, BigDecimal>
                                    otherUsersInTransaction)
    throws Exception {
    for (User user: otherUsersInTransaction.keySet()) {
      if (!payingUser.getFriends().contains(user)) {
        throw new Exception("Transaction not valid");
      }
    }
    BigDecimal amtOwed = new BigDecimal("0.0");
    for(BigDecimal amt: otherUsersInTransaction.values()) {
      amtOwed = amtOwed.add(amt);
    }
    if (amtOwed.compareTo(new BigDecimal("100.0")) != 0) {
      throw new Exception("Amount owed is not equal to total amount");
    }
    for (User user: otherUsersInTransaction.keySet()) {
      BigDecimal amountOwed = amount.multiply(otherUsersInTransaction.get
        (user)).divide(new BigDecimal("100.0"));
      getBalanceManager().updateBalance(payingUser, user, amountOwed);
    }
  }
}
