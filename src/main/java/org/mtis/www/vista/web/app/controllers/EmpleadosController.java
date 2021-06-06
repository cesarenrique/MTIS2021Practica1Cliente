package org.mtis.www.vista.web.app.controllers;


import org.mtis.www.empleados.BorrarResponse;
import org.mtis.www.empleados.ConsultarResponse;
import org.mtis.www.empleados.ModificarResponse;
import org.mtis.www.empleados.NuevoResponse;
import org.mtis.www.vista.web.app.clientes.EmpleadosCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpleadosController {

	@Autowired
	private EmpleadosCliente empleadosCliente;
	
	
	@GetMapping("/empleados/nuevo")
	public String formEmpleadoNuevo(@ModelAttribute EmpleadoData empleadoData ) {
		return "formEmpleado";
	}
	
	@PostMapping("/empleados/nuevo")
	public String empleadoNuevo(@ModelAttribute EmpleadoData empleadoData, Model model) {
		NuevoResponse response=empleadosCliente.crearNuevoEmpleado(empleadoData);
		
		model.addAttribute("hecho",response.isHecho());
		model.addAttribute("tipo",response.getTipo());
		model.addAttribute("error",response.getError());
		return "resultadoNormal";
	}
	
	
	@GetMapping("/empleados/consultar")
	public String formEmpleadoConsultar(@ModelAttribute ValidarData validarData) {
		return "formEmpleadoConsulta";
	}
	
	@PostMapping("/empleados/consultar")
	public String empleadoConsultar(@ModelAttribute ValidarData validarData, @ModelAttribute EmpleadoData empleadoData, Model model) {
		ConsultarResponse response=empleadosCliente.consultarEmpleado(validarData.getDato());
		model.addAttribute("hecho",response.isHecho());
		model.addAttribute("tipo",response.getTipo());
		model.addAttribute("error",response.getError());
		
		if(response.getTipo()!=200) {
			return "resultadoNormal";
		}
		empleadoData=new EmpleadoData(response);
		
		model.addAttribute("empleado", empleadoData);

		return "resultadoEmpleado";
	}
	
	
	@GetMapping("/empleados/modificar")
	public String formEmpleadoMoficar(@ModelAttribute ValidarData validarData ) {
		
		return "formEmpleadoModificarfase1";
	}
	
	
	@PostMapping("/empleados/modificar")
	public String formEmpleadoMoficar( @ModelAttribute ValidarData validarData,@ModelAttribute EmpleadoData empleadoData,Model model) {
		ConsultarResponse response=empleadosCliente.consultarEmpleado(validarData.getDato());
	
		model.addAttribute("hecho",response.isHecho());
		model.addAttribute("tipo",response.getTipo());
		model.addAttribute("error",response.getError());
		
		if(response.getTipo()!=200) {
			return "resultadoNormal";
		}
		empleadoData.transferirDatos(response);
		
		return "formEmpleadoModificarfase2";
	}
	
	@PostMapping("/empleados/modificar2")
	public String empleadoModificar(@ModelAttribute EmpleadoData empleadoData, Model model) {
		ModificarResponse response=empleadosCliente.modificarEmpleado(empleadoData);
		model.addAttribute("hecho",response.isHecho());
		model.addAttribute("tipo",response.getTipo());
		model.addAttribute("error",response.getError());
		return "resultadoNormal";
	}

	@GetMapping("/empleados/borrar")
	public String formEmpleadoBorrar(@ModelAttribute ValidarData validarData) {
		return "formEmpleadoBorrar";
	}
	
	@PostMapping("/empleados/borrar")
	public String empleadoBorrar(@ModelAttribute ValidarData validarData, @ModelAttribute EmpleadoData empleadoData, Model model) {
		BorrarResponse response=empleadosCliente.borrarEmpleado(validarData.getDato());
		model.addAttribute("hecho",response.isHecho());
		model.addAttribute("tipo",response.getTipo());
		model.addAttribute("error",response.getError());
		return "resultadoNormal";
	}
}
