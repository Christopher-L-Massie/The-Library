package com.example.RealmLibrary.models.Library;

import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Book {

    //|||PROPERTIES|||

    @Id
    @GeneratedValue
    int id;

    private String displayName;

    private Timestamp timeCreated = new Timestamp(System.currentTimeMillis());

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Book(){}


}
