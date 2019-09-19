package Design.splitwiseVersionChirag;

import java.math.BigDecimal;
import java.util.Map;

public abstract class TransactionManager {


  private BalanceManager balanceManager;

  public TransactionManager(BalanceManager balanceManager) {
    this.balanceManager = balanceManager;
  }

  public BalanceManager getBalanceManager() {
    return balanceManager;
  }


  public abstract void recordTransactionOn(User payingUser, BigDecimal amount,
                                           Map<User, BigDecimal>
                                             otherUsersInTransaction) throws Exception;

}
