package com.udem.bellefemme.solicitud_postventa;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import com.udem.bellefemme.modelo.SolicitudPos;

@Path("/serviciossolicitudespos")

public interface SolicitudPosServicio {
	
	@Path("/solicitudespos")
	@GET
	List<SolicitudPos> getSolicitudespos();

	@Path("/solicitudespos/{id}")
	@GET
	SolicitudPos getSolicitudpos(@PathParam("id") Long id);
	
	@Path("/solicitudespos")
	@POST
	Response agregarSolicitudespos(SolicitudPos solicitudPos);
}
