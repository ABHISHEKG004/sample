package com.design.lowlevel.others.splitwiseVersionChirag;

import java.math.BigDecimal;
import java.util.Map;

public class TransactionManagerOnAbsoluteAmount extends TransactionManager {


  public TransactionManagerOnAbsoluteAmount(BalanceManager balanceManager) {
    super(balanceManager);
  }
  
  @Override
  public void recordTransactionOn(User payingUser, BigDecimal amount,
                                  Map<User, BigDecimal> otherUsersInTransaction)
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
    if (amtOwed.compareTo(amount) != 0) {
      System.out.println(amtOwed + " " + amount);
      throw new Exception("Amount owed is not equal to total amount");
    }
    for (User user: otherUsersInTransaction.keySet()) {
      getBalanceManager().updateBalance(payingUser, user,
        otherUsersInTransaction.get(user));
    }
  }
  
}
