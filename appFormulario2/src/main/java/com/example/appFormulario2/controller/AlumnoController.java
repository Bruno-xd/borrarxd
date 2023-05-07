package com.example.appFormulario2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.appFormulario2.Model.Alumno;

@Controller
public class AlumnoController {
	
	@GetMapping("/alumnos")
	public String frmAlumnos(Model model) {
		List<Alumno> lstAlumnos = new ArrayList<>();
		lstAlumnos.add(new Alumno("Pepe", "Pepez", "masho"));
		lstAlumnos.add(new Alumno("AAAAA", "AAAAA", "masho"));
		lstAlumnos.add(new Alumno("BBBBB", "BBBBB", "masho"));
		lstAlumnos.add(new Alumno("CCCCC", "CCCCC", "masho"));
		lstAlumnos.add(new Alumno("DDDDD", "DDDDD", "masho"));
		model.addAttribute("listaalumnos", lstAlumnos);
		
		return "frmAlumnos";
	}

}
