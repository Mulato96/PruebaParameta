package com.parameta.soap.endpoints;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.parameta.soap.constantes.Constantes;
import com.parameta.soap.modelo.Empleado;
import com.parameta.soap.service.IEmpleadoService;
import com.parametapages.empleado_ws.AddEmpleadoRequest;
import com.parametapages.empleado_ws.AddEmpleadoResponse;
import com.parametapages.empleado_ws.DeleteEmpleadoRequest;
import com.parametapages.empleado_ws.DeleteEmpleadoResponse;
import com.parametapages.empleado_ws.EmpleadoInfo;
import com.parametapages.empleado_ws.GetAllEmpleadosResponse;
import com.parametapages.empleado_ws.GetEmpleadoByIdRequest;
import com.parametapages.empleado_ws.GetEmpleadoByIdResponse;
import com.parametapages.empleado_ws.ServiceStatus;
import com.parametapages.empleado_ws.UpdateEmpleadoRequest;
import com.parametapages.empleado_ws.UpdateEmpleadoResponse;

@Endpoint
public class EmpleadoEndpoint {

	@Autowired
	private IEmpleadoService empleadoService;

	@PayloadRoot(namespace = Constantes.NAMESPACE_URI, localPart = "getEmpleadoByIdRequest")
	@ResponsePayload
	public GetEmpleadoByIdResponse getEmpleado(@RequestPayload GetEmpleadoByIdRequest request) {
		GetEmpleadoByIdResponse response = new GetEmpleadoByIdResponse();
		EmpleadoInfo empleadoInfo = new EmpleadoInfo();
		BeanUtils.copyProperties(empleadoService.getEmpleadoById(request.getEmpleadoId()), empleadoInfo);
		response.setEmpleadoInfo(empleadoInfo);
		return response;
	}

	@PayloadRoot(namespace = Constantes.NAMESPACE_URI, localPart = "getAllEmpleadosRequest")
	@ResponsePayload
	public GetAllEmpleadosResponse getAllEmpleados() {
		GetAllEmpleadosResponse response = new GetAllEmpleadosResponse();
		List<EmpleadoInfo> empleadoInfoList = new ArrayList<>();
		List<Empleado> empleadoList = empleadoService.getAllEmpleados();
		for (int i = 0; i < empleadoList.size(); i++) {
			EmpleadoInfo ob = new EmpleadoInfo();
			BeanUtils.copyProperties(empleadoList.get(i), ob);
			empleadoInfoList.add(ob);
		}
		response.getEmpleadoInfo().addAll(empleadoInfoList);
		return response;
	}

	@PayloadRoot(namespace = Constantes.NAMESPACE_URI, localPart = "addEmpleadoRequest")
	@ResponsePayload
	public AddEmpleadoResponse addEmpleado(@RequestPayload AddEmpleadoRequest request) {
		AddEmpleadoResponse response = new AddEmpleadoResponse();
		ServiceStatus serviceStatus = new ServiceStatus();
		Empleado empleado = new Empleado();

		empleado.setNombre(request.getNombre());
		empleado.setTipoDocumento(request.getTipoDocumento());
		empleado.setNumeroDocumento(request.getNumeroDocumento());
		empleado.setFechaNacimiento(request.getFechaNacimiento());
		empleado.setFechaVinculacion(request.getFechaVinculacion());
		empleado.setCargo(request.getCargo());
		empleado.setSalario(request.getSalario());

		boolean flag = empleadoService.addEmpleado(empleado);
		if (!flag) {
			serviceStatus.setStatusCode(Constantes.CONFLICT);
			serviceStatus.setMessage(Constantes.ALREADY);
			response.setServiceStatus(serviceStatus);
		} else {
			EmpleadoInfo empleadoInfo = new EmpleadoInfo();
			BeanUtils.copyProperties(empleado, empleadoInfo);
			response.setEmpleadoInfo(empleadoInfo);
			serviceStatus.setStatusCode(Constantes.SUCCESS);
			serviceStatus.setMessage(Constantes.ADD_SUCCESS);
			response.setServiceStatus(serviceStatus);
		}
		return response;
	}

	@PayloadRoot(namespace = Constantes.NAMESPACE_URI, localPart = "updateEmpleadoRequest")
	@ResponsePayload
	public UpdateEmpleadoResponse updateEmpleado(@RequestPayload UpdateEmpleadoRequest request) {
		Empleado empleado = new Empleado();
		BeanUtils.copyProperties(request.getEmpleadoInfo(), empleado);
		empleadoService.updateEmpleado(empleado);
		ServiceStatus serviceStatus = new ServiceStatus();
		serviceStatus.setStatusCode(Constantes.SUCCESS);
		serviceStatus.setMessage(Constantes.UPDATE_SUCCESS);
		UpdateEmpleadoResponse response = new UpdateEmpleadoResponse();
		response.setServiceStatus(serviceStatus);
		return response;
	}

	@PayloadRoot(namespace = Constantes.NAMESPACE_URI, localPart = "deleteEmpleadoRequest")
	@ResponsePayload
	public DeleteEmpleadoResponse deleteEmpleado(@RequestPayload DeleteEmpleadoRequest request) {
		Empleado empleado = empleadoService.getEmpleadoById(request.getEmpleadoId());
		ServiceStatus serviceStatus = new ServiceStatus();
		if (empleado == null) {
			serviceStatus.setStatusCode(Constantes.FAIL);
			serviceStatus.setMessage(Constantes.NOTEXIST);
		} else {
			empleadoService.deleteEmpleado(empleado);
			serviceStatus.setStatusCode(Constantes.SUCCESS);
			serviceStatus.setMessage(Constantes.DELETE_SUCCESS);
		}
		DeleteEmpleadoResponse response = new DeleteEmpleadoResponse();
		response.setServiceStatus(serviceStatus);
		return response;
	}
}
