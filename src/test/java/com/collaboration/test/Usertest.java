package com.collaboration.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.collaboration.config.DBConfig;
import com.collaboration.dao.Userdao;
import com.collaboration.model.User;

@ComponentScan("com.collaboration")
public class Usertest {

static Userdao  userdao;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(DBConfig.class);
		context.scan("com.collaboration");
		context.refresh();

		userdao=(Userdao)context.getBean("userdao");
	}
	
	@Test
	public void addUserTest()
	{
		User user=new User();
		//user.setUser_id(1);
		user.setUserName("Bhavana");
		user.setFirstName("Bhavana");
	    user.setLastName("Sri");
		user.setContact("8885624411");
		user.setEmail("Bhavana@gmail.com");
		user.setPassword("123");
		user.setRole("Admin");
		assertTrue("Problem in Inserting user", userdao.saveOrUpdate(user));	}

		
	}