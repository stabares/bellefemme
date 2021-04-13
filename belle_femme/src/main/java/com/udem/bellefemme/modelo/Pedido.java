package com.udem.bellefemme.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Pedido")
public class Pedido {
	
	private long codigoPedido;
	private String nombre;
	private String descripcion;
	private String articulos;
	private long cantidad;
	private long precio;
	private String cliente;
	private String vendedor;
	
}
