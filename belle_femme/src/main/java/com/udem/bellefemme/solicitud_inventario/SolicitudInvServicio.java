package com.udem.bellefemme.solicitud_inventario;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import com.udem.bellefemme.modelo.SolicitudInv;

@Path("/serviciossolicitudesinv")
public interface SolicitudInvServicio {
	@Path("/solicitudesinv")
	@GET
	List<SolicitudInv> getSolicitudesInv();

	@Path("/solicitudesinv/{id}")
	@GET
	SolicitudInv getSolicitudinv(@PathParam("idSolicitudInv") Long idSolicitudInv);
	
	@Path("/solicitudesinv")
	@POST
	Response agregarSolicitudesinv(SolicitudInv solicitudInv);

}
