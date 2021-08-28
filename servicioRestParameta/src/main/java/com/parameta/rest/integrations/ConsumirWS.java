package com.parameta.rest.integrations;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.parameta.rest.dto.EmpleadoDTO;
import com.parametapages.empleado_ws.AddEmpleadoRequest;
import com.parametapages.empleado_ws.AddEmpleadoResponse;
import com.parametapages.empleado_ws.DeleteEmpleadoRequest;
import com.parametapages.empleado_ws.DeleteEmpleadoResponse;
import com.parametapages.empleado_ws.EmpleadoInfo;
import com.parametapages.empleado_ws.EmpleadosPort;
import com.parametapages.empleado_ws.EmpleadosPortService;
import com.parametapages.empleado_ws.EmpleadosPortServiceLocator;
import com.parametapages.empleado_ws.GetAllEmpleadosRequest;
import com.parametapages.empleado_ws.UpdateEmpleadoRequest;
import com.parametapages.empleado_ws.UpdateEmpleadoResponse;

@Service(value = "ConsumirWSService")
public class ConsumirWS implements Serializable, ConsumirWSService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 65L;
	private final Logger logger = Logger.getLogger(ConsumirWS.class);

	// Integracion Con Servicio de empleados

	private EmpleadosPortService servEmple;
	private EmpleadosPort remoteEmple;

	public List<EmpleadoInfo> GetSoapEmpleado() throws RemoteException, Exception {

		servEmple = new EmpleadosPortServiceLocator();
		remoteEmple = servEmple.getEmpleadosPortSoap11();

		GetAllEmpleadosRequest getAllEmpleadosRequest = new GetAllEmpleadosRequest();
		List<EmpleadoInfo> empleadoInfoLst = new ArrayList<>();

		empleadoInfoLst = Arrays.asList(remoteEmple.getAllEmpleados(getAllEmpleadosRequest));

		logger.info("Servicio de Empleados");
		return empleadoInfoLst;
	}

	public AddEmpleadoResponse AddSoapEmpleado(EmpleadoDTO empleado) throws RemoteException, Exception {

		servEmple = new EmpleadosPortServiceLocator();
		remoteEmple = servEmple.getEmpleadosPortSoap11();

		AddEmpleadoRequest addEmpleadoRequest = new AddEmpleadoRequest();
		AddEmpleadoResponse addEmpleadoResponse = new AddEmpleadoResponse();

		addEmpleadoRequest.setNombre(empleado.getNombre());
		addEmpleadoRequest.setTipoDocumento(empleado.getTipoDocumento());
		addEmpleadoRequest.setNumeroDocumento(empleado.getNumeroDocumento());
		addEmpleadoRequest.setFechaNacimiento(empleado.getFechaNacimiento());
		addEmpleadoRequest.setFechaVinculacion(empleado.getFechaVinculacion());
		addEmpleadoRequest.setCargo(empleado.getCargo());
		addEmpleadoRequest.setSalario(empleado.getSalario());
		addEmpleadoResponse = remoteEmple.addEmpleado(addEmpleadoRequest);

		logger.info("Servicio de Empleados");
		return addEmpleadoResponse;
	}

	public UpdateEmpleadoResponse UpdateSoapEmpleado(EmpleadoDTO empleado) throws RemoteException, Exception {

		servEmple = new EmpleadosPortServiceLocator();
		remoteEmple = servEmple.getEmpleadosPortSoap11();

		UpdateEmpleadoRequest updateEmpleadoRequest = new UpdateEmpleadoRequest();
		UpdateEmpleadoResponse updateEmpleadoResponse = new UpdateEmpleadoResponse();
		EmpleadoInfo empleadoInfo = new EmpleadoInfo();

		empleadoInfo.setIdEmpleado(empleado.getIdEmpleado());
		empleadoInfo.setNombre(empleado.getNombre());
		empleadoInfo.setTipoDocumento(empleado.getTipoDocumento());
		empleadoInfo.setNumeroDocumento(empleado.getNumeroDocumento());
		empleadoInfo.setFechaNacimiento(empleado.getFechaNacimiento());
		empleadoInfo.setFechaVinculacion(empleado.getFechaVinculacion());
		empleadoInfo.setCargo(empleado.getCargo());
		empleadoInfo.setSalario(empleado.getSalario());

		updateEmpleadoRequest.setEmpleadoInfo(empleadoInfo);

		updateEmpleadoResponse = remoteEmple.updateEmpleado(updateEmpleadoRequest);

		logger.info("Servicio de Empleados");
		return updateEmpleadoResponse;
	}

	public DeleteEmpleadoResponse DeleteSoapEmpleado(Long idEmpleado) throws RemoteException, Exception {

		servEmple = new EmpleadosPortServiceLocator();
		remoteEmple = servEmple.getEmpleadosPortSoap11();

		DeleteEmpleadoRequest deleteEmpleadoRequest = new DeleteEmpleadoRequest();
		DeleteEmpleadoResponse deleteEmpleadoResponse = new DeleteEmpleadoResponse();

		deleteEmpleadoRequest.setEmpleadoId(idEmpleado);

		deleteEmpleadoResponse = remoteEmple.deleteEmpleado(deleteEmpleadoRequest);

		logger.info("Servicio de Empleados");
		return deleteEmpleadoResponse;
	}
}
