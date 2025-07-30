package chap1_6;

import java.util.Objects;

public class Hero {
	public String name;
	public int hp;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(hp, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hero other = (Hero) obj;
		return hp == other.hp && Objects.equals(name, other.name);
	}
	

}
