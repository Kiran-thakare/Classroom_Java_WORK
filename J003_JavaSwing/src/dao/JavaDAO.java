package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conn.JavaConn;
import model.user;

public class JavaDAO {

	Connection con = JavaConn.getConnection();

	public int insertUser(user user) throws SQLException {

		String sql = "INSERT INTO UserInfo(first_name, last_name ,email, mobile_no) VALUES ( ?, ?, ?,?)";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, user.getFirstName());
		ps.setString(2, user.getLastName());
		ps.setString(3, user.getEmail());
		ps.setString(4, user.getMobileNo());

		int affectrow = ps.executeUpdate();

		return affectrow;

	}

	public ResultSet searchUser(user user) throws SQLException {
		String sql = "select * from UserInfo where first_name =? or last_name=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, user.getFirstName());
		ps.setString(2, user.getLastName());

		ResultSet rs = ps.executeQuery();
		return rs;

	}

	public ResultSet alluser(user user) throws SQLException {
		String sql = "select * from UserInfo";
		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery(sql);
		return rs;

	}

	public int updateUser(user user) throws SQLException {

		String sql = "Update UserInfo set first_name=?,last_name=?,mobile_no=? where id=? ";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, user.getFirstName());
		ps.setString(2, user.getLastName());
		ps.setString(3, user.getMobileNo());
		ps.setInt(4, user.getId());

		int affectrow = ps.executeUpdate();

		return affectrow;

	}

	public int deleteUser(user user) throws SQLException {
		String sql = "delete from UserInfo where id=? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, user.getId());
		int affectRow = ps.executeUpdate();
		return affectRow;

	}

}
