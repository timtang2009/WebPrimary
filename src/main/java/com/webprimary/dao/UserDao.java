package com.webprimary.dao;

import com.webprimary.model.User;

public interface UserDao {

	public void insertUser(User user);
	
	public User getUser(int id);
}
