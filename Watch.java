package trainingday19COLLECTIONSstreams;

public class Watch {
	private String brand;
	private int price;
	private boolean isLeather;
	
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
	public boolean getIsLeather() {
		return isLeather;
	}
	public void setIsLeather(boolean isLeather) {
		this.isLeather = isLeather;
	}
	public Watch(String brand, int price, boolean isLeather) {
		
		this.brand = brand;
		this.price = price;
		this.isLeather = isLeather;
	}
	
	public String toString() {
		return brand+" "+price+" "+isLeather;
	}

}
