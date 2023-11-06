package com.metrica.vibely.model;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Admin extends User {
	public Admin() {
		super();
	}
	public Admin(UUID userId, 
				 String email, 
				 String nickname, 
				 String password, 
				 Status status, 
				 LocalDate blockedDate,
				 Integer logins, 
				 PrivacyType privacyType, 
				 List<User> followers, 
				 List<User> following 
				 ){
		
		super( userId, 
			   email, 
			   nickname, 
			   password, 
			   status, 
			   blockedDate,
			   logins, 
			   privacyType, 
			   followers, 
			   following
			 );
	}
}
