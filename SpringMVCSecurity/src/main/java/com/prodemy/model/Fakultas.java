package com.prodemy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "FAKULTAS")
public class Fakultas {

	@Id
	@Column(name = "fk_id")
	@SequenceGenerator(name = "pk_fakultas", sequenceName = "fakultas_fk_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_fakultas")
	private int id;

	@Column(name = "fk_kode")
	private String kode;

	@Column(name = "fk_nama")
	private String nama;

	@Column(name = "fk_dekan")
	private String dekan;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getDekan() {
		return dekan;
	}

	public void setDekan(String dekan) {
		this.dekan = dekan;
	}

	@Override
	public String toString() {
		return "Fakultas [id=" + id + ", kode=" + kode + ", nama=" + nama + ", dekan=" + dekan + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fakultas other = (Fakultas) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
