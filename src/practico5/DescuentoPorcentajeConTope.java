package practico5;

public class DescuentoPorcentajeConTope extends Descuento{
	
	@Override
	public double valorFinal(double valorInicial) {
		if(valorInicial*valor > tope) {
			return valorInicial - tope;
		}
		return valorInicial - (valorInicial * valor);
	}

	@Override
	public String getHayDescuento() {
		if(valor != 0) {
			return "Existe un descuento: " + valor +"%";
		}
		return "No existen descuentos";
	}
}
