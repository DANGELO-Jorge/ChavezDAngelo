package com.google.buscador.venta.daos;


public class MySqlDAOFActory extends DAOFactory {

	
	@Override
	public ComputadoraDAO getComputadora() {
		return new MySqlComputadoraDAO();
	}

	@Override
	public ClienteDAO getCliente() {
		// TODO Auto-generated method stub
		return new MySqlClienteDAO();
	}

	
}
