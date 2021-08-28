package com.parameta.soap.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.parameta.soap.constantes.Constantes;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "EMPLEADO")
@Getter
@Setter
public class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "ID_EMPLEADO")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idEmpleado;

	@Basic(optional = false)
	@Column(name = "NOMBRE")
	private String nombre;

	@Basic(optional = false)
	@Column(name = "TIP_DOCUMENTO")
	private String tipoDocumento;

	@Basic(optional = false)
	@Column(name = "NUMERO_DOCUMENTO")
	private String numeroDocumento;

	@Basic(optional = false)
	@Column(name = "FECHA_NACIMIENTO")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constantes.FECHA_PATTERN, timezone = Constantes.TIMEZONE)
	@JsonSerialize(as = Date.class)
	private Date fechaNacimiento;

	@Basic(optional = false)
	@Column(name = "FECHA_VINCULACION")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constantes.FECHA_PATTERN, timezone = Constantes.TIMEZONE)
	@JsonSerialize(as = Date.class)
	private Date fechaVinculacion;

	@Basic(optional = false)
	@Column(name = "CARGO")
	private String cargo;

	@Basic(optional = false)
	@Column(name = "SALARIO")
	private Double salario;

}
