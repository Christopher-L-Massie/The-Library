package com.example.RealmLibrary.models.Library;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Bookcase {

    @Id
    @GeneratedValue
    int id;

    private int bookcaseNumber;

    private Timestamp timeCreated = new Timestamp(System.currentTimeMillis());

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Bookcase(){}
}
