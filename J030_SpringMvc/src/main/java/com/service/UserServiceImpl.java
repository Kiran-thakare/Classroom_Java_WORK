package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;

	@Override
	public void addUser(User u) {

		dao.addUser(u);
	}

	@Override
	public List<User> allUser() {

		return dao.allUser();
	}

	@Override
	public void delete(int id) {
		dao.delete(id);

	}

	@Override
	public User userById(int id) {

		return dao.userById(id);
	}

}
