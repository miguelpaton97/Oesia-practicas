package com.ejemplos;

public interface OperacionBancaria {
	
	void transferencia(ClienteBanco clienteEmisor, ClienteBanco clienteReceptor, float cantidad);
	
}
