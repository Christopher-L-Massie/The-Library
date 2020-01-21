package com.example.RealmLibrary.models.StoryTelling;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Character {

    //|||PROPERTIES|||

    @Id
    @GeneratedValue
    private int id;

    private String characterName;

    private String guildName;

    private String race;

    private String characterClass;

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Character(){}


}
