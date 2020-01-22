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
}
