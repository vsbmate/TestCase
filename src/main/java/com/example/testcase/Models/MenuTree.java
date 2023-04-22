package com.example.testcase.Models;

import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.*;

@Entity
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MenuTree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)

    private MenuItem root;

    public MenuTree(MenuItem root) {
        this.root = root;
    }

    public MenuTree() {

    }

    public MenuItem getRoot() {
        return root;
    }
}

