/**
 * UpdateEmpleadoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.parametapages.empleado_ws;

public class UpdateEmpleadoRequest  implements java.io.Serializable {
    private com.parametapages.empleado_ws.EmpleadoInfo empleadoInfo;

    public UpdateEmpleadoRequest() {
    }

    public UpdateEmpleadoRequest(
           com.parametapages.empleado_ws.EmpleadoInfo empleadoInfo) {
           this.empleadoInfo = empleadoInfo;
    }


    /**
     * Gets the empleadoInfo value for this UpdateEmpleadoRequest.
     * 
     * @return empleadoInfo
     */
    public com.parametapages.empleado_ws.EmpleadoInfo getEmpleadoInfo() {
        return empleadoInfo;
    }


    /**
     * Sets the empleadoInfo value for this UpdateEmpleadoRequest.
     * 
     * @param empleadoInfo
     */
    public void setEmpleadoInfo(com.parametapages.empleado_ws.EmpleadoInfo empleadoInfo) {
        this.empleadoInfo = empleadoInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateEmpleadoRequest)) return false;
        UpdateEmpleadoRequest other = (UpdateEmpleadoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.empleadoInfo==null && other.getEmpleadoInfo()==null) || 
             (this.empleadoInfo!=null &&
              this.empleadoInfo.equals(other.getEmpleadoInfo())));
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
        if (getEmpleadoInfo() != null) {
            _hashCode += getEmpleadoInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateEmpleadoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://parametapages.com/empleado-ws", ">updateEmpleadoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empleadoInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://parametapages.com/empleado-ws", "empleadoInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://parametapages.com/empleado-ws", "empleadoInfo"));
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
