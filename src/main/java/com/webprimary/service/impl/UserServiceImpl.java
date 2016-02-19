package com.webprimary.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webprimary.dao.UserDao;
import com.webprimary.model.User;
import com.webprimary.service.UserService;

@Service
public class UserServiceImpl implements UserService{
 
    @Autowired
    private UserDao userDao;
     
    @Override
    public void insertUser(User user) {
        // TODO Auto-generated method stub
        userDao.insertUser(user);
    }

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return userDao.getUser(id);
	}

}