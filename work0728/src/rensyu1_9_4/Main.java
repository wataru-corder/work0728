package rensyu1_9_4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Monster> list = new ArrayList<>();
		
		list.add(new Monster("お化けキノコ",10,false));
		list.add(new Monster("ゴブリン",25,false));
		list.add(new Monster("ドラゴン",120,true));
		
		for(Monster m : list) {
			System.out.println(
					"名前：" + m.name() + " "
					+ "体力：" + m.hp() + " "
					+ "BOSS：" + m.isBoss()
					);
		}
	}

}
