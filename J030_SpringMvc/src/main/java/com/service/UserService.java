package com.service;

import java.util.List;

import com.model.User;


public interface UserService {

	public void addUser(User u);

	public List<User> allUser();

	public void delete(int id);

	public User userById(int id);
}
