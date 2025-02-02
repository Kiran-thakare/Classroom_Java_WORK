package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Student;
import util.DbCon;

public class JavaDao {

	Connection con;

	public JavaDao() {
		con = DbCon.getConeConnection();
	}

	public int registerStudent(Student st) {
		int i = 0;

		try {
			PreparedStatement ps = con.prepareStatement("insert into Register1 values(?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, st.getUname());
			ps.setString(3, st.getEmail());
			ps.setString(4, st.getPass());

			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	public Student checkUser(Student st) {

		Student std = new Student();

		try {
			PreparedStatement ps = con.prepareStatement("select * from Register1 where email=? and pass=?");
			ps.setString(1, st.getEmail());
			ps.setString(2, st.getPass());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				std.setEmail(rs.getString(3));
				std.setPass(rs.getString(4));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return std;
	}

	public ArrayList<Student> showUser() {

		ArrayList<Student> user = new ArrayList();

		try {
			PreparedStatement ps = con.prepareStatement("select * from Register1");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student st = new Student();
				st.setId(rs.getInt(1));
				st.setUname(rs.getString(2));
				st.setEmail(rs.getString(3));
				user.add(st);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;

	}

	public int deleteUser(int id) {
		int i = 0;

		try {
			PreparedStatement ps = con.prepareStatement("delete from Register1 where id=?");
			ps.setInt(1, id);
			i = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	public Student getStudentById(int id) {

		Student st = new Student();

		try {
			PreparedStatement ps = con.prepareStatement("select * from Register1 where id=?");
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				st.setId(rs.getInt(1));
				st.setUname(rs.getString(2));
				st.setEmail(rs.getString(3));
				st.setPass(rs.getString(4));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return st;

	}

	public int updateUser(Student st) {

		int i = 0;

		try {
			PreparedStatement ps = con.prepareStatement("update Register1 set uname=?,email=?,pass=? where id=?");
			ps.setString(1, st.getUname());
			ps.setString(2, st.getEmail());
			ps.setString(3, st.getPass());
			ps.setInt(4, st.getId());
			i = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;

	}

}
