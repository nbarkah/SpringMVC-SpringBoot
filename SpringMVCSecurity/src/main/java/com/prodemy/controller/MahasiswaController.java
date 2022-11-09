package com.prodemy.controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.prodemy.model.Mahasiswa;
import com.prodemy.service.MahasiswaService;

@Controller
public class MahasiswaController {

	@Autowired
	private MahasiswaService mahasiswaService;
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/mahasiswas", method = RequestMethod.GET)
	public String listMahasiswas(Model model) {
		model.addAttribute("mahasiswa", new Mahasiswa());
		model.addAttribute("listMahasiswas", this.mahasiswaService.listMahasiswas());
		return "mahasiswa";
	}

	// For add and update phone both
	@RequestMapping(value = "/mahasiswa/add", method = RequestMethod.POST)
	public String addMahasiswa(@ModelAttribute("mahasiswa") Mahasiswa p) {
		if (p.getId() == 0) {
			// new phone, add it
			this.mahasiswaService.addMahasiswa(p);
		} else {
			// existing phone, call update
			this.mahasiswaService.updateMahasiswa(p);
		}
		return "redirect:/mahasiswas";
	}

	@RequestMapping("/remove/{mhs_id}")
	public String removeMahasiswa(@PathVariable("mhs_id") int mhs_id) {
		this.mahasiswaService.removeMahasiswa(mhs_id);
		return "redirect:/mahasiswas";
	}

	@RequestMapping("/edit/{mhs_id}")
	public String editMahasiswa(@PathVariable("mhs_id") int mhs_id, Model model) {
		model.addAttribute("mahasiswa", this.mahasiswaService.getMahasiswaById(mhs_id));
		model.addAttribute("listMahasiswas", this.mahasiswaService.listMahasiswas());
		return "mahasiswa";
	}
	
	
}
