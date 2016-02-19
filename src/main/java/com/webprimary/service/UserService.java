package com.webprimary.service;

import com.webprimary.model.User;

public interface UserService {
	 
    public void insertUser(User user);
    
    public User getUser(int id);
}
