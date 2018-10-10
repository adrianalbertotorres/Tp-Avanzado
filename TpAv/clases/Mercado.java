package clases;

public class Mercado {

	private String currency;
    private String ticker;
    private String exchange;
    private String id;
    private double price;
    private String name;
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Mercado [currency=" + currency + ", ticker=" + ticker + ", exchange=" + exchange + ", id=" + id
				+ ", price=" + price + ", name=" + name + "]";
	}
	
	
}
