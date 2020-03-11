package com.demo.service;

import com.demo.repo.OracleRepo;
import com.demo.repo.Repository;

public class TransactionService implements Services{

	@Override
	public void getUsersList() {
		Repository repo = new OracleRepo();
		repo.deleteUser();
		repo.getUsersList();
		repo.saveUser();
		System.out.println("Services List");
		
	}

}
