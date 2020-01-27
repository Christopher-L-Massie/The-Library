package com.example.TheLibrary.models.Library;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Shelf {

    //|||PROPERTIES|||

    @Id
    @GeneratedValue
    int id;

    @Max(5)
    private int shelfNumber;

    private Timestamp timeCreated = new Timestamp(System.currentTimeMillis());

    @OneToMany(cascade = CascadeType.ALL)
    @Max(5)
    private List<Book> books = new ArrayList<>();

    private boolean isFull = false;

    //|||METHODS|||

    public boolean addBook(Book book){
        if (5 > this.books.size()){
            this.books.add(book);
            return this.isFull();
        } else {
            this.full();
            return this.isFull();
        }
    }

    public void full(){
        this.isFull = true;
    }

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Shelf(){}

    public Shelf(int shelfNumber){
        this.shelfNumber = shelfNumber;
    }

    //|||ACCESSORS|||

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
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

    public boolean isFull(){return this.isFull;}

    private void setFull(boolean isFull){this.isFull = isFull;}
}
