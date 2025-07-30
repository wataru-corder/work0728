package rensyu1_9;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>{
	private String title;
	private Date publishDate;
	private String comment;
	
	
	
	public Book() {
	}

	public Book(String title, Date publishDate, String comment) {
		this.title = title;
		this.publishDate = publishDate;
		this.comment = comment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(publishDate, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(publishDate, other.publishDate)
				&& Objects.equals(title, other.title);
	}


	@Override
	public int compareTo(Book o) {
		return this.publishDate.compareTo(o.publishDate);
	}
	
	public Book clone() {
		Book b = new Book();
		b.title = this.title;
		b.comment = this.comment;
		b.publishDate = (Date)this.publishDate.clone();
		return b;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
