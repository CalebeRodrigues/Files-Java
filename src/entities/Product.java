package entities;

public class Product {

	private String name;
	private int quantity;
	private double price;
	
	public Product(String source) {
	    String vect[] = source.split(",");
		name = vect[0];
		quantity = Integer.parseInt(vect[2]);
		price = Double.parseDouble(vect[1]);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return name+ "," + (price*quantity);
	} 
}
