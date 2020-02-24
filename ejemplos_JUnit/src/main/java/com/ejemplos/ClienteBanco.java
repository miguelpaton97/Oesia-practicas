package com.ejemplos;

public class ClienteBanco {

	private String dni;
	private float saldoCuenta;
	
	public ClienteBanco(String dni, float saldoCuenta) {
		super();
		this.dni = dni;
		this.saldoCuenta = saldoCuenta;
	}
	public float getSaldoCuenta() {
		return saldoCuenta;
	}
	public void setSaldoCuenta(float saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
}
