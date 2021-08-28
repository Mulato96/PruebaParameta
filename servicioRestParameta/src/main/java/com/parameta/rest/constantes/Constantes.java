package com.parameta.rest.constantes;

public interface Constantes {

	/**
	 * Globales
	 */
	String URL_SERVICE_SOAP = "http://localhost:8080/soapws/empleados.wsdl";
	String NAMESPACE_URI = "http://parametapages.com/empleado-ws";
	String FECHA_PATTERN = "dd-MM-yyyy";
	String TIMEZONE = "EST";	
	String SUCCESS = "EXITO";
	String NOT_EDAD = "ERROR-EDAD NO CUMPLE CON REQUISITO";
	String NOT_ID = "ERROR-ID DE EMPLEADO NECESARIO PARA TRANSACCION";
}
