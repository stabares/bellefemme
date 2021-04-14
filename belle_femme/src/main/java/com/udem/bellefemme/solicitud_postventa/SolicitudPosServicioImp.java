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
		solicitudesPos.put(solicitudPos.getId(), solicitudPos);

		SolicitudPos solicitudPos1 = new SolicitudPos();
		solicitudPos1.setId(101);
		solicitudPos1.setCliente_id(456);
		solicitudPos1.setContacto("contacto");
		solicitudPos1.setCorreo("correo");
		solicitudPos1.setDescripcion("descripcion");
		solicitudPos1.setFecha("12/12/2020");
		solicitudPos1.setTipo("tipo");
		solicitudesPos.put(solicitudPos1.getId(), solicitudPos1);

		Cliente cliente = new Cliente();
		cliente.setId(123);
		cliente.setNombre("Sara");
		cliente.setApellidos("Soto");
		cliente.setCorreo("sara@gmail.com");
		cliente.setDireccion("direccion");
		cliente.setCelular(12345);
		clientes.put(cliente.getId(), cliente);

		Cliente cliente2 = new Cliente();
		cliente2.setId(456);
		cliente2.setNombre("Sebastian");
		cliente2.setApellidos("Soto");
		cliente2.setCorreo("sara@gmail.com");
		cliente2.setDireccion("direccion");
		cliente2.setCelular(12345);
		clientes.put(cliente2.getId(), cliente2);

		Cliente cliente3 = new Cliente();
		cliente3.setId(789);
		cliente3.setNombre("Sofia");
		cliente3.setApellidos("Soto");
		cliente3.setCorreo("sara@gmail.com");
		cliente3.setDireccion("direccion");
		cliente3.setCelular(12345);
		clientes.put(cliente3.getId(), cliente3);
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
	public Response agregarSolicitudespos(SolicitudPos solicitudPos) {
		long cliente_id = solicitudPos.getCliente_id();
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
}
