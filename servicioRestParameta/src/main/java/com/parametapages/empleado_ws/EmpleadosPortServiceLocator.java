/**
 * EmpleadosPortServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.parametapages.empleado_ws;

public class EmpleadosPortServiceLocator extends org.apache.axis.client.Service implements com.parametapages.empleado_ws.EmpleadosPortService {

    public EmpleadosPortServiceLocator() {
    }


    public EmpleadosPortServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EmpleadosPortServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EmpleadosPortSoap11
    private java.lang.String EmpleadosPortSoap11_address = "http://localhost:8080/soapws";

    public java.lang.String getEmpleadosPortSoap11Address() {
        return EmpleadosPortSoap11_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EmpleadosPortSoap11WSDDServiceName = "EmpleadosPortSoap11";

    public java.lang.String getEmpleadosPortSoap11WSDDServiceName() {
        return EmpleadosPortSoap11WSDDServiceName;
    }

    public void setEmpleadosPortSoap11WSDDServiceName(java.lang.String name) {
        EmpleadosPortSoap11WSDDServiceName = name;
    }

    public com.parametapages.empleado_ws.EmpleadosPort getEmpleadosPortSoap11() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EmpleadosPortSoap11_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEmpleadosPortSoap11(endpoint);
    }

    public com.parametapages.empleado_ws.EmpleadosPort getEmpleadosPortSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.parametapages.empleado_ws.EmpleadosPortSoap11Stub _stub = new com.parametapages.empleado_ws.EmpleadosPortSoap11Stub(portAddress, this);
            _stub.setPortName(getEmpleadosPortSoap11WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEmpleadosPortSoap11EndpointAddress(java.lang.String address) {
        EmpleadosPortSoap11_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.parametapages.empleado_ws.EmpleadosPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.parametapages.empleado_ws.EmpleadosPortSoap11Stub _stub = new com.parametapages.empleado_ws.EmpleadosPortSoap11Stub(new java.net.URL(EmpleadosPortSoap11_address), this);
                _stub.setPortName(getEmpleadosPortSoap11WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EmpleadosPortSoap11".equals(inputPortName)) {
            return getEmpleadosPortSoap11();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://parametapages.com/empleado-ws", "EmpleadosPortService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://parametapages.com/empleado-ws", "EmpleadosPortSoap11"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EmpleadosPortSoap11".equals(portName)) {
            setEmpleadosPortSoap11EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
