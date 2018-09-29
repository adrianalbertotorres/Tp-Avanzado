package market.data;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class IOArchico {
	static List<AccionistaSalida> lista = new ArrayList();

	public static void Lee(String dir) {

		ObjectMapper mapper = new ObjectMapper();

		try {
			URL url = new URL(dir);
			Accionista[] accionistas = mapper.readValue(url, Accionista[].class);

			for (int i = 0; i < accionistas.length; i++) {
				lista.add(new AccionistaSalida(accionistas[i].getTicker(), accionistas[i].getPrice(),
						accionistas[i].getId()));

			}

		} catch (Exception e) {
			System.out.println("archivo");
		} finally {

		}
	}

	public static void Escribe() {

		File fileOut = new File("C:\\Users\\Adri\\git\\Tp-Avanzado\\Salida.json");
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			mapper.writeValue(fileOut, lista);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
