package trainingday19COLLECTIONSstreams;

public class Pens1 {
	private String brand;
	private int price;
	private boolean isRefillable;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setIsRefillable(boolean isRefillable) {
		this.isRefillable=isRefillable;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public boolean getIsRefillable() {
		return isRefillable;
	}
	public Pens1(String brand,int price, boolean isRefillable) {
		this.brand=brand;
		this.price=price;
		this.isRefillable=isRefillable;
	}
	

}
