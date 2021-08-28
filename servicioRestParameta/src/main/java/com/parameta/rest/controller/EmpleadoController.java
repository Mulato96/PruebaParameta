package com.parameta.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parameta.rest.dto.EmpleadoDTO;
import com.parameta.rest.service.IEmpleadoService;
import com.parameta.rest.utilities.ResponseService;
import com.parameta.rest.utilities.Status;

@RestController
@RequestMapping("/empleado")
@CrossOrigin(origins = "*")
public class EmpleadoController {

	@Autowired
	private IEmpleadoService empleadoService;

	
	@GetMapping
	public ResponseEntity<ResponseService> GetSoapEmpleado() {
		ResponseService response = new ResponseService();

		try {
			response.setData(empleadoService.GetSoapEmpleado());
			response.setStatus(Status.OK);
		} catch (Exception e) {
			response.setStatus(Status.FAILURE);
			response.setMessageError("Ocurrio un error al consultar el servicio." + e.getMessage());
		}

		return ResponseEntity.ok(response);
	}
	
	
	@PostMapping
	public ResponseEntity<ResponseService> AddSoapEmpleado(@RequestBody @Validated EmpleadoDTO empleadoDTO) {
		ResponseService response = new ResponseService();

		try {
			response.setData(empleadoService.AddSoapEmpleado(empleadoDTO));
			response.setStatus(Status.OK);
		} catch (Exception e) {
			response.setStatus(Status.FAILURE);
			response.setMessageError("Ocurrio un error al consultar el servicio." + e.getMessage());
		}

		return ResponseEntity.ok(response);
	}

	@PutMapping
	public ResponseEntity<ResponseService> UpdateSoapEmpleado(@RequestBody @Validated EmpleadoDTO empleadoDTO) {
		ResponseService response = new ResponseService();

		try {
			response.setData(empleadoService.UpdateSoapEmpleado(empleadoDTO));
			response.setStatus(Status.OK);
		} catch (Exception e) {
			response.setStatus(Status.FAILURE);
			response.setMessageError("Ocurrio un error al consultar el servicio." + e.getMessage());
		}

		return ResponseEntity.ok(response);
	}

	@DeleteMapping("/{idEmpleado}")
	public ResponseEntity<ResponseService> DeleteSoapEmpleado(@PathVariable Long idEmpleado) {
		ResponseService response = new ResponseService();

		try {
			response.setData(empleadoService.DeleteSoapEmpleado(idEmpleado));
			response.setStatus(Status.OK);
		} catch (Exception e) {
			response.setStatus(Status.FAILURE);
			response.setMessageError("Ocurrio un error al consultar el servicio." + e.getMessage());
		}

		return ResponseEntity.ok(response);
	}

}
