package chap01_3;

public class Hero {
	public String name;
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(!(o instanceof Hero)) return false;
		Hero h = (Hero)o;
		if(!this.name.trim().equals(h.name.trim())) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + "]";
	}
	
}
