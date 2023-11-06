package com.metrica.vibely.model;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class User {
	private UUID userId;
	private String email;
	private String nickname;
	private String password;
	private Status status;
	private LocalDate blockedDate;
	private Integer logins;
	private PrivacyType privacyType;
	private List<User> followers;
	private List<User> following;
	
	public User() {
		
	}
	public User(UUID userId, String email, String nickname, String password, Status status, LocalDate blockedDate,
			Integer logins, PrivacyType privacyType, List<User> followers, List<User> following) {
		this.userId = userId;
		this.email = email;
		this.nickname = nickname;
		this.password = password;
		this.status = status;
		this.blockedDate = blockedDate;
		this.logins = logins;
		this.privacyType = privacyType;
		this.followers = followers;
		this.following = following;
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public java.time.LocalDate getBlockedDate() {
		return blockedDate;
	}

	public void setBlockedDate(java.time.LocalDate blockedDate) {
		this.blockedDate = blockedDate;
	}

	public Integer getLogins() {
		return logins;
	}

	public void setLogins(Integer logins) {
		this.logins = logins;
	}

	public PrivacyType getPrivacyType() {
		return privacyType;
	}

	public void setPrivacyType(PrivacyType privacyType) {
		this.privacyType = privacyType;
	}

	public List<User> getFollowers() {
		return followers;
	}

	public void setFollowers(List<User> followers) {
		this.followers = followers;
	}

	public List<User> getFollowing() {
		return following;
	}

	public void setFollowing(List<User> following) {
		this.following = following;
	}	
	
	
}

