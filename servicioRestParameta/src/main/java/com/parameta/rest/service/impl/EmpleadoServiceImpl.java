package com.parameta.rest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parameta.rest.constantes.Constantes;
import com.parameta.rest.dto.EmpleadoDTO;
import com.parameta.rest.dto.EmpleadoResponse;
import com.parameta.rest.integrations.ConsumirWSService;
import com.parameta.rest.service.IEmpleadoService;
import com.parameta.rest.utilities.Utilities;
import com.parametapages.empleado_ws.AddEmpleadoResponse;
import com.parametapages.empleado_ws.DeleteEmpleadoResponse;
import com.parametapages.empleado_ws.EmpleadoInfo;
import com.parametapages.empleado_ws.UpdateEmpleadoResponse;

@Service(value = "empleadoService")
public class EmpleadoServiceImpl implements IEmpleadoService {

	static final Logger logger = Logger.getLogger(EmpleadoServiceImpl.class);

	@Autowired
	private ConsumirWSService consumirWS;

	Utilities util = new Utilities();

	@Override
	public EmpleadoResponse GetSoapEmpleado() {
		List<EmpleadoInfo> empleadoVoObj = new ArrayList<EmpleadoInfo>();
		EmpleadoResponse empleadoResponse = new EmpleadoResponse();

		try {

			empleadoVoObj = consumirWS.GetSoapEmpleado();		
		
			
			empleadoResponse.setLstEmpleados(empleadoVoObj);

		} catch (Exception e) {
			logger.error("Error al consultar AddSoapEmpleado" + e);
		}

		return empleadoResponse;
	}

	@Override
	public EmpleadoResponse AddSoapEmpleado(EmpleadoDTO empleadoDTO) {
		AddEmpleadoResponse empleadoVoObj = null;
		EmpleadoResponse empleadoResponse = new EmpleadoResponse();

		int edadActual = util.calcularEdad(empleadoDTO.getFechaNacimiento());

		if (edadActual < 18) {
			empleadoResponse.setMsjStatusCode(Constantes.NOT_EDAD);
		} else {
			try {

				empleadoVoObj = consumirWS.AddSoapEmpleado(empleadoDTO);
				if (!empleadoVoObj.getServiceStatus().getStatusCode().equals(Constantes.SUCCESS)) {
					empleadoResponse.setMsjStatusCode(empleadoVoObj.getServiceStatus().getStatusCode() + "-"
							+ empleadoVoObj.getServiceStatus().getMessage());
				} else {

					String edadStrActual = util.calcularTiempo(empleadoDTO.getFechaNacimiento());
					String tiempoVin = util.calcularTiempo(empleadoVoObj.getEmpleadoInfo().getFechaVinculacion());

					empleadoResponse.setEdadActual(edadStrActual);
					empleadoResponse.setTimeVinculacion(tiempoVin);
					empleadoResponse.setMsjStatusCode(empleadoVoObj.getServiceStatus().getStatusCode() + "-"
							+ empleadoVoObj.getServiceStatus().getMessage());
				}
			} catch (Exception e) {
				logger.error("Error al consultar AddSoapEmpleado" + e);
			}
		}

		return empleadoResponse;
	}

	@Override
	public EmpleadoResponse UpdateSoapEmpleado(EmpleadoDTO empleadoDTO) {
		UpdateEmpleadoResponse empleadoVoObj = null;
		EmpleadoResponse empleadoResponse = new EmpleadoResponse();

		if (empleadoDTO.getIdEmpleado() != null) {
			try {

				empleadoVoObj = consumirWS.UpdateSoapEmpleado(empleadoDTO);

				String edadStrActual = util.calcularTiempo(empleadoDTO.getFechaNacimiento());
				String tiempoVin = util.calcularTiempo(empleadoDTO.getFechaVinculacion());

				empleadoResponse.setEdadActual(edadStrActual);
				empleadoResponse.setTimeVinculacion(tiempoVin);

				empleadoResponse.setMsjStatusCode(empleadoVoObj.getServiceStatus().getStatusCode() + "-"
						+ empleadoVoObj.getServiceStatus().getMessage());

			} catch (Exception e) {
				logger.error("Error al consultar AddSoapEmpleado" + e);
			}
		} else {
			empleadoResponse.setMsjStatusCode(Constantes.NOT_ID);
		}

		return empleadoResponse;
	}

	@Override
	public EmpleadoResponse DeleteSoapEmpleado(Long idEmpleado) {
		DeleteEmpleadoResponse empleadoVoObj = null;
		EmpleadoResponse empleadoResponse = new EmpleadoResponse();

		if (idEmpleado != null) {
			try {

				empleadoVoObj = consumirWS.DeleteSoapEmpleado(idEmpleado);

				empleadoResponse.setMsjStatusCode(empleadoVoObj.getServiceStatus().getStatusCode() + "-"
						+ empleadoVoObj.getServiceStatus().getMessage());

			} catch (Exception e) {
				logger.error("Error al consultar DeleteSoapEmpleado" + e);
			}
		} else {
			empleadoResponse.setMsjStatusCode(Constantes.NOT_ID);
		}

		return empleadoResponse;
	}
}
