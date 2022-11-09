package com.prodemy.dao;

import java.util.List;

import com.prodemy.model.User;

public interface UserDao {
	public int save(User e);
	public int update(User e);
	public int delete(int id);
	public User findById(int id);
	public List<User> findAll();
}