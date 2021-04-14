package com.udem.bellefemme.inventario;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

import com.udem.bellefemme.modelo.InventarioMaterial;
import com.udem.bellefemme.modelo.InventarioProducto;

@Path("/serviciosinventario")
public interface InventarioServicio {
	@Path("/productos")
	@GET
	List<InventarioProducto> getInventarioProducto();
	
	@Path("/productos")
	@POST
	Response agregarInventarioProducto(InventarioProducto producto);
	
	@Path("/productos/{codigoProducto}")
	@GET
	InventarioProducto getInventarioProducto(@PathParam("idElemento")Long idElemento);
	
	@Path("/producto/{codigoProducto}")
	@PUT
	Response actualizarInventarioProducto(InventarioProducto Producto);
	
	@Path("/materiales")
	@GET
	List<InventarioMaterial> getInventarioMaterial();
	
	@Path("/materiales")
	@POST
	Response agregarInventarioMaterial(InventarioMaterial material);
	
	@Path("/materiales/{codigoMaterial}")
	@GET
	InventarioMaterial getInventarioMaterial(@PathParam("idElemento")Long idElemento);
	
	@Path("/materiales/{codigoMaterial}")
	@PUT
	Response actualizarInventarioMaterial(InventarioMaterial Material);
	

	

}
