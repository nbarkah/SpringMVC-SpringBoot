/**
 * 
 */
package com.prodemy.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodemy.dao.RoleDao;
import com.prodemy.dao.UserDao;
import com.prodemy.model.Role;
import com.prodemy.model.User;

/**
 * @author wyant
 *
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired UserDao userDao;
	@Autowired RoleDao roleDao;
	
	@Override
	public User findByName(String name) {
		return this.userDao.findByName(name);
	}

	@Override
	public User update(User user) {
		return this.userDao.update(user);
	}

	@Override
	public List<Role> findUserRoles(String userName) {
		return this.roleDao.findUserRoles(userName);
	}

}
