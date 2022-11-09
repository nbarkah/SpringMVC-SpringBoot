/**
 * 
 */
package com.prodemy.springmvc.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

/**
 * @author wyant
 *
 */
public class BaseController {
	protected boolean hasRole(String role, Authentication auth) {
		for (GrantedAuthority a : auth.getAuthorities()) {
			if (a.getAuthority().equals(role)) return true;
		}
		return false;
	}
}
