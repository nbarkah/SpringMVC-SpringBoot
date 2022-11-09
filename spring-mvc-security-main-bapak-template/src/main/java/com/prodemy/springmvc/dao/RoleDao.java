/**
 * 
 */
package com.prodemy.springmvc.dao;

import java.util.List;

import com.prodemy.springmvc.model.Role;

/**
 * @author wyant
 *
 */
public interface RoleDao {
	public List<Role> findUserRoles(String userName);
}
