package com.example.testcase.Actions.ServiceActions;

import com.example.testcase.Models.Abonent;
import com.example.testcase.Models.MenuItem;
import com.example.testcase.Models.ServiceModel;
import com.example.testcase.repository.AbonentRepository;
import com.example.testcase.repository.MenuItemRepository;
import com.example.testcase.repository.ServiceRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import javax.transaction.Transactional;
import java.util.List;


@Controller
public class ServiceDelete {

    private final MenuItemRepository menuItemRepository;
    private final ServiceRepository serviceRepository;
    private final AbonentRepository abonentRepository;

    public ServiceDelete(MenuItemRepository menuItemRepository, ServiceRepository serviceRepository, AbonentRepository abonentRepository) {
        this.menuItemRepository = menuItemRepository;
        this.serviceRepository = serviceRepository;
        this.abonentRepository = abonentRepository;
    }

    @GetMapping("/services")
    public String getServiceList(Model model) {
        List<MenuItem> services = menuItemRepository.findAll();
        List<ServiceModel> serviceModels = serviceRepository.findAll();
        List<Abonent> abonent = abonentRepository.findAll();
        model.addAttribute("services", services);
        model.addAttribute("serviceModels", serviceModels);
        model.addAttribute("abonents", abonent);
        return "services";
    }

    @PostMapping("/services/delete/{id}")
    @Transactional
    public String deleteService(@PathVariable("id") String serviceName, Long id) {

        List<ServiceModel> hasSubServices = serviceRepository.findByServiceName(serviceName);
        List<ServiceModel> hasSecondSubService = serviceRepository.findBySubServiceName(serviceName);
        if(!hasSubServices.isEmpty()){
            if(!hasSecondSubService.isEmpty()){
                return "hasSubService";
            }
            return "hasSubService";
        }
        serviceRepository.deleteById(id);
        return "redirect:/services";
    }

    @PostMapping("/services/delete/{serviceName}/force")
    @Transactional
    public String forceDeleteService(@PathVariable("serviceName") String serviceName) {

        serviceRepository.deleteAllByServiceName(serviceName);
        return "redirect:/services";
    }

}
