package com.algaworks.algalog.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;
import com.algaworks.algalog.repository.ClienteRepository;

@RestController
public class ClienteController {
	
	//UMA MANEIRA DE FAZER ACESSO AO BANCO COM ENTITYMANAGER PARA PROJETOS PEQUENO TESTES E ESTUDOS
	//@PersistenceContext
	//private EntityManager manager;
	@Autowired
	private ClienteRepository ClienteRepository;
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		return ClienteRepository.findByNome("Lázaro");
		
		//return manager.createQuery("from Cliente", Cliente.class).getResultList();
	}

}
