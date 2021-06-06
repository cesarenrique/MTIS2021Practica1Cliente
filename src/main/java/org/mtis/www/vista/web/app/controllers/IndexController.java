package org.mtis.www.vista.web.app.controllers;

import org.mtis.www.validaciones.ValidarNIFResponse;
import org.mtis.www.vista.web.app.clientes.ValidacionesCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@Autowired
	ValidacionesCliente validacionesCliente;
	
	@GetMapping("/index")
	public String index(Model model) {
		
		ValidarNIFResponse response=validacionesCliente.validadNIF("50380203Z");
		
		model.addAttribute("hecho",response.isHecho());
		model.addAttribute("tipo",response.getTipo());
		model.addAttribute("error",response.getError());
		
		
		return "index";
	}
}
