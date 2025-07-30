package chap2_4;

public class Main {

	public static void main(String[] args) {
		Pocket<String,Integer> p = new Pocket();
		p.put("1192",200);
		String s = p.getD();
		int d = p.getT();
		System.out.println(s + " " + d);
	}

}
