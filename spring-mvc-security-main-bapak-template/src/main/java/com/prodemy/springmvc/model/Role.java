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
@Table(name = "role")
public class Role {
	@Id
	@Column(name = "rlid", length = 50)
	private String id;
	
	@Column(name = "rlnm", length = 100)
	private String name;
}
