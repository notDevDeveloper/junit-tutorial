package com.areyes1.jgc.intf;

import java.util.List;
import com.areyes1.jgc.obj.Account;
import com.areyes1.jgc.obj.Transaction;

public interface AccountService {

    Account createNewAccount(Account account);

    Account updateAccount(Account account);

    boolean removeAccount(Account account);

    List<Transaction> listAllTransactions(Account account);

}
