package org.mtis.www.vista.web.app.controllers;

public class EntidadAccesoFechasData extends EntidadAccesoData {
	private String fechaDesde;
	private String fechaHasta;
	
	public EntidadAccesoFechasData() {
		super();
	}

	public String getFechaDesde() {
		return fechaDesde;
	}

	public void setFechaDesde(String fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public String getFechaHasta() {
		return fechaHasta;
	}

	public void setFechaHasta(String fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	
}
