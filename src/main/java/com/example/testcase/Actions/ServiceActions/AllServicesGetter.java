package com.example.testcase.Actions.ServiceActions;

import com.example.testcase.Actions.MenuCreater;
import com.example.testcase.Models.MenuTree;
import com.example.testcase.repository.MenuTreeRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller

public class AllServicesGetter {
    private final MenuTreeRepository menuTreeRepository;


    public AllServicesGetter(MenuTreeRepository menuTreeRepository) {
        this.menuTreeRepository = menuTreeRepository;
    }

    @GetMapping("/getallservices")
    @ResponseBody
    public String getAllServices(){

        Optional<MenuTree> optionalMenu = menuTreeRepository.findById(1L);
        MenuTree menu;
        if (optionalMenu.isPresent()) {
            menu = optionalMenu.get();
        } else {
            MenuCreater menuCreater = new MenuCreater();
            menu = menuCreater.createMenu();
            menuTreeRepository.save(menu);
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(menuTreeRepository.findAll());
        json = json.replaceAll("[^\\n]*(\\{(\\n)*\\}|\\\"(\\n)*\\\"|\\[(\\n)*\\])[^\\n]*\\n","");
        return "<pre>" + json + "</pre>";

    }

}
