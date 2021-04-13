package com.udem.bellefemme.modelo;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="SolicitudPos")
public class SolicitudPos {
	
	private long id;
	private Cliente cliente_id;
	private Pedido pedido_id;
	private String tipo;
	private String descripcion;
	private String contacto;
	private String correo;
	private Date fecha;


	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Cliente getCliente_id() {
		return this.cliente_id;
	}

	public void setCliente_id(Cliente cliente_id) {
		this.cliente_id = cliente_id;
	}

	public Pedido getPedido_id() {
		return this.pedido_id;
	}

	public void setPedido_id(Pedido pedido_id) {
		this.pedido_id = pedido_id;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getContacto() {
		return this.contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}