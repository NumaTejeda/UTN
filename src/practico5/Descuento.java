package practico5;


public abstract class Descuento {
	
	private float valor;
	
	public float getValorDescuento() {
		 return valor;
	}
	public void setValorDescuento(float valor) {
		this.valor = valor;
	}
	public abstract float valorFinal(float valorInicial);	
}
