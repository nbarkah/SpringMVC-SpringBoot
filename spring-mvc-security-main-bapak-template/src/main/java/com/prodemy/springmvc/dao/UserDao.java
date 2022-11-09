/**
 * 
 */
package com.prodemy.springmvc.dao;

import com.prodemy.springmvc.model.User;

/**
 * @author wyant
 *
 */
public interface UserDao {
	public User findByName(String name);
	public User update(User user);
}
