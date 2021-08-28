package com.parameta.soap.service;

import java.util.List;

import com.parameta.soap.modelo.Empleado;

public interface IEmpleadoService {
	List<Empleado> getAllEmpleados();

	Empleado getEmpleadoById(long empleadoId);

	boolean addEmpleado(Empleado empleado);

	void updateEmpleado(Empleado empleado);

	void deleteEmpleado(Empleado empleado);
}
