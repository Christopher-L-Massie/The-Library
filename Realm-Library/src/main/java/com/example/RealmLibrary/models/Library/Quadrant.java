package com.example.RealmLibrary.models.Library;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import java.sql.Timestamp;

@Entity
public class Quadrant {

    //|||PROPERTIES|||

    @Id
    @GeneratedValue
    int id;

    @Max(4)
    private int quadrantNumber;

    private Timestamp timeCreated = new Timestamp(System.currentTimeMillis());

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Quadrant(){}
}
