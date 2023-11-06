package com.metrica.vibely.model;

import java.util.UUID;

public class Post {
	private UUID postId;
	private Integer likes;
	private Integer saved;
	private Integer comments;
	private String userId;
	private String content;
	
	public Post() {
		this.postId   = UUID.randomUUID();
	}
	public Post(int likes, int saved, int comments, String userId, String content) {
		super();
		this.postId   = UUID.randomUUID();
		this.likes 	  = likes;
		this.saved 	  = saved;
		this.comments = comments;
		this.userId   = userId;
		this.content  = content;
	}
	public UUID getPostId() {
		return postId;
	}
	public void setPostId(UUID postId) {
		this.postId = postId;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	public Integer getSaved() {
		return saved;
	}
	public void setSaved(Integer saved) {
		this.saved = saved;
	}
	public Integer getComments() {
		return comments;
	}
	public void setComments(Integer comments) {
		this.comments = comments;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
