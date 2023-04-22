package com.example.testcase.Actions.AbonentActions;

import com.example.testcase.Models.Abonent;
import com.example.testcase.repository.AbonentRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class findByFullServicesNames {

    private final AbonentRepository abonentRepository;

    public findByFullServicesNames(AbonentRepository abonentRepository) {
        this.abonentRepository = abonentRepository;
    }

    @GetMapping("/findbyallservicesnames/{serviceName}/{subServiceName}/{secondSubServiceName}")
    @ResponseBody
    public String findByAllServicelNames(@PathVariable("serviceName") String serviceName,
                                         @PathVariable("subServiceName") String subServiceName,
                                         @PathVariable("secondSubServiceName") String secondSubServiceName,
                                         @RequestParam(defaultValue = "0") int page,
                                         @RequestParam(defaultValue = "1") int size) throws JsonProcessingException {

        Pageable pageable = PageRequest.of(page, size);
        Page<Abonent> abonentsPage = abonentRepository.findByServiceModelServiceNameAndServiceModelSubServiceNameAndServiceModelSecondSubServiceName(serviceName,subServiceName,secondSubServiceName,pageable);
        List<Abonent> abonents = abonentsPage.getContent();
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(abonents);

        StringBuilder sb = new StringBuilder();
        sb.append(json);
        Pageable previousPageable = abonentsPage.getPageable().previousOrFirst();
        if (abonentsPage.hasPrevious()) {
            sb.append("<a href=\"/findbyallservicesnames/" + serviceName +"/"+ subServiceName +"/"+ secondSubServiceName + "?page=" + previousPageable.getPageNumber() + "&size=" + previousPageable.getPageSize() + "\">Предыдущий </a>");
        }

        Pageable nextPageable = abonentsPage.getPageable().next();
        if (abonentsPage.hasNext()) {
            sb.append("<a href=\"/findbyallservicesnames/" + serviceName +"/"+ subServiceName +"/"+ secondSubServiceName + "?page=" + nextPageable.getPageNumber() + "&size=" + nextPageable.getPageSize() + "\">Следующий </a>");
        }

        return sb.toString();


    }

}
