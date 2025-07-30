package rensyu1_9_4;

public record Monster(String name, int hp, boolean isBoss) {
	public Monster {
		if(hp < 0) throw new IllegalArgumentException();
	}
}
