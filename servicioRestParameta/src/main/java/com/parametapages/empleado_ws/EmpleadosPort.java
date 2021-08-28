/**
 * EmpleadosPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.parametapages.empleado_ws;

public interface EmpleadosPort extends java.rmi.Remote {
    public com.parametapages.empleado_ws.DeleteEmpleadoResponse deleteEmpleado(com.parametapages.empleado_ws.DeleteEmpleadoRequest deleteEmpleadoRequest) throws java.rmi.RemoteException;
    public com.parametapages.empleado_ws.EmpleadoInfo[] getAllEmpleados(com.parametapages.empleado_ws.GetAllEmpleadosRequest getAllEmpleadosRequest) throws java.rmi.RemoteException;
    public com.parametapages.empleado_ws.GetEmpleadoByIdResponse getEmpleadoById(com.parametapages.empleado_ws.GetEmpleadoByIdRequest getEmpleadoByIdRequest) throws java.rmi.RemoteException;
    public com.parametapages.empleado_ws.AddEmpleadoResponse addEmpleado(com.parametapages.empleado_ws.AddEmpleadoRequest addEmpleadoRequest) throws java.rmi.RemoteException;
    public com.parametapages.empleado_ws.UpdateEmpleadoResponse updateEmpleado(com.parametapages.empleado_ws.UpdateEmpleadoRequest updateEmpleadoRequest) throws java.rmi.RemoteException;
}
