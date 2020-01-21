package com.example.RealmLibrary.models.Library;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Page {

    @Id
    @GeneratedValue
    int id;

    private int pageNumber;

    private String pageContents;

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Page(){}
}
