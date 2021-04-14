package com.udem.bellefemme.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="InventarioMaterial")
public class InventarioMaterial {

	private long tipoElemento;
	private long idElemento;
	private int cantidad;
	
	public long getTipoElemento() {
		return tipoElemento;
	}
	
	public void setTipoElemento(long tipoElemento) {
		this.tipoElemento = tipoElemento;
	}
	
	public long getIdElemento() {
		return idElemento;
	}
	
	public void setIdElemento(long idElemento) {
		this.idElemento = idElemento;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
