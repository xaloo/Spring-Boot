package com.xalo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioService extends UserDetailsService {
	
	@Override
	public UserDetails loadUserByUsername(String username);


}
