package code1_8;

public class Account implements Comparable<Account>{
	int number;
	int zandaka;
	
	public int compareTo(Account obj) {
		if(this.number < obj.number) {
			return -1;
		}
		if(this.number > obj.number) {
			return 1;
		}
		return 0;
	}

}
