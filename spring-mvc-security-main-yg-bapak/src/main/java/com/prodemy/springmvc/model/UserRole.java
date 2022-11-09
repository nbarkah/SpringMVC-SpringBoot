/**
 * 
 */
package com.prodemy.springmvc.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wyant
 *
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "user_role")
public class UserRole {
	@EmbeddedId
	private UserRoleId id;
}
