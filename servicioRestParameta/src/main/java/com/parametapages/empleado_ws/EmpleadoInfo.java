/**
 * EmpleadoInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.parametapages.empleado_ws;

public class EmpleadoInfo  implements java.io.Serializable {
    private long idEmpleado;

    private java.lang.String nombre;

    private java.lang.String tipoDocumento;

    private java.lang.String numeroDocumento;

    private java.util.Date fechaNacimiento;

    private java.util.Date fechaVinculacion;

    private java.lang.String cargo;

    private double salario;

    public EmpleadoInfo() {
    }

    public EmpleadoInfo(
           long idEmpleado,
           java.lang.String nombre,
           java.lang.String tipoDocumento,
           java.lang.String numeroDocumento,
           java.util.Date fechaNacimiento,
           java.util.Date fechaVinculacion,
           java.lang.String cargo,
           double salario) {
           this.idEmpleado = idEmpleado;
           this.nombre = nombre;
           this.tipoDocumento = tipoDocumento;
           this.numeroDocumento = numeroDocumento;
           this.fechaNacimiento = fechaNacimiento;
           this.fechaVinculacion = fechaVinculacion;
           this.cargo = cargo;
           this.salario = salario;
    }


    /**
     * Gets the idEmpleado value for this EmpleadoInfo.
     * 
     * @return idEmpleado
     */
    public long getIdEmpleado() {
        return idEmpleado;
    }


    /**
     * Sets the idEmpleado value for this EmpleadoInfo.
     * 
     * @param idEmpleado
     */
    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }


    /**
     * Gets the nombre value for this EmpleadoInfo.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this EmpleadoInfo.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the tipoDocumento value for this EmpleadoInfo.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this EmpleadoInfo.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the numeroDocumento value for this EmpleadoInfo.
     * 
     * @return numeroDocumento
     */
    public java.lang.String getNumeroDocumento() {
        return numeroDocumento;
    }


    /**
     * Sets the numeroDocumento value for this EmpleadoInfo.
     * 
     * @param numeroDocumento
     */
    public void setNumeroDocumento(java.lang.String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    /**
     * Gets the fechaNacimiento value for this EmpleadoInfo.
     * 
     * @return fechaNacimiento
     */
    public java.util.Date getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this EmpleadoInfo.
     * 
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(java.util.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the fechaVinculacion value for this EmpleadoInfo.
     * 
     * @return fechaVinculacion
     */
    public java.util.Date getFechaVinculacion() {
        return fechaVinculacion;
    }


    /**
     * Sets the fechaVinculacion value for this EmpleadoInfo.
     * 
     * @param fechaVinculacion
     */
    public void setFechaVinculacion(java.util.Date fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }


    /**
     * Gets the cargo value for this EmpleadoInfo.
     * 
     * @return cargo
     */
    public java.lang.String getCargo() {
        return cargo;
    }


    /**
     * Sets the cargo value for this EmpleadoInfo.
     * 
     * @param cargo
     */
    public void setCargo(java.lang.String cargo) {
        this.cargo = cargo;
    }


    /**
     * Gets the salario value for this EmpleadoInfo.
     * 
     * @return salario
     */
    public double getSalario() {
        return salario;
    }


    /**
     * Sets the salario value for this EmpleadoInfo.
     * 
     * @param salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmpleadoInfo)) return false;
        EmpleadoInfo other = (EmpleadoInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idEmpleado == other.getIdEmpleado() &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.numeroDocumento==null && other.getNumeroDocumento()==null) || 
             (this.numeroDocumento!=null &&
              this.numeroDocumento.equals(other.getNumeroDocumento()))) &&
            ((this.fechaNacimiento==null && other.getFechaNacimiento()==null) || 
             (this.fechaNacimiento!=null &&
              this.fechaNacimiento.equals(other.getFechaNacimiento()))) &&
            ((this.fechaVinculacion==null && other.getFechaVinculacion()==null) || 
             (this.fechaVinculacion!=null &&
              this.fechaVinculacion.equals(other.getFechaVinculacion()))) &&
            ((this.cargo==null && other.getCargo()==null) || 
             (this.cargo!=null &&
              this.cargo.equals(other.getCargo()))) &&
            this.salario == other.getSalario();
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
        _hashCode += new Long(getIdEmpleado()).hashCode();
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        if (getNumeroDocumento() != null) {
            _hashCode += getNumeroDocumento().hashCode();
        }
        if (getFechaNacimiento() != null) {
            _hashCode += getFechaNacimiento().hashCode();
        }
        if (getFechaVinculacion() != null) {
            _hashCode += getFechaVinculacion().hashCode();
        }
        if (getCargo() != null) {
            _hashCode += getCargo().hashCode();
        }
        _hashCode += new Double(getSalario()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmpleadoInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://parametapages.com/empleado-ws", "empleadoInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEmpleado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://parametapages.com/empleado-ws", "idEmpleado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://parametapages.com/empleado-ws", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://parametapages.com/empleado-ws", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://parametapages.com/empleado-ws", "numeroDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://parametapages.com/empleado-ws", "fechaNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaVinculacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://parametapages.com/empleado-ws", "fechaVinculacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://parametapages.com/empleado-ws", "cargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://parametapages.com/empleado-ws", "salario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
