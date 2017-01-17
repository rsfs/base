package com.datatoinfo.app.base.service.client;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datatoinfo.app.base.model.client.Cliente;
import com.datatoinfo.app.base.repository.client.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;

	public Cliente cadastrar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public Collection<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	public void excluir(Cliente cliente) {
		clienteRepository.delete(cliente);
	}

	public Cliente buscarPorId(Integer id) {
		return clienteRepository.findOne(id);
	}

	public Cliente alterar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}