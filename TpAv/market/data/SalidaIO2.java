package market.data;

public class SalidaIO2 {
 
 private String id;
 private String creditpolicy;
 private int quantity;
  private int elegible_collateral;

  public SalidaIO2(String id2, String creditpolicy2, int amount, int cartera) {
	this.id=id2;
	this.creditpolicy=creditpolicy2;
	this.quantity=amount;
	this.elegible_collateral=cartera;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getCreditpolicy() {
	return creditpolicy;
}
public void setCreditpolicy(String creditpolicy) {
	this.creditpolicy = creditpolicy;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getElegible_collateral() {
	return elegible_collateral;
}
public void setElegible_collateral(int elegible_collateral) {
	this.elegible_collateral = elegible_collateral;
}




@Override
public String toString() {
	return "SalidaIO2 [id=" + id + ", creditpolicy=" + creditpolicy + ", quantity=" + quantity
			+ ", elegible_collateral=" + elegible_collateral + "]";
}
 
 
}
