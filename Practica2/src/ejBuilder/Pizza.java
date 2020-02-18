package ejBuilder;

public class Pizza{
	
	private String masa;
	private String salsa;
	private String relleno;
	
	
	public String getMasa() {
		return masa;
	}
	public void setMasa(String masa) {
		this.masa = masa;
	}
	public String getSalsa() {
		return salsa;
	}
	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}
	public String getRelleno() {
		return relleno;
	}
	public void setRelleno(String relleno) {
		this.relleno = relleno;
	}
	@Override
	public String toString() {
		return "Pizza [masa = " + masa + ", salsa = " + salsa + ", relleno = " + relleno + "]";
	}
	
	

}
