
public class Car {
	int serial;
	String name;
	static int cnt = 0;
	static {
		cnt = 100;
	}
	public Car(String name) {
		this.serial = cnt++;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Car [serial=" + serial + ", name=" + name + "]";
	}
	
	
}
