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

    private Timestamp timeCreated = new Timestamp(System.currentTimeMillis());

    @OneToMany(cascade = CascadeType.ALL)
    @Max(2)
    private List<Bookcase> bookcases = new ArrayList<>();

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Isle(){}

    //|||ACCESSORS|||
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsleNumber() {
        return isleNumber;
    }

    public void setIsleNumber(int isleNumber) {
        this.isleNumber = isleNumber;
    }

    public Timestamp getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Timestamp timeCreated) {
        this.timeCreated = timeCreated;
    }

    public List<Bookcase> getBookcases() {
        return bookcases;
    }

    public void setBookcases(List<Bookcase> bookcases) {
        this.bookcases = bookcases;
    }
}
