package chap1_13;

public class Main {

	public static void main(String[] args) {
		LoginHistory h = new LoginHistory("USER1",0, true);
		System.out.println("ログインを試みたユーザーは" + h.user());
	}

}
