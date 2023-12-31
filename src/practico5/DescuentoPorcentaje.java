package practico5;


public class DescuentoPorcentaje extends Descuento {
		
	@Override
	public double valorFinal(double valorInicial) {
		
		return valorInicial - (valorInicial * this.getValorDescuento());
	}

	public String getHayDescuento() {
		if(valor != 0) {
			return "Existe un descuento: " + valor +"%";
		}
		return "No existen descuentos";
	};
	
}
