package org.mtis.www.vista.web.app.controllers;

import java.util.ArrayList;

import org.mtis.www.controlAcceso.ConsultarResponse;
import org.mtis.www.controlAcceso.RegistrarResponse;
import org.mtis.www.vista.web.app.clientes.ControlAccesoCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControlAccesoController {

	@Autowired
	private ControlAccesoCliente controlAccesoCliente;
	
	@GetMapping("/controlacceso/registrar")
	public String formEmpleadoNuevo(@ModelAttribute EntidadAccesoData entidadAccesoData ) {
		return "formControlAccesoRegistrar";
	}
	
	@PostMapping("/controlacceso/registrar")
	public String controlAccesoRegistrar(@ModelAttribute EntidadAccesoData entidad, Model model) {
		RegistrarResponse response=controlAccesoCliente.controlAccesoRegistrar(entidad);
		
		model.addAttribute("hecho",response.isHecho());
		model.addAttribute("tipo",response.getTipo());
		model.addAttribute("error",response.getError());
		return "resultadoNormal";
	}
	
	@GetMapping("/controlacceso/consultar")
	public String formEmpleadoConsultar(@ModelAttribute EntidadAccesoFechasData entidadAccesoFechasData ) {
		return "formControlAccesoConsultar";
	}
	
	@PostMapping("/controlacceso/consultar")
	public String controlAccesoConsultar(@ModelAttribute EntidadAccesoFechasData entidad, Model model) {
		ConsultarResponse response=controlAccesoCliente.controlAccesoConsultar(entidad);
	
		model.addAttribute("hecho",response.isHecho());
		model.addAttribute("tipo",response.getTipo());
		model.addAttribute("error",response.getError());
		
		if(response.getTipo()!=200) {
			return "resultadoNormal";
	
		}
		ArrayList<ConsultarResponse.Entidad> entidades=new ArrayList<>(response.getRegistro());
		model.addAttribute("entidades",entidades);
		return "resultadoControlAccesos";
	}
}
