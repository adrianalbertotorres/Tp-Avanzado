package market.data;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class IOFunciones {
	static List<ListaSalidaDAO> lista = new ArrayList();

	public static void LeeMercado(String dir) {

		ObjectMapper mapper = new ObjectMapper();

		try {
			URL url = new URL(dir);
			Mercado[] mercado = mapper.readValue(url, Mercado[].class);

			for (int i = 0; i < mercado.length; i++) {
				lista.add(new ListaSalidaDAO(mercado[i].getTicker(), mercado[i].getPrice(),
						mercado[i].getId()));

			}

		} catch (Exception e) {
			System.out.println(" Problema con el archivo de entrada ");
			System.exit(0);
		} finally {
			
		}
	}

	public static void EscribeListaSalida() {

		File fileOut = new File("C:\\TPAvanzado\\Salida1.json");
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			mapper.writeValue(fileOut, lista);
			
			Object[] options = { "OK" };
			JOptionPane.showOptionDialog(null, "En direcion (Raiz):\\TPAvanzado, colocar archivo Mercado para la proxima ejecucion", "Se genero archivo Salida1.Json ",
			JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
			null, options, options[0]);
			
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
