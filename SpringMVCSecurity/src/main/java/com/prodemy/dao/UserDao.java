/**
 * 
 */
package com.prodemy.dao;

import com.prodemy.model.User;

/**
 * @author wyant
 *
 */
public interface UserDao {
	public User findByName(String name);
	public User update(User user);
}
