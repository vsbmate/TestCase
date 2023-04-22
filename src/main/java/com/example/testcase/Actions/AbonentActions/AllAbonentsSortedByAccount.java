package com.example.testcase.Actions.AbonentActions;

import com.example.testcase.Models.Abonent;
import com.example.testcase.repository.AbonentRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AllAbonentsSortedByAccount {

    private final AbonentRepository abonentRepository;

    public AllAbonentsSortedByAccount(AbonentRepository abonentRepository) {
        this.abonentRepository = abonentRepository;
    }

    @GetMapping("/getallabonentssortedbyaccount")
    @ResponseBody
    public String getAllAbonentsSortedbyAccount(@RequestParam(defaultValue = "0") int page,
                                                @RequestParam(defaultValue = "1") int size) throws Exception {

        Pageable pageable = PageRequest.of(page, size, Sort.by("account"));
        Page<Abonent> abonentsPage = abonentRepository.findAll(pageable);

        List<Abonent> abonents = abonentsPage.getContent();

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < abonents.size(); i++) {
            String json = mapper.writeValueAsString(abonents.get(i));
            sb.append(json);
            if (i != abonents.size() - 1) {
                sb.append("\n");
            }
        }

        sb.append("\n");

        if (abonentsPage.hasNext()) {
            sb.append("<a href=\"/getallabonentssortedbyaccount?page=" + (page+1) + "&size=" + size + "\">Следующий </a>");
        }
        if (abonentsPage.hasPrevious()) {
            sb.append("<a href=\"/getallabonentssortedbyaccount?page=" + (page-1) + "&size=" + size + "\">Предыдущий </a>");
        }

        return sb.toString();

    }

}
