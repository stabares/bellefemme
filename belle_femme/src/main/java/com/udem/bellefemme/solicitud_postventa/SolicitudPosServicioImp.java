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
	
	Map<Long, SolicitudPos> solicitudPos = new HashMap<>();
	long idAct = 123;
	@Override
	public List<SolicitudPos> getSolicitudespos() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public SolicitudPos getSolicitudpos(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Response agregarsSlicitudespos(SolicitudPos solicitudPos) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
