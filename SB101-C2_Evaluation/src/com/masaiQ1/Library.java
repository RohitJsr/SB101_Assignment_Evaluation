package com.masaiQ1;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    private ArrayList<Book> bookList=new ArrayList<Book>();
    
    public void setBookList(ArrayList<Book> bookList){
        this.bookList=bookList;
    }
    public ArrayList<Book> getBookList(){
        return bookList;
    }
    public void addBook(Book bobj)throws BookException{
        bookList.add(bobj);
    }
    public boolean isEmpty(){
        return bookList.isEmpty();
    }
    public ArrayList<Book> viewAllBooks()throws BookException{
        return bookList;
    }
    public ArrayList<Book> viewBooksByAuthor(String author)throws BookException{
        ArrayList<Book> result=new ArrayList<Book>();
        Iterator iter=bookList.iterator();
        while(iter.hasNext())
        {
            Book b=(Book)iter.next();
            if(b.getAuthor().equalsIgnoreCase(author))
            result.add(b);
        }
        return result;
    }
    public ArrayList<Book> viewBooksByIsbnNum(int isbn )throws BookException{
        ArrayList<Book> result1=new ArrayList<Book>();
        Iterator iter=bookList.iterator();
        while(iter.hasNext())
        {
            Book b1=(Book)iter.next();
            if(b1.getIsbn()==(isbn))
            result1.add(b1);
        }
        return result1;
    }
 
}
