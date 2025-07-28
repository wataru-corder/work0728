package chap1_5;

import java.util.Objects;

public class Hero {
	public String name;
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hero other = (Hero) obj;
		return Objects.equals(name, other.name);
	}
	

}
