package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IClienteService;
import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;

@Service
public class ClienteService implements IClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Override
	public void addCliente(Cliente cliente) {
		clienteRepository.save(cliente);

	}

	@Override
	public List<Cliente> list_all() {
		// TODO Auto-generated method stub
		return (List<Cliente>)clienteRepository.findAll();
	}

	@Override
	public Cliente findCliente(int id) {
		// TODO Auto-generated method stub
		return clienteRepository.findById(id).orElse(null);
	}

	@Override
	public void modifyCliete(Cliente cliente) {
		clienteRepository.save(cliente);

	}

	@Override
	public void deleteCliente(int id) {
		clienteRepository.deleteById(id);

	}

}
