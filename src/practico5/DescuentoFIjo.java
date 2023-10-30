package practico5;


public class DescuentoFijo extends Descuento {

	@Override
	public double valorFinal(double valorInicial) {
		return valorInicial - this.getValorDescuento();
	}
	
	public String getHayDescuento() {
		if(valor != 0) {
			return "Existe un descuento de: " + "$" + valor;
		}
		return "No existen descuentos";
	};
}
