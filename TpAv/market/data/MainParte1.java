package market.data;

public class MainParte1 {

	public static void main(String[] dir) {

			
		if (dir.length==1) {
		IOArchico.Lee(dir[0]);
		IOArchico.Escribe();
		Parte2.Proceso();
		}
		if(dir.length==2) {}
		
		
	}
}