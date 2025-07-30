package code1_12;

public class Sword implements Cloneable{
	String name;
	
	public Sword clone() {
		Sword result = new Sword();
		result.name = this.name;
		return result;
	}
	
	public Sword() {}

	public Sword(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
