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

public class Parte2 {


	public static void	 Proceso(String dir1,String dir2){
		

		try {
			
			    double cartera = 0;
				List<DetalleDeCuentasDAO> lista2 = new ArrayList();
				ObjectMapper mapper = new ObjectMapper();
				String referencia;
					
			File file2 = new File(dir1);
			Entrada1[] Mer=mapper.readValue(file2, Entrada1[].class);
			
			File file3 = new File(dir2);
			Prestamos[] Prs = mapper.readValue(file3, Prestamos[].class);
		
			

			for (int i = 0; i < Prs.length; i++) {
				for (int y = 0; y < Prs[i].getPositions().size(); y++) {
					referencia = Prs[i].getPositions().get(y).getId();
					for (int j = 0; j < Mer.length; j++) {
						if (referencia.compareTo(Mer[j].getIsin()) == 0) {
							cartera = cartera + (Mer[j].getPrice() * Prs[i].getPositions().get(y).getQuantity());
						}
					}
				}

				if (Prs[i].getAmount() > cartera) {
					lista2.add(
							new DetalleDeCuentasDAO(Prs[i].getId(), Prs[i].getCreditpolicy(), Prs[i].getAmount(), (int) cartera));
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
			

		} catch (JsonParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JsonMappingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();

		}finally {}
	}
}

