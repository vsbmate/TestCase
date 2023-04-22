package com.example.testcase.repository;

import com.example.testcase.Models.MenuTree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuTreeRepository extends JpaRepository<MenuTree, Long> {
    MenuTree findByRootSubItemsContaining(String name);
}
