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
@Table(name = "mahasiswa", schema = "task1")
public class Mahasiswa {
	@Id
	@Column(name = "mhs_id")
	private String id;
	
	@Column(name = "mhs_nim")
	private String nim;
	
	@Column(name = "mhs_nama")
	private String nama;
	
	@Column(name = "mhs_alamat")
	private String alamat;
}
