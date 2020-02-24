package com.ejemplos;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class OperacionBancariaTest {

	@Mock
	private FacadeClienteBanco facadeClienteBanco;
	
	private OperacionBancaria operacionBancaria;

	@Before
	public void init(){
		
		MockitoAnnotations.initMocks(this);
		operacionBancaria = new OperacionBancariaImpl();
		Mockito.when(facadeClienteBanco.findClienteBancoByDni("48914707D")).thenReturn(new ClienteBanco("48914707D", 1500));
		Mockito.when(facadeClienteBanco.findClienteBancoByDni("12345678D")).thenReturn(new ClienteBanco("12345678D", 5000));

	}
	
    @Test
    public void transferencia_emisor() {
    	ClienteBanco clienteEmisor = facadeClienteBanco.findClienteBancoByDni("48914707D");
    	ClienteBanco clienteReceptor = facadeClienteBanco.findClienteBancoByDni("12345678D");
    	operacionBancaria.transferencia(clienteEmisor, clienteReceptor, 500);
    	float saldoActual = clienteEmisor.getSaldoCuenta();
    	float saldoEsperado = 1000;
    	assertEquals(saldoEsperado, saldoActual, 0);
    }

   

}
