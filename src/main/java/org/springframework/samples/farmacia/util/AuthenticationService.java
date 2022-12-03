package org.springframework.samples.farmacia.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.farmacia.empleado.Empleado;
import org.springframework.samples.farmacia.empleado.EmpleadoService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	@Autowired
	private EmpleadoService empleadoService;
	
	public Authentication getAuthentication() {
		return SecurityContextHolder.getContext().getAuthentication();
	}
	
	public User getUser(){
		
		return (User) getAuthentication().getPrincipal();
	}
	
	public Empleado getEmpleado() {
		return empleadoService.getEmpleadoByUsername(getUser().getUsername());	
	}
	
}