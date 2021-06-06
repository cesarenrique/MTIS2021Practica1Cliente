package org.mtis.www.vista.web.app.controllers;

import java.util.ArrayList;

import org.mtis.www.controlPresencia.ControlEmpleadosSala;
import org.mtis.www.controlPresencia.ControlEmpleadosSalaResponse;
import org.mtis.www.controlPresencia.EliminarResponse;
import org.mtis.www.controlPresencia.RegistrarResponse;
import org.mtis.www.vista.web.app.clientes.ControlPresenciaCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControlPresenciaController {
	
	@Autowired
	private ControlPresenciaCliente controlPresenciaCliente;
	
	@GetMapping("/controlpresencia/registrar")
	public String formPresenciaRegistrar(@ModelAttribute ControlPresenciaData controlPresenciaData ) {
		return "formControlPresenciaRegistrar";
	}
	
	@PostMapping("/controlpresencia/registrar")
	public String controlPresenciaRegistrar(@ModelAttribute ControlPresenciaData controlPresenciaData, Model model) {
		RegistrarResponse response=controlPresenciaCliente.controlPresenciaRegistrar(controlPresenciaData);
		
		model.addAttribute("hecho",response.isHecho());
		model.addAttribute("tipo",response.getTipo());
		model.addAttribute("error",response.getError());
		return "resultadoNormal";
	}
	
	@GetMapping("/controlpresencia/eliminar")
	public String formPresenciaEliminar(@ModelAttribute ControlPresenciaData controlPresenciaData ) {
		return "formControlPresenciaEliminar";
	}
	
	@PostMapping("/controlpresencia/eliminar")
	public String controlPresenciaEliminar(@ModelAttribute ControlPresenciaData controlPresenciaData, Model model) {
		EliminarResponse response=controlPresenciaCliente.controlPresenciaEliminar(controlPresenciaData);
		
		model.addAttribute("hecho",response.isHecho());
		model.addAttribute("tipo",response.getTipo());
		model.addAttribute("error",response.getError());
		return "resultadoNormal";
	}
	
	@GetMapping("/controlpresencia/sala")
	public String formPresenciaSala(@ModelAttribute ValidarData validarData ) {
		return "formControlPresenciaSala";
	}
	
	@PostMapping("/controlpresencia/sala")
	public String controlPresenciaSala(@ModelAttribute ValidarData validarData, Model model) {
		ControlEmpleadosSalaResponse response=controlPresenciaCliente.controlPresenciaConsultar(validarData.getDato());
		
		model.addAttribute("hecho",response.isHecho());
		model.addAttribute("tipo",response.getTipo());
		model.addAttribute("error",response.getError());
		
		if(response.getTipo()!=200) {		
			return "resultadoNormal";
		}
		ArrayList<String> usuarios=new ArrayList<>(response.getUsuario());
		model.addAttribute("usuarios",usuarios);
		
		return "resultadoPresenciaSala";
		
	}

}
