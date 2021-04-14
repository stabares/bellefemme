package com.udem.bellefemme.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="SolicitudInv")
public class SolicitudInv {
	private long idSolicitudInv;
	private long elemento_id;
	private long cantidad;
	private String descripcion;
	
	public long getIdSolicitudInv() {
		return idSolicitudInv;
	}
	public void setIdSolicitudInv(long idSolicitudInv) {
		this.idSolicitudInv = idSolicitudInv;
	}
	public long getElemento_id() {
		return elemento_id;
	}
	public void setElemento_id(long elemento_id) {
		this.elemento_id = elemento_id;
	}
	public long getCantidad() {
		return cantidad;
	}
	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
