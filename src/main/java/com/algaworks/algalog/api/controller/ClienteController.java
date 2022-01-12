package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		Cliente cliente1 = new Cliente(1L, "João", "joaosilva@gmail.com", "83 6458-8582");
		Cliente cliente2 = new Cliente(2L, "Maria", "mariajose@hotmail.com", "83 3375-4145");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
