package com.example.testcase.Models;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MenuItem> subItems;

    public MenuItem(String name) {
        this.name = name;
        subItems = new ArrayList<>();
    }

    public MenuItem() {

    }

    public void addSubItem(MenuItem subItem) {
        subItems.add(subItem);
    }

    public String getName() {
        return name;
    }

    public List<MenuItem> getSubItems() {
        return subItems;
    }


}

