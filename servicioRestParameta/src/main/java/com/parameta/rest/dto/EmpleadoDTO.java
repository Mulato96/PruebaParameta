package com.parameta.rest.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.parameta.rest.constantes.Constantes;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmpleadoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idEmpleado;

	@NotBlank(message = "el nombre no puede ir vacio")
	private String nombre;

	@NotBlank(message = "el tipo de documento no puede ir vacio")
	private String tipoDocumento;

	@NotBlank(message = "el numero de documento no puede ir vacio")
	private String numeroDocumento;

	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constantes.FECHA_PATTERN, timezone = Constantes.TIMEZONE)
	@JsonSerialize(as = Date.class)
	@NotNull(message = "la fecha de nacimiento no puede ir vacio")
	private Date fechaNacimiento;

	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constantes.FECHA_PATTERN, timezone = Constantes.TIMEZONE)
	@JsonSerialize(as = Date.class)
	@NotNull(message = "la fecha de vinculacion no puede ir vacio")
	private Date fechaVinculacion;

	@NotBlank(message = "el cargo no puede ir vacio")
	private String cargo;

	@NotNull(message = "el salario no puede ir vacio")
	private Double salario;

}
