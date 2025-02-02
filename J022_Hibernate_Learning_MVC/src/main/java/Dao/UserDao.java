package Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.User;

public class UserDao {

	SessionFactory sf = null;

	public UserDao() {
		sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
	}

	public int userRegister(User user) {
		int i = 0;
		Transaction tx = null;

		try {
			Session s = sf.openSession();
			tx = s.beginTransaction();
			s.saveOrUpdate(user);
			tx.commit();
			i = 1;
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}

		return i;

	}

	public List<User> showUsers() {

		Session s = sf.openSession();

		return s.createQuery("from User").list();
	}

	public int userDelete(int id) {
		int i = 0;

		Transaction tx=null;
		try {
			Session s = sf.openSession();
			tx=s.beginTransaction();
			s.delete(s.get(User.class, id));
			tx.commit();
			i = 1;
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}

		return i;
	}

	public User findUserById(int id) {
		User user = null;
		try {
			Session s = sf.openSession();
			user = s.get(User.class, id);
		} catch (Exception e) {
			// TODO: handle exception
		}

		return user;
	}
}
