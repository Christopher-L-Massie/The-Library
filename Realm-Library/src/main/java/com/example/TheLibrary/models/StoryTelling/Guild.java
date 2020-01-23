package com.example.TheLibrary.models.StoryTelling;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Guild {

    //|||PROPERTIES|||

    @Id
    @GeneratedValue
    private int id;

    private String guildName;

    private int guildSize;

    private String guildHistory;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Character> guildMembers = new ArrayList<>();

    private Timestamp timeCreated = new Timestamp(System.currentTimeMillis());

    //|||CONSTRUCTORS|||

    //empty for database setup
    public Guild(){}
}
