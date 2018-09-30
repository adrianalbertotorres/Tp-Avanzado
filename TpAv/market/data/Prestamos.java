package market.data;

import java.net.URL;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Prestamos {

	private int amount;
	private String creditpolicy;
	private String id;
	private ArrayList<Positions> positions= new ArrayList();
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCreditpolicy() {
		return creditpolicy;
	}
	public void setCreditpolicy(String creditpolicy) {
		this.creditpolicy = creditpolicy;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<Positions> getPositions() {
		return positions;
	}
	public void setPositions(ArrayList<Positions> positions) {
		this.positions = positions;
	}
	
	
	
	@Override
	public String toString() {
		return "Prestamos [amount=" + amount + ", creditpolicy=" + creditpolicy + ", id=" + id + ", positions="
				+ positions + "]";
	}
	public static void LeePrestamos(){
		
		ObjectMapper mapper = new ObjectMapper();

		try {
			URL url = new URL("https://raw.githubusercontent.com/adrianalbertotorres/Tp-Avanzado/master/prestamos.json");
			Prestamos[] Prs = mapper.readValue(url, Prestamos[].class);
			
			for (Prestamos string : Prs) {
				System.out.println(string.toString());
			}
		}catch(Exception e) {
				System.out.println("no archivo");
			}
	}
}
