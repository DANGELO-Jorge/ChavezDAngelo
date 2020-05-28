package com.google.buscador.venta.bean;

public class ClienteBean {
	
	
	private int cod_cliente;
	private String nom_cliente;
	private String ape_cliente;
	private int DNI;
	private String fechaNacimiento;
	private TipoBean tipoBean;
	
	
	
	public int getCod_cliente() {
		return cod_cliente;
	}
	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}
	public String getNom_cliente() {
		return nom_cliente;
	}
	public void setNom_cliente(String nom_cliente) {
		this.nom_cliente = nom_cliente;
	}
	public String getApe_cliente() {
		return ape_cliente;
	}
	public void setApe_cliente(String ape_cliente) {
		this.ape_cliente = ape_cliente;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public TipoBean getTipoBean() {
		return tipoBean;
	}
	public void setTipoBean(TipoBean tipoBean) {
		this.tipoBean = tipoBean;
	}
	
	
	

}
