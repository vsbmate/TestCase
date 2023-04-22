package com.example.testcase.Controller;

import com.example.testcase.Actions.MenuCreater;
import com.example.testcase.Models.Abonent;
import com.example.testcase.Actions.AbonentActions.AbonentSaver;
import com.example.testcase.Models.MenuTree;
import com.example.testcase.Models.ServiceModel;
import com.example.testcase.repository.AbonentRepository;
import com.example.testcase.repository.MenuTreeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.transaction.Transactional;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class AbonentCreateController {
    @Autowired
    private AbonentSaver abonentSaver;
    private final MenuTreeRepository menuTreeRepository;
    private final AbonentRepository abonentRepository;

    @RequestMapping("/")
    public String mainPage(Model model){
        return "main";
    }


    @PostMapping("/")
    @Transactional
    public String createAbonent(@ModelAttribute("abonent")Abonent abonent, Model model){

        abonentSaver.saveAbonent(abonent);
        Long createdAbonentId = abonent.getId();
        model.addAttribute("createdAbonentId", createdAbonentId);
        return "success";
    }

    @GetMapping("/")
    public String formGet(Model model){

        Optional<MenuTree> optionalMenu = menuTreeRepository.findById(1L);
        MenuTree menu;
        if (optionalMenu.isPresent()) {
            menu = optionalMenu.get();
        } else {
            MenuCreater menuCreater = new MenuCreater();
            menu = menuCreater.createMenu();
            menuTreeRepository.save(menu);
        }

        model.addAttribute("abonent", new Abonent());
        model.addAttribute("service", new ServiceModel());
        model.addAttribute("menu", menu);
        return "main";
    }

}
