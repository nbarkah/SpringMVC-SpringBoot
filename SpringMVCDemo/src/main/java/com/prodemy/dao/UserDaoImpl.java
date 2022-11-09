package com.prodemy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.prodemy.model.User;
import com.prodemy.dao.UserDaoImpl;

public class UserDaoImpl implements UserDao {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/newlatihan", "postgres", "nb12345");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	@Override
	public int save(User e) {
		int status = 0;
		try {
			Connection con = UserDaoImpl.getConnection();
			PreparedStatement ps = con
					.prepareStatement("insert into user905(name,password,email,country) values (?,?,?,?)");
			ps.setString(1, e.getName());
			ps.setString(2, e.getPassword());
			ps.setString(3, e.getEmail());
			ps.setString(4, e.getCountry());

			status = ps.executeUpdate();

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}

	@Override
	public int update(User e) {
		int status = 0;
		try {
			Connection con = UserDaoImpl.getConnection();
			PreparedStatement ps = con
					.prepareStatement("update user905 set name=?,password=?,email=?,country=? where id=?");
			ps.setString(1, e.getName());
			ps.setString(2, e.getPassword());
			ps.setString(3, e.getEmail());
			ps.setString(4, e.getCountry());
			ps.setInt(5, e.getId());

			status = ps.executeUpdate();

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}

	@Override
	public int delete(int id) {
		int status = 0;
		try {
			Connection con = UserDaoImpl.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from user905 where id=?");
			ps.setInt(1, id);
			status = ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public User findById(int id) {
		User e = new User();

		try {
			Connection con = UserDaoImpl.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from user905 where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPassword(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setCountry(rs.getString(5));
			}
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return e;
	}

	@Override
	public List<User> findAll() {
		List<User> list = new ArrayList<User>();

		try {
			Connection con = UserDaoImpl.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from user905");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				User e = new User();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPassword(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setCountry(rs.getString(5));
				list.add(e);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
}
