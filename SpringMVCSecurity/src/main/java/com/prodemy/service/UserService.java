/**
 * 
 */
package com.prodemy.service;

import java.util.List;

import com.prodemy.model.Role;
import com.prodemy.model.User;

/**
 * @author wyant
 *
 */
public interface UserService {
	public User findByName(String name);
	public User update(User user);
	public List<Role> findUserRoles(String userName);
}
