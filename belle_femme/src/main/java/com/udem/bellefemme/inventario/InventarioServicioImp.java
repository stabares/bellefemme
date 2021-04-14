package com.udem.bellefemme.inventario;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.udem.bellefemme.modelo.InventarioMaterial;
import com.udem.bellefemme.modelo.InventarioProducto;

@Service
public class InventarioServicioImp implements InventarioServicio{
	
	Map<Long,InventarioProducto> productos = new HashMap<>();
	Map<Long,InventarioMaterial> materiales = new HashMap<>();
	//long idActP = 0;
	//long idActM = 0;
	
	public InventarioServicioImp() {
		init();
	}
	
	void init() {
		InventarioProducto producto = new InventarioProducto();
		producto.setTipoElemento(0);
		producto.setIdElemento(2222);
		producto.setCantidad(50);
		productos.put(producto.getIdElemento(), producto);
		InventarioMaterial material = new InventarioMaterial();
		material.setTipoElemento(1);
		material.setIdElemento(444);
		material.setCantidad(300);
		materiales.put(material.getIdElemento(), material);
	}
	
	@Override
	public List<InventarioProducto> getInventarioProducto(){
		Collection<InventarioProducto> result = productos.values();
		List<InventarioProducto> respuesta = new ArrayList<>(result);
		return respuesta;
	}
	
	@Override
	public List<InventarioMaterial> getInventarioMaterial(){
		Collection<InventarioMaterial> result = materiales.values();
		List<InventarioMaterial> respuesta = new ArrayList<>(result);
		return respuesta;
	}
	
	@Override
	public Response agregarInventarioProducto(InventarioProducto producto) {
		productos.put(producto.getIdElemento(), producto);
		return Response.ok(producto).build();
	}
	
	@Override
	public Response agregarInventarioMaterial(InventarioMaterial material) {
		materiales.put(material.getIdElemento(), material);
		return Response.ok(material).build();
	}
	
	@Override
	public Response actualizarInventarioProducto(InventarioProducto producto) {
		InventarioProducto productoActual = productos.get(producto.getIdElemento());
		Response respuesta;
		if(productoActual != null) {
			productos.put(producto.getIdElemento(), productoActual);
			respuesta = Response.ok().build();
		} else {
			respuesta = Response.notModified().build();
		}
		return respuesta;
	}
	
	@Override
	public Response actualizarInventarioMaterial(InventarioMaterial material) {
		InventarioMaterial materialActual = materiales.get(material.getIdElemento());
		Response respuesta;
		if(materialActual != null) {
			materiales.put(material.getIdElemento(), materialActual);
			respuesta = Response.ok().build();
		} else {
			respuesta = Response.notModified().build();
		}
		return respuesta;
	}
	
	@Override
	public InventarioProducto getInventarioProducto(Long idElemento) {
		return productos.get(idElemento);
	}
	
	@Override
	public InventarioMaterial getInventarioMaterial(Long idElemento) {
		return materiales.get(idElemento);
	}
	
}
