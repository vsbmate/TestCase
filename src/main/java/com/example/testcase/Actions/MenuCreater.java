package com.example.testcase.Actions;

import com.example.testcase.Models.MenuItem;
import com.example.testcase.Models.MenuTree;

public class MenuCreater {
    public MenuTree createMenu() {
        MenuItem root = new MenuItem("Menu");

        MenuItem item1 = new MenuItem("Жилищно-коммунальные услуги");
        MenuItem subItem1 = new MenuItem("Отопление");
        MenuItem subItem2 = new MenuItem("Вода");
        MenuItem subItem2_1 = new MenuItem("Горячая вода");
        MenuItem subItem2_2 = new MenuItem("Холодная вода");

        MenuItem item2 = new MenuItem("Детский сад");
        MenuItem subItem3 = new MenuItem("Ясли");
        MenuItem subItem4 = new MenuItem("Старшая группа");

        root.addSubItem(item1);
        root.addSubItem(item2);
        item1.addSubItem(subItem1);
        item1.addSubItem(subItem2);
        subItem2.addSubItem(subItem2_1);
        subItem2.addSubItem(subItem2_2);
        item2.addSubItem(subItem3);
        item2.addSubItem(subItem4);

        MenuTree menu = new MenuTree(root);

        return menu;
    }

}
