package market.data;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainParte2 {

	public static void main(String[] args) {

		// Prestamos.LeePrestamos();
		// Prestamos.LeerMercado();

		ObjectMapper mapper = new ObjectMapper();
		String referencia;

		double cartera = 0;
		double cartera1 = 0;

		try {

			URL url = new URL(
					"https://raw.githubusercontent.com/adrianalbertotorres/Tp-Avanzado/master/prestamos.json");
			URL url2 = new URL("https://raw.githubusercontent.com/mlennard-utn/tp_avanzado/master/mercado.json");
			Prestamos[] Prs = mapper.readValue(url, Prestamos[].class);
			Mercado[] Mer = mapper.readValue(url2, Mercado[].class);

			/*
			 * for (Prestamos string : Prs) { System.out.println(string.toString()); } for
			 * (Mercado mercado : Mer) { System.out.println(mercado.toString()); }
			 */

			for (int i = 0; i < Prs.length; i++) {
				for (int y = 0; y < Prs[i].getPositions().size(); y++) {

					// System.out.println(Prs[i].getPositions().get(y).getId());

					referencia = Prs[i].getPositions().get(y).getId();

					for (int j = 0; j < Mer.length; j++) {
						if (referencia.compareTo(Mer[j].getId()) == 0) {
							cartera = cartera + (Mer[j].getPrice() * Prs[i].getPositions().get(y).getQuantity());
						//	System.out.println(cartera);
						}

					}

				}
				//System.out.println("cartera   " + cartera);
				if (Prs[i].getAmount()>cartera) {
				System.out.println(Prs[i].getId()+"   solicitado:" + Prs[i].getAmount() + "    garantia: " + (int)cartera  );
				}
											
				cartera = 0;
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
