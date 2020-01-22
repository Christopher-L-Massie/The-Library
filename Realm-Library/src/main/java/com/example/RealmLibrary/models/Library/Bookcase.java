package com.example.RealmLibrary.models.Library;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Bookcase {

    //|||PROPERTIES|||

    @Id
    @GeneratedValue
    int id;

    private int bookcaseNumber;

    private Timestamp timeCreated = new Timestamp(System.currentTimeMillis());

    @OneToMany(cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Bookcase(){}

    //|||ACCESSORS|||

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookcaseNumber() {
        return bookcaseNumber;
    }

    public void setBookcaseNumber(int bookcaseNumber) {
        this.bookcaseNumber = bookcaseNumber;
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

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
