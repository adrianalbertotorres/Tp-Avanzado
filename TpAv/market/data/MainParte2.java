package market.data;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class MainParte2 {

	public static void main(String[] args) {

		List<SalidaIO2> lista2 = new ArrayList();
		ObjectMapper mapper = new ObjectMapper();
		String referencia;

		double cartera = 0;
		

		try {
			URL url = new URL("https://raw.githubusercontent.com/mlennard-utn/tp_avanzado/master/prestamos.json");
			URL url2 = new URL("https://raw.githubusercontent.com/mlennard-utn/tp_avanzado/master/mercado.json");
			Prestamos[] Prs = mapper.readValue(url, Prestamos[].class);
			Mercado[] Mer = mapper.readValue(url2, Mercado[].class);

			for (int i = 0; i < Prs.length; i++) {
				for (int y = 0; y < Prs[i].getPositions().size(); y++) {
					referencia = Prs[i].getPositions().get(y).getId();
					for (int j = 0; j < Mer.length; j++) {
						if (referencia.compareTo(Mer[j].getId()) == 0) {
							cartera = cartera + (Mer[j].getPrice() * Prs[i].getPositions().get(y).getQuantity());
						}
					}
				}

				if (Prs[i].getAmount() > cartera) {
					lista2.add(
							new SalidaIO2(Prs[i].getId(), Prs[i].getCreditpolicy(), Prs[i].getAmount(), (int) cartera));
				}

				cartera = 0;
			}

			File fileOut2 = new File("C:\\TPAvanzado\\Salida2.json");
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			mapper.writeValue(fileOut2, lista2);
			System.out.println("Archivo \"Salida2.Json\" generado en direccion: "+"C:\\TPAvanzado\\Salida2.json");
			
			for (int i = 0; i < lista2.size(); i++) {
				System.out.println(lista2.get(i).toString());
			}
			

		} catch (JsonParseException e) {
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
