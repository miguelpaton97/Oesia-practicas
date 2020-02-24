package com.oesia.formacion.svn.facade;

class OrderFacadeImpl implements OrderFacade {

	@Override
	public void sendOrder() {
		System.out.println("Enviando pedido");
		
	}

	@Override
	public void receiveMethod() {
		System.out.println("Recibiendo pedido");
	}
	

}