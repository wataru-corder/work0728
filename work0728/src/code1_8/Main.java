package code1_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();
		
		Account a1 = new Account();
		a1.number = 12345;
		a1.zandaka = 500;
		list.add(a1);
		
		Account a2 = new Account();
		a2.number = 23456;
		a2.zandaka = 100;
		list.add(a2);
		
		Collections.sort(list);
		
		for(Account a : list) {
			System.out.println(a.number + ":" + a.zandaka );
		}
	}

}
