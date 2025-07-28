package chap01_3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Hero> list = new ArrayList<>();
		Hero h1 = new Hero();
		h1.name = "湊";
		list.add(h1);
		System.out.println("要素数" + list.size());
		h1 = new Hero();
		h1.name = "湊";
		list.remove(h1);
		System.out.println("要素数" + list.size());
		h1.equals(h1);
	}

}
