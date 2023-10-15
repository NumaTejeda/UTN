package practico5;


public class DescuentoPorcentaje extends Descuento {
	private float porcentaje;

	@Override
	public float valorFinal(float valorInicial) {
		
		return valorInicial - (valorInicial * porcentaje);
	}

}
