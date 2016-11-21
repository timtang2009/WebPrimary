package com.webprimary.test;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Assert;
import org.junit.Test;

import com.webprimary.model.User;

public class CRUDTester extends BaseTest {

	@Test
	public void testInsert() {
		User user = new User();
		user.setId(2);
		user.setName("Kobe");
		user.setAge(38);
		user.setEmail("kobe_bryant@gmail.com");
		user.setPassword("password");
		userService.insertUser(user);
		User user2 = userService.getUser(1);
		Map<String, Object> map = new TreeMap<>();
		Assert.assertEquals(user2.getName(), "Kobe");
	}
	
	@Test
	public void test2() {
		Integer a = 3;
		System.out.println(a.hashCode());
	}
}
