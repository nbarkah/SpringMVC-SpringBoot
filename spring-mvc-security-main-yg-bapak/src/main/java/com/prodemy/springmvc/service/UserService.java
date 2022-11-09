/**
 * 
 */
package com.prodemy.springmvc.service;

import java.util.List;

import com.prodemy.springmvc.model.Role;
import com.prodemy.springmvc.model.User;

/**
 * @author wyant
 *
 */
public interface UserService {
	public User findByName(String name);
	public User update(User user);
	public List<Role> findUserRoles(String userName);
}
