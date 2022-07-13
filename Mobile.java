package trainingday19COLLECTIONSstreams;

public class Mobile {
	private String brand;
	private String model;
	private int cameraPixel;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCameraPixel() {
		return cameraPixel;
	}
	public void setCameraPixel(int cameraPixel) {
		this.cameraPixel = cameraPixel;
	}
	public Mobile(String brand, String model, int cameraPixel) {
		super();
		this.brand = brand;
		this.model = model;
		this.cameraPixel = cameraPixel;
	}
	public String toString() {
		return brand+" "+model+" "+cameraPixel;
	}
	
	

}
