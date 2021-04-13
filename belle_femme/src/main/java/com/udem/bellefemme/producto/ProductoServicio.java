package com.udem.bellefemme.producto;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

import com.udem.bellefemme.modelo.Producto;

@Path("/serviciosproducto")
public interface ProductoServicio {
	@Path("/productos")
	@GET
	List<Producto> getProductos();
	
	@Path("/productos")
	@POST
	Response agregarProducto(Producto producto);
	
	@Path("/productos/{codigoProducto}")
	@GET
	Producto getProducto(@PathParam("codigoProducto") Long codigoProducto);
	
	@Path("/productos")
	@PUT
	Response actualizarProducto(Producto producto);
	
	@Path("/productos/{codigoProducto}")
	@DELETE
	Response eliminarProducto(@PathParam("codigoProducto") Long codigoProducto);

}
