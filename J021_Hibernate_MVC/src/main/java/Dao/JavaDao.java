package Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import Model.Student;

public class JavaDao {

	SessionFactory sf;

	public JavaDao() {
		sf = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
	}

	public int addStudent(Student st) {
		int i = 0;
		Transaction tx = null;
		try {
			Session s = sf.openSession();
			tx = s.beginTransaction();
			s.saveOrUpdate(st);
			tx.commit();
			i = 1;
		} catch (Exception e) {
			tx.rollback();
		}

		return i;
	}

	public List<Student> showStudents() {
		List<Student> view = new ArrayList<>();
		Transaction tx = null;
		try {
			Session s = sf.openSession();
			tx = s.beginTransaction();
			view = s.createQuery("from Student").list();
			tx.commit();

		} catch (Exception e) {
			tx.rollback();
		}
		return view;
	}

	public int deleteStudent(int uid) {

		int i = 0;
		Transaction tx = null;
		try {
			Session s = sf.openSession();
			tx = s.beginTransaction();
			Student st = s.get(Student.class, uid);
			s.delete(st);
			tx.commit();
			i=1;
		} catch (Exception e) {
			// TODO: handle exception
		}

		return i;

	}

	public Student getStudentById(int uid) {

		Session s = sf.openSession();
		Student st = s.get(Student.class, uid);

		return st;

	}

	public int updateStudent(Student st) {
		int i = 0;

		Transaction tx = null;
		try {
			Session s = sf.openSession();
			tx = s.beginTransaction();
			s.saveOrUpdate(st);
			tx.commit();
			i = 1;
		} catch (Exception e) {
			tx.rollback();
		}

		return i;

	}

	public Student checkDetails(Student st) {
		Student std = null;
		Session s = sf.openSession();
		Query q1 = s.createQuery("from Student where email=:e and pass=:p");
		q1.setParameter("e", st.getEmail());
		q1.setParameter("p", st.getPass());

		std = (Student) q1.uniqueResult();

		return std;

	}

}
