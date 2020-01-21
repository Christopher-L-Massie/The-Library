package com.example.RealmLibrary.models.Library;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Building {

    //||PROPERTIES||

    @Id
    @GeneratedValue
    int id;

    private String libraryName;

    private Timestamp timeCreated = new Timestamp(System.currentTimeMillis());

    /*
    witty comment
    */

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Building(){}



}
