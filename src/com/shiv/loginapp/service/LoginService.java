package com.shiv.loginapp.service;

public class LoginService {
	
	// Model in this application is the Boolean that we are passing from service to the controller
	public boolean authenticate(String userId, String password){
		
		if(password == null || password.trim() == ""){
			return false;
		}
		return true;
	}
}
