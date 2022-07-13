package trainingday19COLLECTIONSstreams;

public class Pencil {
	private String brand;
	private int price;
	private String shade;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getShade() {
		return shade;
	}
	public void setShade(String shade) {
		this.shade = shade;
	}
	public Pencil(String brand, int price, String shade) {
		super();
		this.brand = brand;
		this.price = price;
		this.shade = shade;
	}
	
	public String toString() {
		return brand+" "+price+" "+shade;
	}

}
