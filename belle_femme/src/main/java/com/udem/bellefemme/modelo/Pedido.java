package com.udem.bellefemme.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Pedido")
public class Pedido {
	
	private long codigoPedido;
	private String descripcion;
	private String articulos;
	private long cantidad;
	private long precio;
	private long cedulaCliente;
	private String nombreVendedor;
	
	public long getCodigoPedido() {
		return codigoPedido;
	}
	public void setCodigoPedido(long codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getArticulos() {
		return articulos;
	}
	public void setArticulos(String articulos) {
		this.articulos = articulos;
	}
	public long getCantidad() {
		return cantidad;
	}
	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
	public long getPrecio() {
		return precio;
	}
	public void setPrecio(long precio) {
		this.precio = precio;
	}
	public long getCedulaCliente() {
		return cedulaCliente;
	}
	public void setCedulaCliente(long cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}
	public String getNombreVendedor() {
		return nombreVendedor;
	}
	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}
}
