package com.example.RealmLibrary.models.Library;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Isle {

    //|||PROPERTIES|||

    @Id
    @GeneratedValue
    int id;

    private int isleNumber;

    @Max(4)
    private int isleQuadrant;

    private Timestamp timeCreated = new Timestamp(System.currentTimeMillis());

    @OneToMany(cascade = CascadeType.ALL)
    private List<Bookcase> bookcases = new ArrayList<>();

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Isle(){}

}
