package market.data;

import java.io.File;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] dir) {
		String dir1="";
		String dir2="";
		
		File TPAvanzado = new File("c:\\TPAvanzado");	
		TPAvanzado.mkdir();
		
		if (dir.length==1) {
		IOFunciones.LeeMercado(dir[0]);
		IOFunciones.EscribeListaSalida();
		
		}else
		if(dir.length==2) {
		dir1="C:\\TPAvanzado\\"+dir[0];
		dir2="C:\\TPAvanzado\\"+dir[1];
		Parte2.Proceso(dir1,dir2);
		}else {
		
		//"https://raw.githubusercontent.com/mlennard-utn/tp_avanzado/master/mercado.json"
		//Salida1.json Mercado.json
		
		Object[] options = { "OK" };
		JOptionPane.showOptionDialog(null, "Necesita tener 1 o 2 parametros de entrada", "archivo TP ",
		JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
		null, options, options[0]);
		
		}
		
	}
		
}