package com.parameta.rest.integrations;

import java.rmi.RemoteException;
import java.util.List;

import com.parameta.rest.dto.EmpleadoDTO;
import com.parametapages.empleado_ws.AddEmpleadoResponse;
import com.parametapages.empleado_ws.DeleteEmpleadoResponse;
import com.parametapages.empleado_ws.EmpleadoInfo;
import com.parametapages.empleado_ws.UpdateEmpleadoResponse;

public interface ConsumirWSService {

	public List<EmpleadoInfo> GetSoapEmpleado() throws RemoteException, Exception;

	public AddEmpleadoResponse AddSoapEmpleado(EmpleadoDTO empleado) throws RemoteException, Exception;

	public UpdateEmpleadoResponse UpdateSoapEmpleado(EmpleadoDTO empleado) throws RemoteException, Exception;

	public DeleteEmpleadoResponse DeleteSoapEmpleado(Long idEmpleado) throws RemoteException, Exception;
}
