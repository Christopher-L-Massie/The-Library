package com.example.TheLibrary.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping(value = "test")
public class TestController {

    @RequestMapping(value = "character_creation")
    public String testCharacterCreator(Model model){

        return"home/index";
    }



}
