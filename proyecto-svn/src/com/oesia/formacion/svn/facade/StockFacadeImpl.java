package com.oesia.formacion.svn.facade;

import java.util.HashMap;
import java.util.Map;

class StockFacadeImpl implements StockFacade{

	@Override
	public int calculateStock() {
		int stockOriginal = 50;
		int stockEnviado = 20;
		return stockOriginal - stockEnviado;
	}
	
	
}
