package practico5;


public class DescuentoFIjo extends Descuento {

	@Override
	public float valorFinal(float valorInicial) {
		return valorInicial - this.getValorDescuento();
	}
	
}
