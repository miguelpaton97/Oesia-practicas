package com.ejemplos;

public class OperacionBancariaImpl implements OperacionBancaria{
	
	public void transferencia(ClienteBanco clienteEmisor, ClienteBanco clienteReceptor, float cantidad)
	{
		clienteEmisor.setSaldoCuenta(clienteEmisor.getSaldoCuenta() - cantidad);
		clienteReceptor.setSaldoCuenta(clienteReceptor.getSaldoCuenta() + cantidad);
	}
}
