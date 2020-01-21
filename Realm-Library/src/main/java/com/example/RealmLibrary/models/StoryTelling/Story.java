package com.example.RealmLibrary.models.StoryTelling;

import com.example.RealmLibrary.models.StoryTelling.Character;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Story {

    @Id
    @GeneratedValue
    int id;

    private String storyTitle;

    private String storyText;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Character> involvedCharacters = new ArrayList<>();

    private Timestamp timeCreated = new Timestamp(System.currentTimeMillis());

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Story(){}


}
