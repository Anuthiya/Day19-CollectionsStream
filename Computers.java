package trainingday19COLLECTIONSstreams;

public class Computers {
	private String name;
	private int ramSpeed;
	private boolean isIos;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRamSpeed() {
		return ramSpeed;
	}
	public void setRamSpeed(int ramSpeed) {
		this.ramSpeed = ramSpeed;
	}
	public boolean getIsIos() {
		return isIos;
	}
	public void setIOS(boolean isIos) {
		this.isIos = isIos;
	}
	
	
	public Computers(String name, int ramSpeed, boolean isIos) {
		super();
		this.name = name;
		this.ramSpeed = ramSpeed;
		this.isIos = isIos;
	}
	
	public String toString() {
		return name+" "+ramSpeed+" "+isIos;
		
	}

}
