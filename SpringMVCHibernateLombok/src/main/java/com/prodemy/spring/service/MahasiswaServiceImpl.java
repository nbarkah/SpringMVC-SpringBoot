package com.prodemy.spring.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prodemy.spring.dao.MahasiswaDAO;
import com.prodemy.spring.dao.MahasiswaDAOImpl;
import com.prodemy.spring.model.Mahasiswa;

@Service
@Transactional
public class MahasiswaServiceImpl implements MahasiswaService {
	@Autowired
	private MahasiswaDAO mahasiswaDAO;

	@Override
	@Transactional
	public void addMahasiswa(Mahasiswa p) {
		this.mahasiswaDAO.addMahasiswa(p);
	}

	@Override
	@Transactional
	public void updateMahasiswa(Mahasiswa p) {
		this.mahasiswaDAO.updateMahasiswa(p);
	}

	@Override
	@Transactional
	public List<Mahasiswa> listMahasiswas() {
		return this.mahasiswaDAO.listMahasiswas();
	}

	@Override
	@Transactional
	public Mahasiswa getMahasiswaById(int id) {
		return this.mahasiswaDAO.getMahasiswaById(id);
	}

	@Override
	@Transactional
	public void removeMahasiswa(int id) {
		this.mahasiswaDAO.removeMahasiswa(id);
	}

}
