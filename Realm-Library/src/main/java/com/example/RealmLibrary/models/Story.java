package com.example.RealmLibrary.models;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class Story {

    @Id
    @GeneratedValue
    int id;

    private String storyTitle;

    private String storyText;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Character> involvedCharacters = new ArrayList<>();

    
}
