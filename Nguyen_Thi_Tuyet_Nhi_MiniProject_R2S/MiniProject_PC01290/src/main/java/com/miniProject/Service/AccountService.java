package com.miniProject.Service;

import java.util.List;

import com.miniProject.Entity.Account;

public interface AccountService {
	
	public Account findById(String username);

	public List<Account> getAdministrators();

	public List<Account> findAll();	
	
	public Account create(Account account);
	
	public Account update(Account account);
	
	public void delete(String username);

}
