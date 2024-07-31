package com.tests;

import com.Bean.UserBean;

public class UserTest {

	public static void main(String[] args) {
		
		UserBean user = new UserBean();
		user.setUserid("WOW123");
		user.setAccountName("Anup Patil");
		
		
		System.out.println(user.getUserid());
		System.out.println(user.getAccountName());
				
	}

}
