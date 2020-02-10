package com.example.TheLibrary.controllers;


import com.example.TheLibrary.models.Library.Book;
import com.example.TheLibrary.models.data.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping(value = "test")
public class TestController {

    @Autowired
    public BookDao bookDao;

    @RequestMapping(value = "book")
    public String testCharacterCreator(Model model){

        Book newBook = new Book(1,"The Test");
        newBook.createPage(1,"Hello a test book");
        bookDao.save(newBook);

        for(Book book: bookDao.findAll()){
           System.out.println(book);
        }

        System.out.println("hello");

        return"Test/index";
    }



}
