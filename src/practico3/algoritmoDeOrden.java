package practico3;

public class algoritmoDeOrden {

	public static void main(String[] args) {
			int arr[] = {5, 4, 7 , 1, 3};
			int orden[] = new int[5];
			
			for(int i = 0; i < orden.length; i++) {
				int guardar = 0;
				for(int j = 0; j < arr.length; j++) {
					if(guardar < arr[j]) {
						guardar = arr[j];
					}
					
					
				}
					
				orden[i] = guardar; 
				System.out.println(orden[i]);
			}	
			
			
			
			
	}
			

}


