package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author Barkah
 *
 */

@SpringBootApplication
public class SpringJdbcPostgreSqlApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcPostgreSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO mahasiswa (mhs_id, mhs_nim, mhs_nama, mhs_alamat) VALUES ('003', '1301170003', 'Caca2', 'SUKABUMI')";
		
		int rows = jdbcTemplate.update(sql);
		if (rows > 0) {
			System.out.println("row baru telah dimasukkan");
		}
	}

}