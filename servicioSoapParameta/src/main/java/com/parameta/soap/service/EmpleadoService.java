package com.parameta.soap.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parameta.soap.modelo.Empleado;
import com.parameta.soap.repository.EmpleadoRepository;

@Service
public class EmpleadoService implements IEmpleadoService {

	@Autowired
	private EmpleadoRepository empleadoRepository;

	@Override
	public List<Empleado> getAllEmpleados() {
		List<Empleado> list = new ArrayList<>();
		empleadoRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public Empleado getEmpleadoById(long empleadoId) {
		return empleadoRepository.findByIdEmpleado(empleadoId);
	}

	@Override
	public synchronized boolean addEmpleado(Empleado empleado) {
		List<Empleado> list = empleadoRepository.findByNumeroDocumento(empleado.getNumeroDocumento());
		if (!list.isEmpty()) {
			return false;
		} else {
			empleado = empleadoRepository.save(empleado);
			return true;
		}
	}

	@Override
	public void updateEmpleado(Empleado empleado) {
		empleadoRepository.save(empleado);

	}

	@Override
	public void deleteEmpleado(Empleado empleado) {
		empleadoRepository.delete(empleado);

	}

}
