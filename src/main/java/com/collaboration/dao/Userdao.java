package com.collaboration.dao;

import java.util.List;

import com.collaboration.model.User;

public interface Userdao {
	
	public boolean saveOrUpdate(User user);
	public User updateUser(User user);
	public void delete(User user);
	public User getUser(String username);
	public User viewUser(int userid);
	public List<User> UserList();
	public User login(User user);
	public boolean isUsernameValid(String username);
	public boolean isEmailValid(String email);

	
}