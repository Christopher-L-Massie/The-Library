package com.example.RealmLibrary.models.StoryTelling;

import com.example.RealmLibrary.models.StoryTelling.Character;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Guild {


    @GeneratedValue
    private int id;

    private String guildName;

    private int guildSize;

    private String guildHistory;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Character> guildMembers = new ArrayList<>();
}
