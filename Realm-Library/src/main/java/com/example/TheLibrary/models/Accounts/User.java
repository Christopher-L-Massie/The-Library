package com.example.TheLibrary.models.Accounts;

import com.example.TheLibrary.models.Library.Book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    //|||PROPERTIES|||

    @Id
    @GeneratedValue
    int id;

    private String userName;

    private String password;

    private Timestamp timeCreated = new Timestamp(System.currentTimeMillis());

    @OneToMany
    private List<Book> booksWritten = new ArrayList<>();

    //|||CONSTRUCTORS|||

    //empty for database setup
    public User(){}

    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    //|||METHODS|||

    //|||ACCESSORS|||

    public String getUserName() {
        return userName;
    }

    public List<Book> getBooksWritten() { return booksWritten;}

}
