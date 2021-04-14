package com.udem.bellefemme.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Material")
public class Material {
	
	private long codigoMaterial;
	private String nombre;
	private String descripcion;
	
	public long getCodigoMaterial() {
		return codigoMaterial;
	}
	
	public void setCodigoMaterial(long codigoMaterial) {
		this.codigoMaterial = codigoMaterial;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}