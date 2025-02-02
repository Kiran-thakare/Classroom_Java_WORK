package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Student;
import Util.DBConn;

public class JavaDao {

	Connection con;

	public JavaDao() {
		con = DBConn.getConnection();
	}

	public int addStudent(Student st) {
		int i = 0;

		try {
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, st.getName());
			ps.setString(3, st.getEmail());
			ps.setString(4, st.getPass());

			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public ArrayList<Student> showStudents() {
		ArrayList<Student> view = new ArrayList<>();

		try {
			PreparedStatement ps = con.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student st = new Student();
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setEmail(rs.getString(3));
				st.setPass(rs.getString(4));
				view.add(st);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return view;

	}

	public int deleteStudent(int uid) {
		int i = 0;
		try {
			PreparedStatement ps = con.prepareStatement("delete from student where id=?");
			ps.setInt(1, uid);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public Student getStudentById(int uid) {

		Student st = new Student();
		try {
			PreparedStatement ps = con.prepareStatement("Select * from student where id=?");
			ps.setInt(1, uid);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				st.setId(rs.getInt("id"));
				st.setName(rs.getString("name"));
				st.setEmail(rs.getString("email"));
				st.setPass(rs.getString("pass"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return st;
	}

	public int updateStudent(Student st) {

		int i = 0;

		try {
			PreparedStatement ps = con.prepareStatement("update student set name=?,email=?,pass=? where id=?");
			ps.setString(1, st.getName());
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

	public Student checkDetails(Student st) {
		Student std = new Student();

		try {
			PreparedStatement ps = con.prepareStatement("select * from student where email=? and pass=?");
			ps.setString(1, st.getEmail());
			ps.setString(2, st.getPass());
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				std.setEmail(rs.getString(3));
				std.setPass(rs.getString(4));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return std;
	}

}
