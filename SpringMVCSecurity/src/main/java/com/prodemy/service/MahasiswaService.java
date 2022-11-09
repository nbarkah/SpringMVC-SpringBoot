package com.prodemy.service;

import java.util.List;
import com.prodemy.model.Mahasiswa;

public interface MahasiswaService {
	public void addMahasiswa(Mahasiswa p);
	public void updateMahasiswa(Mahasiswa p);
	public List<Mahasiswa> listMahasiswas();
	public Mahasiswa getMahasiswaById(int id);
	public void removeMahasiswa(int id);
	
	
}
