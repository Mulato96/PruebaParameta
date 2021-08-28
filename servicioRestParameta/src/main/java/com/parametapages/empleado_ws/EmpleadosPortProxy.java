package com.parametapages.empleado_ws;

public class EmpleadosPortProxy implements com.parametapages.empleado_ws.EmpleadosPort {
  private String _endpoint = null;
  private com.parametapages.empleado_ws.EmpleadosPort empleadosPort = null;
  
  public EmpleadosPortProxy() {
    _initEmpleadosPortProxy();
  }
  
  public EmpleadosPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmpleadosPortProxy();
  }
  
  private void _initEmpleadosPortProxy() {
    try {
      empleadosPort = (new com.parametapages.empleado_ws.EmpleadosPortServiceLocator()).getEmpleadosPortSoap11();
      if (empleadosPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)empleadosPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)empleadosPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (empleadosPort != null)
      ((javax.xml.rpc.Stub)empleadosPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.parametapages.empleado_ws.EmpleadosPort getEmpleadosPort() {
    if (empleadosPort == null)
      _initEmpleadosPortProxy();
    return empleadosPort;
  }
  
  public com.parametapages.empleado_ws.DeleteEmpleadoResponse deleteEmpleado(com.parametapages.empleado_ws.DeleteEmpleadoRequest deleteEmpleadoRequest) throws java.rmi.RemoteException{
    if (empleadosPort == null)
      _initEmpleadosPortProxy();
    return empleadosPort.deleteEmpleado(deleteEmpleadoRequest);
  }
  
  public com.parametapages.empleado_ws.EmpleadoInfo[] getAllEmpleados(com.parametapages.empleado_ws.GetAllEmpleadosRequest getAllEmpleadosRequest) throws java.rmi.RemoteException{
    if (empleadosPort == null)
      _initEmpleadosPortProxy();
    return empleadosPort.getAllEmpleados(getAllEmpleadosRequest);
  }
  
  public com.parametapages.empleado_ws.GetEmpleadoByIdResponse getEmpleadoById(com.parametapages.empleado_ws.GetEmpleadoByIdRequest getEmpleadoByIdRequest) throws java.rmi.RemoteException{
    if (empleadosPort == null)
      _initEmpleadosPortProxy();
    return empleadosPort.getEmpleadoById(getEmpleadoByIdRequest);
  }
  
  public com.parametapages.empleado_ws.AddEmpleadoResponse addEmpleado(com.parametapages.empleado_ws.AddEmpleadoRequest addEmpleadoRequest) throws java.rmi.RemoteException{
    if (empleadosPort == null)
      _initEmpleadosPortProxy();
    return empleadosPort.addEmpleado(addEmpleadoRequest);
  }
  
  public com.parametapages.empleado_ws.UpdateEmpleadoResponse updateEmpleado(com.parametapages.empleado_ws.UpdateEmpleadoRequest updateEmpleadoRequest) throws java.rmi.RemoteException{
    if (empleadosPort == null)
      _initEmpleadosPortProxy();
    return empleadosPort.updateEmpleado(updateEmpleadoRequest);
  }
  
  
}