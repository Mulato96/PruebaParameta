/**
 * UpdateEmpleadoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.parametapages.empleado_ws;

public class UpdateEmpleadoResponse  implements java.io.Serializable {
    private com.parametapages.empleado_ws.ServiceStatus serviceStatus;

    public UpdateEmpleadoResponse() {
    }

    public UpdateEmpleadoResponse(
           com.parametapages.empleado_ws.ServiceStatus serviceStatus) {
           this.serviceStatus = serviceStatus;
    }


    /**
     * Gets the serviceStatus value for this UpdateEmpleadoResponse.
     * 
     * @return serviceStatus
     */
    public com.parametapages.empleado_ws.ServiceStatus getServiceStatus() {
        return serviceStatus;
    }


    /**
     * Sets the serviceStatus value for this UpdateEmpleadoResponse.
     * 
     * @param serviceStatus
     */
    public void setServiceStatus(com.parametapages.empleado_ws.ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateEmpleadoResponse)) return false;
        UpdateEmpleadoResponse other = (UpdateEmpleadoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceStatus==null && other.getServiceStatus()==null) || 
             (this.serviceStatus!=null &&
              this.serviceStatus.equals(other.getServiceStatus())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getServiceStatus() != null) {
            _hashCode += getServiceStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateEmpleadoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://parametapages.com/empleado-ws", ">updateEmpleadoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://parametapages.com/empleado-ws", "serviceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://parametapages.com/empleado-ws", "serviceStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
