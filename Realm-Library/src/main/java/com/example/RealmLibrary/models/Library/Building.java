package com.example.RealmLibrary.models.Library;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Building {

    //||PROPERTIES||

    @Id
    @GeneratedValue
    int id;

    private String libraryName;

    private Timestamp timeCreated = new Timestamp(System.currentTimeMillis());

    @OneToMany(cascade = CascadeType.ALL)
    private List<Bookcase> bookcases = new ArrayList<>();

    /*
    witty comment
    */

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Building(){}




}
