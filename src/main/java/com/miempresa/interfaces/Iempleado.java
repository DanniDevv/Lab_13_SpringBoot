package com.miempresa.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miempresa.modelo.Empleado;

@Repository
public interface Iempleado extends CrudRepository<Empleado, Integer> {
	
}
