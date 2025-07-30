package chap1_13;

public record LoginHistory(String user, int retry, boolean result) {
	public LoginHistory{
		if(retry < 2) throw new IllegalArgumentException();
	}
}
