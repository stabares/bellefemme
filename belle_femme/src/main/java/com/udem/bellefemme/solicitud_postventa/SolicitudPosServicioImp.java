package com.udem.bellefemme.solicitud_postventa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;
import org.springframework.stereotype.Service;

import com.udem.bellefemme.modelo.Cliente;
import com.udem.bellefemme.modelo.SolicitudPos;

@Service
public class SolicitudPosServicioImp implements SolicitudPosServicio {

	Map<Long, SolicitudPos> solicitudesPos = new HashMap<>();
	Map<Long, Cliente> clientes = new HashMap<>();

	public SolicitudPosServicioImp() {
		init();
	}

	void init() {
		SolicitudPos solicitudPos = new SolicitudPos();
		solicitudPos.setId(100);
		solicitudPos.setCliente_id(123);
		solicitudPos.setContacto("contacto");
		solicitudPos.setCorreo("correo");
		solicitudPos.setDescripcion("descripcion");
		solicitudPos.setFecha("12/12/2020");
		solicitudPos.setTipo("tipo");
		solicitudPos.setPedido_id(1);
		solicitudesPos.put(solicitudPos.getId(), solicitudPos);
	}

	@Override
	public List<SolicitudPos> getSolicitudespos() {
		Collection<SolicitudPos> result = solicitudesPos.values();
		List<SolicitudPos> respuesta = new ArrayList<>(result);
		return respuesta;
	}

	@Override
	public SolicitudPos getSolicitudpos(Long id) {
		return solicitudesPos.get(id);
	}

	public Cliente getCliente(Long id) {
		return clientes.get(id);
	}

	@Override
	public Response agregarsSolicitudespos(Long cliente_id, SolicitudPos solicitudPos) {
		cliente_id = solicitudPos.getCliente_id();
		Cliente clienteActual = clientes.get(cliente_id);
		Response respuesta;
		if (clienteActual != null) {
			solicitudesPos.put(solicitudPos.getId(), solicitudPos);
			return Response.ok(solicitudPos).build();
		} else {
			respuesta = Response.notModified().build();
		}
		return respuesta;
	}

	

	// Response respuesta;
	// if(clienteActual!=null) {
	// solicitudesPos.put(solicitudPos.getId(), solicitudPos);
	// return Response.ok(solicitudPos).build();
	// }else {
	// respuesta = Response.notModified().build();
	// }
	// return respuesta;
	// long cliente_id = solicitudPos.getCliente_id();
	// System.out.println(cliente_id);
	// if (getCliente(cliente_id)!=null) {
	// solicitudesPos.put(solicitudPos.getId(), solicitudPos);
	// return Response.ok(solicitudPos).build();
	// } else {
	// System.out.println("El cliente ingresado no existe");
	// return Response.noContent().build();
	// }
}
