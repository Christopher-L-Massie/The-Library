package com.example.RealmLibrary.models.Library;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {

    //|||PROPERTIES|||

    @Id
    @GeneratedValue
    int id;

    private String displayName;

    private Timestamp timeCreated = new Timestamp(System.currentTimeMillis());

    @OneToMany(cascade = CascadeType.ALL)
    private List<Page> pages = new ArrayList<>();

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Book(){}

    //|||ACCESSORS|||

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Timestamp getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Timestamp timeCreated) {
        this.timeCreated = timeCreated;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }
}
