package market.data;

public class AccionistaSalida {

	private String ticker;
	private double price;
	private String ISIN;
	public AccionistaSalida(String ticker, double price, String iSIN) {
		super();
		this.ticker = ticker;
		this.price = price;
		ISIN = iSIN;
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
		return ISIN;
	}
	public void setISIN(String iSIN) {
		ISIN = iSIN;
	}
	@Override
	public String toString() {
		return "AccionistaSalida [ticker=" + ticker + ", price=" + price + ", ISIN=" + ISIN + "]";
	}
	
	
}
