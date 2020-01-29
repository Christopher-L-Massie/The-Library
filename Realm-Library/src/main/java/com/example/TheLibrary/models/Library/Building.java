package com.example.TheLibrary.models.Library;

import com.example.TheLibrary.models.data.BookDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Building {

    //||DAO||

    @Autowired
    private BookDao bookDao;

    //||PROPERTIES||

    @Id
    @GeneratedValue
    int id;

    private String libraryName;

    private Timestamp timeCreated = new Timestamp(System.currentTimeMillis());

    @OneToMany(cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();

    //|||METHODS|||

    public void addBook(String bookName, String pageContents){
        Book book = new Book((books.size()),bookName);
        book.createPage((book.getNumberOfPages() + 1),pageContents);
        bookDao.save(book);
    }

    public void saveBook(Integer bookNumber){
        for (Book book: bookDao.findAll()){
            if (bookNumber.equals(book.getBookNumber())){
                bookDao.save(book);
            }
        }
    }

    public void saveBook(Book book){
        bookDao.save(book);
    }

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Building(){}

    public Building(String libraryName){
        this.libraryName = libraryName;
        this.timeCreated = new Timestamp (System.currentTimeMillis());
    }

    //|||ACCESSORS|||


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public Timestamp getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Timestamp timeCreated) {
        this.timeCreated = timeCreated;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBook(List<Book> books) {
        this.books = books;
    }
}
