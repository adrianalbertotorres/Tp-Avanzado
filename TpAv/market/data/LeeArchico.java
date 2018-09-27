package market.data;

import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class LeeArchico {
	public static void Lee() {
		
		
		ObjectMapper mapper= new ObjectMapper();
		
		
		try {
			URL url = new URL("https://raw.githubusercontent.com/mlennard-utn/tp_avanzado/master/mercado.json");
			Accionista[] accionistas = mapper.readValue(url, Accionista[].class);
		
			for (Accionista accionista : accionistas) {
				System.out.println(accionista.getName());
			}
		
		
		
		
		
		
		} catch (Exception e) {

		} finally {
			
		}
	}
}
