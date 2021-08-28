package com.parameta.soap.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.parameta.soap.modelo.Empleado;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {

	Empleado findByIdEmpleado(long empleadoId);

	List<Empleado> findByNumeroDocumento(String numeroDocumento);
}
