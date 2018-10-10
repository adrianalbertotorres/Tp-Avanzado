package clases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
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
	
		
		
	}

