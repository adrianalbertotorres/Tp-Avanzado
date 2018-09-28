package market.data;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class IOArchico {

	public static void Lee(String dir) {

		ObjectMapper mapper = new ObjectMapper();
		List<AccionistaSalida> lista = new ArrayList();

		try {
			URL url = new URL(dir);
			Accionista[] accionistas = mapper.readValue(url, Accionista[].class);

			for (int i = 0; i < accionistas.length; i++) {
				lista.add(new AccionistaSalida(accionistas[i].getTicker(), accionistas[i].getPrice(),
						accionistas[i].getId()));

			}

			for (AccionistaSalida a : lista) {
				System.out.println(a.toString());
			}

		} catch (Exception e) {
			System.out.println("archivo");
		} finally {

		}
	}

	public static void Escribe() {

		// File fileOut=new File("C:\\Users\\Adri\\git\\Tp-Avanzado\\Salida.json");
		// Accionista[] accionistas = mapper.readValue(url, Accionista[].class);
	}
}
