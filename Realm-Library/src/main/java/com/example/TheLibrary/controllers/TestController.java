package com.example.TheLibrary.controllers;


import com.example.TheLibrary.models.data.BuildingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping(value = "test")
public class TestController {

    @Autowired
    public BuildingDao buildingDao;

    @RequestMapping(value = "character_creation")
    public String testCharacterCreator(Model model){

        System.out.println("hello");

        return"Test/index";
    }



}
