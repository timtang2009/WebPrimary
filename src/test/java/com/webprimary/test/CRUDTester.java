package com.webprimary.test;

import org.junit.Assert;
import org.junit.Test;

import com.webprimary.model.User;

public class CRUDTester extends BaseTest {

	@Test
	public void testInsert() {
		User user = new User();
		user.setName("Kobe");
		user.setAge(38);
		user.setEmail("kobe_bryant@gmail.com");
		user.setPassword("password");
		userService.insertUser(user);
		User user2 = userService.getUser(1);
		Assert.assertEquals(user2.getName(), "Kobe");
	}
	
}
