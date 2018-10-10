package market.data;

import java.io.File;

import javax.swing.JOptionPane;

import IO.IOFunciones;
import IO.Parte2;

/* Datos Utiles
 * 
Parametro  Pate 1 :"https://raw.githubusercontent.com/mlennard-utn/tp_avanzado/master/mercado.json"
Parametros Parte 2:		Salida1.json 	prestamos.json		


"https://github.com/adrianalbertotorres/Tp-Avanzado.git"
 */

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
		
		
			
		Object[] options = { "OK" };
		JOptionPane.showOptionDialog(null, "Necesita tener 1 o 2 parametros de entrada", "archivo TP ",
		JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
		null, options, options[0]);
		
		}
		
	}
		
}