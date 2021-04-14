package com.udem.bellefemme.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Producto")
public class Producto {
	
	private long codigoProducto;
	private String descripcion;
	private String categoria;
	private String material;
	private long precio;
	
	public long getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public long getPrecio() {
		return precio;
	}
	public void setPrecio(long precio) {
		this.precio = precio;
	}
	
}
