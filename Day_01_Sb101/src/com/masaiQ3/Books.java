package com.masaiQ3;

import java.util.Objects;

public class Books {
	private int Unique_id;
	private String bookName;
	private String BookAuthor;
	public Books(int unique_id, String bookName, String bookAuthor) {
		super();
		Unique_id = unique_id;
		this.bookName = bookName;
		BookAuthor = bookAuthor;
	}

	public Books() {
		super();
	}
	public int getUnique_id() {
		return Unique_id;
	}
	public void setUnique_id(int unique_id) {
		Unique_id = unique_id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	@Override
	public int hashCode() {
		return Objects.hash(BookAuthor, Unique_id, bookName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return Objects.equals(BookAuthor, other.BookAuthor) && Unique_id == other.Unique_id
				&& Objects.equals(bookName, other.bookName);
	}
	@Override
	public String toString() {
		return "Books [Unique_id=" + Unique_id + ", bookName=" + bookName + ", BookAuthor=" + BookAuthor + "]";
	}
	
}
