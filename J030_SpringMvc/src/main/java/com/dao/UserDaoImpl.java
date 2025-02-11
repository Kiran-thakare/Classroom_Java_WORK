package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
	@Autowired
	SessionFactory sf;

	@Override
	public void addUser(User u) {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		s.saveOrUpdate(u);
		tx.commit();
	}

	@Override
	public List<User> allUser() {
		Session s = sf.openSession();
		return s.createQuery("from User").list();
	}

	@Override
	public void delete(int id) {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		s.delete(s.get(User.class, id));
		tx.commit();

	}

	@Override
	public User userById(int id) {
		Session s = sf.openSession();
		return s.get(User.class, id);
	}

}
