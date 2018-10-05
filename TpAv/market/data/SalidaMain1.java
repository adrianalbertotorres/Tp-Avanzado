package market.data;

public class SalidaMain1 {

	private String ticker;
	private double price;
	private String isin;
	public SalidaMain1(String ticker, double price, String isin) {
		super();
		this.ticker = ticker;
		this.price = price;
		this.isin = isin;
	}
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getISIN() {
		return isin;
	}
	public void setISIN(String iSIN) {
		isin = iSIN;
	}
	
	
	
	
}
