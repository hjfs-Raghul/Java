package com.demo;

import com.demo.service.Services;
import com.demo.service.TransactionService;

public class Controller {
	public static void main(String[] args) {
		Services services = new TransactionService();
		services.getUsersList();
	}
	
}
