package com.example.TheLibrary.models.Library;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Page {

    //|||PROPERTIES|||

    @Id
    @GeneratedValue
    int id;

    private int pageNumber;

    private String pageContents;

    private Timestamp timeCreated = new Timestamp(System.currentTimeMillis());

    private int timesRead;

    //|||METHODS|||

    public void read(){
        timesRead++;
    }

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Page(){}

    public Page(int pageNumber, String pageContents){
        this.pageNumber = pageNumber;
        this.pageContents = pageContents;
        this.timeCreated = new Timestamp(System.currentTimeMillis());
    }

    //|||ACCESSORS||

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getPageContents() {
        return pageContents;
    }

    public void setPageContents(String pageContents) {
        this.pageContents = pageContents;
    }

    public Timestamp getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Timestamp timeCreated) {
        this.timeCreated = timeCreated;
    }

    public int getTimesRead(){return this.timesRead;}
}
