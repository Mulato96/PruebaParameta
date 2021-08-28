package com.parameta.rest.service;

import com.parameta.rest.dto.EmpleadoDTO;
import com.parameta.rest.dto.EmpleadoResponse;

public interface IEmpleadoService {

	EmpleadoResponse GetSoapEmpleado();

	EmpleadoResponse AddSoapEmpleado(EmpleadoDTO empleadoDto);

	EmpleadoResponse UpdateSoapEmpleado(EmpleadoDTO empleadoDto);

	EmpleadoResponse DeleteSoapEmpleado(Long idEmpleado);

}
