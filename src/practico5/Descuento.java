package practico5;


public abstract class Descuento {
	protected double valor;
	protected double tope;
	

	public abstract String getHayDescuento();
	public abstract double valorFinal(double valorInicial);
	
	public double getValorDescuento() {
		 return valor;
	}
	public void setValorDescuento(double valor) {
		this.valor = valor;
	}

	
	public double getTope() {
		return tope;
	}
	
	public void setTope(double tope) {
		this.tope = tope;
	}
}
