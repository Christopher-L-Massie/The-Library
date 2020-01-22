package com.example.RealmLibrary.models.Library;

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

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Shelf(){}
}
