package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.model.Cliente;

public interface IClienteService {

	public void addCliente(Cliente cliente);
	public List<Cliente> listAll();
	public Cliente findCliente(int id);
	public void modifyCliete(Cliente cliente);
	public void deleteCliente(int id);
	
}
