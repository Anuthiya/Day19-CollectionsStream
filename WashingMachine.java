package trainingday19COLLECTIONSstreams;

public class WashingMachine {
	private String brand;
	private int price;
	private String type;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getType() {
		return type;
	}
	public WashingMachine(String brand,int price,String type) {
		this.brand=brand;
		this.price=price;
		this.type=type;
	}
	public String toString() {
		return brand+" "+price+" "+type;
		
	}

}
