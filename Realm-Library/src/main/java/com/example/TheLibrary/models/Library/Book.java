package com.example.TheLibrary.models.Library;

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

    private Integer bookNumber;

    private String bookName;

    private int numberOfPages;

    private Timestamp timeCreated = new Timestamp(System.currentTimeMillis());

    @OneToMany(cascade = CascadeType.ALL)
    private List<Page> pages = new ArrayList<>();

    private boolean isSigned = false;

    private String editCode;

    private int timesOpened;

    private int timesRead;

    //|||METHODS|||

    public void createPage(int pageNumber,String pageContents){
        this.pages.add(new Page(pageNumber,pageContents));
        this.setNumberOfPages(pages.size());
    }

    public void updateStats(){
        int highestReadCount = 0;
        for (Page page : pages){
            if (page.getTimesRead() > highestReadCount){
                highestReadCount = page.getTimesRead();
            }
        }
        this.timesRead = highestReadCount;
    }

    public void signBook(){
        this.isSigned = true;
    }

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Book(){}

    public Book(int bookNumber,String bookName, String editCode){
        this.bookNumber = bookNumber;
        this.bookName = bookName;
        this.timeCreated = new Timestamp(System.currentTimeMillis());
        this.editCode = editCode;
    }

    //|||ACCESSORS|||

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
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

    public boolean isSigned(){return this.isSigned;}

    private void setSigned(boolean isSigned){this.isSigned=isSigned;}

    public int getNumberOfPages(){return this.numberOfPages;}

    public void setNumberOfPages(int numberOfPages){this.numberOfPages = numberOfPages;}

    public Integer getBookNumber(){return this.bookNumber;}

    private void setBookNumber(Integer bookNumber){this.bookNumber = bookNumber;}

    private int getTimesOpened() {return this.timesOpened;}
}
