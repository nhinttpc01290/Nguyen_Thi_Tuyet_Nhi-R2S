package com.miniProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniProject.DAO.AccountDAO;
import com.miniProject.Entity.Account;
import com.miniProject.Service.AccountService;

@Service
public class AccountServiceImple implements AccountService{

	@Autowired
	AccountDAO dao;
	
	@Override
	public Account findById(String username) {
		return dao.findById(username).get();
	}

	@Override
	public List<Account> getAdministrators() {
		return dao.getAdministrators();
	}

	@Override
	public List<Account> findAll() {
		return dao.findAll();
	}
	
	@Override
	public Account create(Account account) {
		return dao.save(account);
	}

	@Override
	public Account update(Account account) {
		return dao.save(account);
	}

	@Override
	public void delete(String username) {
		dao.deleteById(username);
	}

}
