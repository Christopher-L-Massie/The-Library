package com.example.TheLibrary.models.Library;

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
    private List<Isle> isles = new ArrayList<>();

    //|||METHODS|||

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Building(){}

    //|||ACCESSORS|||


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public Timestamp getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Timestamp timeCreated) {
        this.timeCreated = timeCreated;
    }

    public List<Isle> getIsles() {
        return isles;
    }

    public void setIsles(List<Isle> isles) {
        this.isles = isles;
    }
}
