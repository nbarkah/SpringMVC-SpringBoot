/**
 * 
 */
package com.prodemy.springmvc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.prodemy.springmvc.dao.MahasiswaDao;
import com.prodemy.springmvc.model.Mahasiswa;


@Repository
public class MahasiswaDaoImpl implements MahasiswaDao {
	private Connection con = null;
	private String url = "jdbc:postgresql://localhost/newlatihan";
	private String username = "postgres";
	private String password = "nb12345";

	public MahasiswaDaoImpl() {
		try {
			Class.forName("org.postgresql.Driver");			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Connection getConnection() throws Exception {
		if (con!=null) {
			if (con.isClosed()) {
				con = DriverManager.getConnection(url, username, password);
			}
		} else {
			con = DriverManager.getConnection(url, username, password);
		}
		return con;
	}
	
	@Override
	public Mahasiswa findById(int id) throws Exception {
		Mahasiswa result = null;

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			StringBuilder query = new StringBuilder("SELECT * FROM mahasiswa WHERE mhs_id=?");
			ps = getConnection().prepareStatement(query.toString());
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				result = new Mahasiswa();
				result.setNim(rs.getString("mhs_nim"));
				result.setNama(rs.getString("mhs_nama"));
				result.setAlamat(rs.getString("mhs_alamat"));
			}
		} finally {
			try {
				rs.close();
			} catch (Exception ignored) {}
			try {
				ps.close();
			} catch (Exception ignored) {}
		}
		
		return result;
	}

	@Override
	public void deleteById(int id) throws Exception {
		PreparedStatement ps = null;
		
		try {
			StringBuilder query = new StringBuilder("DELETE FROM mahasiswa WHERE mhs_id=?");
			ps = getConnection().prepareStatement(query.toString());
			ps.setInt(1, id);
			ps.executeUpdate();
		} finally {
			try {
				ps.close();
			} catch (Exception ignored) {}			
		}
	}

	@Override
	public void insert(Mahasiswa mhs) throws Exception {
		PreparedStatement ps = null;
		
		try {
			StringBuilder query = new StringBuilder("INSERT INTO mahasiswa (mhs_nim,mhs_nama,mhs_alamat) VALUES (?,?,?)");
			ps = getConnection().prepareStatement(query.toString());
			ps.setString(1, mhs.getNim());
			ps.setString(2, mhs.getNama());
			ps.setString(3, mhs.getAlamat());
			ps.executeUpdate();
		} finally {
			try {
				ps.close();
			} catch (Exception ignored) {}			
		}
	}

	@Override
	public void update(Mahasiswa mhs) throws Exception {
		PreparedStatement ps = null;
		
		try {
			StringBuilder query = new StringBuilder("UPDATE mahasiswa SET mhs_nim=?, mhs_nama=?, mhs_alamat=? WHERE mhs_id=?");
			ps = getConnection().prepareStatement(query.toString());
			ps.setString(1, mhs.getNim());
			ps.setString(2, mhs.getNama());
			ps.setString(3, mhs.getAlamat());
			ps.executeUpdate();
		} finally {
			try {
				ps.close();
			} catch (Exception ignored) {}			
		}
	}

	@Override
	public List<Mahasiswa> findAll() throws Exception {
		List<Mahasiswa> result = null;

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			StringBuilder query = new StringBuilder("SELECT * FROM mahasiswa");
			ps = getConnection().prepareStatement(query.toString());
			rs = ps.executeQuery();
			if (rs.next()) {
				result = new ArrayList<>();
				do {
					Mahasiswa mhs = new Mahasiswa();
					mhs.setNim(rs.getString("mhs_nim"));
					mhs.setNama(rs.getString("mhs_nama"));
					mhs.setAlamat(rs.getString("mhs_alamat"));
					
					result.add(mhs);
				} while (rs.next());
			}
		} finally {
			try {
				rs.close();
			} catch (Exception ignored) {}
			try {
				ps.close();
			} catch (Exception ignored) {}
		}
		
		return result;	}

}
