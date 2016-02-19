package com.webprimary.test;

import org.junit.Assert;
import org.junit.Test;

import com.webprimary.model.User;

public class CRUDTester extends BaseTest {

	@Test
	public void testInsert() {
		User user = new User();
		user.setName("Tim");
		user.setAge(26);
		user.setEmail("timtang_09@hotmail.com");
		user.setPassword("password");
		userService.insertUser(user);
		User user2 = userService.getUser(1);
		Assert.assertEquals(user2.getName(), "Tim");
	}
	
}
