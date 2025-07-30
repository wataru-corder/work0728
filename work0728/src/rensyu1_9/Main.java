package rensyu1_9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		List<Book> books = new ArrayList<>();
		
		Book b1 = new Book();
		b1.setTitle("Java入門");
		try {
			b1.setPublishDate(f.parse("2011/10/07"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		b1.setComment("すっきりわかる");
		books.add(b1);
		
		Book b2 = new Book();
		b2.setTitle("Python入門");
		try {
			b2.setPublishDate(f.parse("2019/06/11"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		b2.setComment("カレーが食べたくなる");
		books.add(b2);
		
		Book b3 = new Book();
		b3.setTitle("C言語入門");
		try {
			b3.setPublishDate(f.parse("2018/06/21"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		b3.setComment("ポインタも自由自在わかる");
		books.add(b3);
		
		Collections.sort(books, new TitleComparator());
		
		for(Book b : books) {
			System.out.println(b.getTitle() 
					+ " " + f.format(b.getPublishDate()) 
					+ " " +b.getComment());
		}
	}

}
