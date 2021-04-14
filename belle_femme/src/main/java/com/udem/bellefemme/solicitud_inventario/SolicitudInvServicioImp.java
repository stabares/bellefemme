package com.udem.bellefemme.solicitud_inventario;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;
import org.springframework.stereotype.Service;

import com.udem.bellefemme.modelo.InventarioMaterial;
import com.udem.bellefemme.modelo.SolicitudInv;

@Service
public class SolicitudInvServicioImp implements SolicitudInvServicio {
	
	Map<Long, SolicitudInv> solicitudesInv = new HashMap<>();
	Map<Long,InventarioMaterial> materiales = new HashMap<>();

	public SolicitudInvServicioImp() {
		init();
	}

	void init() {
		SolicitudInv solicitudInv = new SolicitudInv();
		solicitudInv.setIdSolicitudInv(1);
		solicitudInv.setElemento_id(123);
		solicitudInv.setCantidad(15);
		solicitudInv.setDescripcion("material para un pedido");
		solicitudesInv.put(solicitudInv.getIdSolicitudInv(), solicitudInv);

		SolicitudInv solicitudInv2 = new SolicitudInv();
		solicitudInv2.setIdSolicitudInv(2);
		solicitudInv2.setElemento_id(321);
		solicitudInv2.setCantidad(27);
		solicitudInv2.setDescripcion("material para un pedido x2");
		solicitudesInv.put(solicitudInv2.getIdSolicitudInv(), solicitudInv2);

		InventarioMaterial material = new InventarioMaterial();
		material.setTipoElemento(1);
		material.setIdElemento(123);
		material.setCantidad(300);
		materiales.put(material.getIdElemento(), material);
		
		InventarioMaterial material1 = new InventarioMaterial();
		material1.setTipoElemento(1);
		material1.setIdElemento(321);
		material1.setCantidad(100);
		materiales.put(material1.getIdElemento(), material);
		
		InventarioMaterial material2 = new InventarioMaterial();
		material2.setTipoElemento(1);
		material2.setIdElemento(456);
		material2.setCantidad(350);
		materiales.put(material2.getIdElemento(), material);
	}

	@Override
	public List<SolicitudInv> getSolicitudesInv() {
		Collection<SolicitudInv> result = solicitudesInv.values();
		List<SolicitudInv> respuesta = new ArrayList<>(result);
		return respuesta;
	}

	@Override
	public SolicitudInv getSolicitudinv(Long idSolicitudInv) {
		return solicitudesInv.get(idSolicitudInv);
	}

	@Override
	public Response agregarSolicitudesinv(SolicitudInv solicitudInv) {
		long elemento_id = solicitudInv.getElemento_id();
		InventarioMaterial elementoActual = materiales.get(elemento_id);
		Response respuesta;
		if (elementoActual != null) {
			solicitudesInv.put(solicitudInv.getIdSolicitudInv(), solicitudInv);
			return Response.ok(solicitudInv).build();
		} else {
			respuesta = Response.notModified().build();
		}
		return respuesta;
	}

}
