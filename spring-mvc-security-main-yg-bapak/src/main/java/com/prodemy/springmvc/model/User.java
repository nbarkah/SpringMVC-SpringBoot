/**
 * 
 */
package com.prodemy.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "usertable")
public class User {
	@Id
	@Column(name = "usrnm", length = 50)
	private String name;
	
	@Column(name = "usrpwd", length = 255)
	private String password;
}
