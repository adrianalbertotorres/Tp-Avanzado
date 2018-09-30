package market.data;

public class MainParte1 {

	public static void main(String[] direccion) {

		
		String dir = "";					//Toma paramertro direccion y lo convierte en String
		for (int i = 0; i < direccion.length; i++) {
			dir = dir + direccion[i];
		}

		IOArchico.Lee(dir);
		IOArchico.Escribe();
		
			
	}
}
