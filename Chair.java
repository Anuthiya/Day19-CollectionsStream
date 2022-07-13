package trainingday19COLLECTIONSstreams;

public class Chair {
	private String brand;
	private int price;
	private String material;
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
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Chair(String brand, int price, String material) {
		super();
		this.brand = brand;
		this.price = price;
		this.material = material;
	}
	
	public String toString() {
		return brand+" "+price+" "+material;
	}

}
