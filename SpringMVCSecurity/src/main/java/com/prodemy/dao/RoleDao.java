/**
 * 
 */
package com.prodemy.dao;

import java.util.List;

import com.prodemy.model.Role;

/**
 * @author wyant
 *
 */
public interface RoleDao {
	public List<Role> findUserRoles(String userName);
}
