package com.example.RealmLibrary.models.Library;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;

@Entity
public class Shelf {

    @Id
    @GeneratedValue
    int id;

    @Max(5)
    private int shelfNumber;

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Shelf(){}
}
