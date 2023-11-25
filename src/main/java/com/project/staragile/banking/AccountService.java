package com.project.staragile.banking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
	@Autowired
	AccountRepository accountRepository;
	
	public Account createAccount() {
		Account account = new Account(1010101010,"prasad","Saving Account",25000.00);
		return accountRepository.save(account);
	}

	public Account registerAccount(Account account) {
		return accountRepository.save(account);
	}

	public Account getAccountDetails(int accountId) {
		return accountRepository.findById(accountId).get();
	}
	
	public Account registerDummyAccount() {
		Account account = new Account(1010101010,"prasad","Saving Account",25000.00);
		return account;
	}

}
