package com.example.RealmLibrary.models.Library;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {

    //|||PROPERTIES|||

    @Id
    @GeneratedValue
    int id;

    private String displayName;

    private Timestamp timeCreated = new Timestamp(System.currentTimeMillis());

    @OneToMany(cascade = CascadeType.ALL)
    private List<Page> pages = new ArrayList<>();

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Book(){}


}
