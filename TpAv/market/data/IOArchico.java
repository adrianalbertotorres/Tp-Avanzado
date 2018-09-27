package market.data;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class IOArchico {
	public static void Lee() {

		ObjectMapper mapper = new ObjectMapper();
		List<AccionistaSalida> lista = new ArrayList();

		try {
			URL url = new URL("https://raw.githubusercontent.com/mlennard-utn/tp_avanzado/master/mercado.json");
			Accionista[] accionistas = mapper.readValue(url, Accionista[].class);

			for (int i = 0; i < accionistas.length; i++) {
				lista.add(new AccionistaSalida(accionistas[i].getTicker(), accionistas[i].getPrice(), accionistas[i].getId()));
              
			}
			
		// continuar	

		} catch (Exception e) {

		} finally {

		}
	}
}
