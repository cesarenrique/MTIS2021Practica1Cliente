package org.mtis.www.vista.web.app.controllers;

public class EmpleadoData {

	private String NIF;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String poblacion;
	private String telefono;
	private String email;
	private String fechaNacimiento;
	private String naf;
	private String iban;
	private String nivel;
	private String usuario;
	private String password;
	private String valido;
	
	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNaf() {
		return naf;
	}

	public void setNaf(String naf) {
		this.naf = naf;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getValido() {
		return valido;
	}

	public void setValido(String valido) {
		this.valido = valido;
	}

	public EmpleadoData() {
		
	}
	
	public EmpleadoData(org.mtis.www.empleados.ConsultarResponse response) {
	
		NIF=response.getNIF();
		nombre=response.getNombre();
		apellidos=response.getApellidos();
		direccion=response.getDireccion();
		poblacion=response.getPoblacion();
		telefono=response.getTelefono();
		email=response.getEmail();
		fechaNacimiento=response.getFechaNacimiento();
		naf=response.getNaf();
		iban=response.getIban();
		nivel=response.getNivel();
		usuario=response.getUsuario();
		password=response.getPassword();
		valido=response.getValido();
	
	}
	
	
	public void transferirDatos(org.mtis.www.empleados.ConsultarResponse response) {
		
		NIF=response.getNIF();
		nombre=response.getNombre();
		apellidos=response.getApellidos();
		direccion=response.getDireccion();
		poblacion=response.getPoblacion();
		telefono=response.getTelefono();
		email=response.getEmail();
		fechaNacimiento=response.getFechaNacimiento();
		naf=response.getNaf();
		iban=response.getIban();
		nivel=response.getNivel();
		usuario=response.getUsuario();
		password=response.getPassword();
		valido=response.getValido();
	
	}
}
