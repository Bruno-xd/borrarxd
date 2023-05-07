package com.example.appFormulario2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PromedioController {
	
	@GetMapping("/promedio")
	public String frmPromedioNotas(Model model) {
		return "frmPromedio";
	}

}
