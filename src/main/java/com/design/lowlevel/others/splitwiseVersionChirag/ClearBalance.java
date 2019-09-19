package com.design.lowlevel.others.splitwiseVersionChirag;

import java.math.BigDecimal;

public class ClearBalance {

  private BalanceManager balanceManager;

  public ClearBalance(BalanceManager balanceManager) {
    this.balanceManager = balanceManager;
  }

  public void recordCashTransaction(User user1, User user2, BigDecimal
    amount) {
    this.balanceManager.updateBalance(user1, user2, amount);
  }

}
