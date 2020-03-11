package com.demo.repo;

public class OracleRepo implements Repository{

	@Override
	public void getUsersList() {
		System.out.println("List customer");
		
	}

	@Override
	public void saveUser() {
		System.out.println("save customer");
		
	}

	@Override
	public void deleteUser() {
		System.out.println("delete customer");
		
	}

}
