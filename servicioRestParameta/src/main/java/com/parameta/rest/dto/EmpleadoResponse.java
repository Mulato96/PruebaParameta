package com.parameta.rest.dto;

import java.io.Serializable;
import java.util.List;

import com.parametapages.empleado_ws.EmpleadoInfo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpleadoResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msjStatusCode;
	private String timeVinculacion;
	private String edadActual;
	private List<EmpleadoInfo> lstEmpleados;
}
