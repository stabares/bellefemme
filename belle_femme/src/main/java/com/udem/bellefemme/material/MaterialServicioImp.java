package com.udem.bellefemme.material;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.udem.bellefemme.modelo.Material;

@Service
public class MaterialServicioImp implements MaterialServicio {
	
	Map<Long,Material> materiales = new HashMap<>();
	long idAct = 0;
	
	public MaterialServicioImp() {
		init();
	}

	void init() {
		Material material = new Material();
		material.setCodigoMaterial(idAct);
		material.setNombre("Tela lana verde");
		material.setDescripcion("Tela tipo lana de color verde para blusas");
		materiales.put(material.getCodigoMaterial(), material);
	}

	@Override
	public List<Material> getMateriales() {
		Collection<Material> result = materiales.values();
		List<Material> respuesta = new ArrayList<>(result);
		return respuesta;
	}

	@Override
	public Response agregarMaterial(Material material) {
		material.setCodigoMaterial(++idAct);
		materiales.put(material.getCodigoMaterial(), material);
		return Response.ok(material).build();
	}

	@Override
	public Material getMaterial(Long codigoMaterial) {
		return materiales.get(codigoMaterial);
	}

	@Override
	public Response actualizarMaterial(Material material) {
		Material materialActual = materiales.get(material.getCodigoMaterial());
		Response respuesta;
		if(materialActual!=null) {
			materiales.put(material.getCodigoMaterial(), material);
			respuesta = Response.ok().build();
		}else {
			respuesta = Response.notModified().build();
		}
		return respuesta;
	}

	@Override
	public Response eliminarMaterial(Long codigoMaterial) {
		Material materialActual = materiales.get(codigoMaterial);
		Response respuesta;
		if(materialActual!=null) {
			materiales.remove(codigoMaterial);
			respuesta = Response.ok().build();
		}else {
			respuesta = Response.notModified().build();
		}
		return respuesta;
	}

}

