package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import model.User;
import util.Dbconnection;

public class UserDao {

	Connection con;

	public UserDao() {
		con = Dbconnection.getConnection();
	}

	public ArrayList<User> displayUser() {
		ArrayList<User> list = new ArrayList();

		try {
			PreparedStatement ps = con.prepareStatement("select * from userrec");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User u = new User();
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPhone(rs.getString(4));
				list.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public int adduser(User u) {
		int i = 0;
		try {
			PreparedStatement ps = con.prepareStatement("insert into userrec (uname,email,phone)values(?,?,?)");
			ps.setString(1, u.getName());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPhone());

			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public int updateUser(User u) {
		int i = 0;
		try {
			PreparedStatement ps = con.prepareStatement("update userrec set uname=?,email=?,phone=? where id=?");
			ps.setString(1, u.getName());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPhone());
			ps.setInt(4, u.getId());

			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public User userSerchById(int id) {
		User u=new User();
		
		try {
			PreparedStatement ps=con.prepareStatement("select * from userrec where id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPhone(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return u;
	}

	public int deleteUser(int id) {
		int i=0;
		try {
			PreparedStatement ps=con.prepareStatement("delete from userrec where id=?");
			ps.setInt(1, id);
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public ArrayList<User> searchUser(String name) {
		ArrayList<User> list=new ArrayList<User>();
		
		try {
			PreparedStatement ps=con.prepareStatement("select * from userrec where uname like ?");
			ps.setString(1, name+"%");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				User u=new User();
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPhone(rs.getString(4));
				list.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
