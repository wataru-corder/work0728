package chap2_4;

public class Pocket<E,T> {
	private E data;
	private T time;
	public void put(E d,T t) {this.data= d; this.time = t;}
	public E getD() {return this.data; }
	public T getT() {return this.time; }
}
