package com.udem.bellefemme.material;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

import com.udem.bellefemme.modelo.Material;

@Path("/serviciosmaterial")
public interface MaterialServicio {
	@Path("/materiales")
	@GET
	List<Material> getMateriales();
	
	@Path("/materiales")
	@POST
	Response agregarMaterial(Material material);
	
	@Path("/materiales/{codigoMaterial}")
	@GET
	Material getMaterial(@PathParam("codigoMaterial") Long codigoMaterial);
	
	@Path("/materiales")
	@PUT
	Response actualizarMaterial(Material Material);
	
	@Path("/materiales/{codigoMaterial}")
	@DELETE
	Response eliminarMaterial(@PathParam("codigoMaterial") Long codigoMaterial);

}