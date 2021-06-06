package org.mtis.www.vista.web.app.controllers;

import org.mtis.www.validaciones.ValidarIBANResponse;
import org.mtis.www.validaciones.ValidarNAFSSResponse;
import org.mtis.www.validaciones.ValidarNIFResponse;
import org.mtis.www.vista.web.app.clientes.ValidacionesCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ValidacionesController {
	
	@Autowired
	ValidacionesCliente validacionesCliente;
	
	@GetMapping("/validaciones/validarNIF")
	public String formValidarNIF(@ModelAttribute ValidarData validarData, Model model) {
		
		return "formValidarNIF";
	}
	
	
	@PostMapping("/validaciones/validarNIF")
	public String validadoValidarNIF(@ModelAttribute ValidarData validarData, Model model) {
		
		ValidarNIFResponse response=validacionesCliente.validadNIF(validarData.getDato());
		model.addAttribute("validado",response.isValido());
		model.addAttribute("hecho",response.isHecho());
		model.addAttribute("tipo",response.getTipo());
		model.addAttribute("error",response.getError());
		
		
		return "resultadoValidacion";
	}
	
	@GetMapping("/validaciones/validarIBAN")
	public String formValidarIBAN(@ModelAttribute ValidarData validarData, Model model) {
		
		return "formValidarIBAN";
	}
	
	
	@PostMapping("/validaciones/validarIBAN")
	public String validadoValidarIBAN(@ModelAttribute ValidarData validarData, Model model) {
		
		ValidarIBANResponse response=validacionesCliente.validadIBAN(validarData.getDato());
		model.addAttribute("validado",response.isValido());
		model.addAttribute("hecho",response.isHecho());
		model.addAttribute("tipo",response.getTipo());
		model.addAttribute("error",response.getError());
		
		
		return "resultadoValidacion";
	}
	
	
	@GetMapping("/validaciones/validarNAFSS")
	public String formValidarNAFSS(@ModelAttribute ValidarData validarData, Model model) {
		
		return "formValidarNAFSS";
	}
	
	
	@PostMapping("/validaciones/validarNAFSS")
	public String validadoValidarNAFSS(@ModelAttribute ValidarData validarData, Model model) {
		
		ValidarNAFSSResponse response=validacionesCliente.validadNAFSS(validarData.getDato());
		model.addAttribute("validado",response.isValido());
		model.addAttribute("hecho",response.isHecho());
		model.addAttribute("tipo",response.getTipo());
		model.addAttribute("error",response.getError());
		
		
		return "resultadoValidacion";
	}
}
