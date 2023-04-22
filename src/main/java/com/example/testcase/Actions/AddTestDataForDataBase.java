package com.example.testcase.Actions;

import com.example.testcase.Actions.AbonentActions.AbonentSaver;
import com.example.testcase.Models.Abonent;
import com.example.testcase.Models.ServiceModel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AddTestDataForDataBase implements CommandLineRunner {
    private final AbonentSaver abonentSaver;

    public AddTestDataForDataBase(AbonentSaver abonentSaver) {
        this.abonentSaver = abonentSaver;
    }


    @Override
    public void run(String... args) throws Exception {
        ServiceModel service1 = new ServiceModel();
        service1.setServiceName("Детский сад");
        service1.setSubServiceName("Ясли");
        service1.setSecondSubServiceName("");
        Abonent abonent1 = new Abonent();
        abonent1.setFio("Петров Петр");
        abonent1.setAccount(1L);
        abonent1.setService(service1);
        abonent1.setId(1L);
        abonentSaver.saveAbonent(abonent1);

        ServiceModel service2 = new ServiceModel();
        service2.setServiceName("Жилищно-коммунальные услуги");
        service2.setSubServiceName("Вода");
        service2.setSecondSubServiceName("Горячая вода");
        Abonent abonent2 = new Abonent();
        abonent2.setFio("Иванов Иван");
        abonent2.setAccount(5L);
        abonent2.setService(service2);
        abonent2.setId(2L);
        abonentSaver.saveAbonent(abonent2);

        ServiceModel service3 = new ServiceModel();
        service3.setServiceName("Жилищно-коммунальные услуги");
        service3.setSubServiceName("Вода");
        service3.setSecondSubServiceName("Холодная вода");
        Abonent abonent3 = new Abonent();
        abonent3.setFio("Сидоров Антон");
        abonent3.setAccount(9L);
        abonent3.setService(service3);
        abonent3.setId(3L);
        abonentSaver.saveAbonent(abonent3);

        ServiceModel service4 = new ServiceModel();
        service4.setServiceName("Жилищно-коммунальные услуги");
        service4.setSubServiceName("Отопление");
        service4.setSecondSubServiceName("");
        Abonent abonent4 = new Abonent();
        abonent4.setFio("Антонов Дмитрий");
        abonent4.setAccount(7L);
        abonent4.setService(service4);
        abonent4.setId(4L);
        abonentSaver.saveAbonent(abonent4);

        ServiceModel service5 = new ServiceModel();
        service5.setServiceName("Жилищно-коммунальные услуги");
        service5.setSubServiceName("Отопление");
        service5.setSecondSubServiceName("");
        Abonent abonent5 = new Abonent();
        abonent5.setFio("Джон Рэмбо");
        abonent5.setAccount(777L);
        abonent5.setService(service5);
        abonent5.setId(5L);
        abonentSaver.saveAbonent(abonent5);

        ServiceModel service6 = new ServiceModel();
        service6.setServiceName("Жилищно-коммунальные услуги");
        service6.setSubServiceName("Вода");
        service6.setSecondSubServiceName("Холодная вода");
        Abonent abonent6 = new Abonent();
        abonent6.setFio("Куплинов Денис");
        abonent6.setAccount(8L);
        abonent6.setService(service6);
        abonent6.setId(6L);
        abonentSaver.saveAbonent(abonent6);

        ServiceModel service7 = new ServiceModel();
        service7.setServiceName("Детский сад");
        service7.setSubServiceName("Ясли");
        service7.setSecondSubServiceName("");
        Abonent abonent7 = new Abonent();
        abonent7.setFio("Резников Роман");
        abonent7.setAccount(2L);
        abonent7.setService(service7);
        abonent7.setId(7L);
        abonentSaver.saveAbonent(abonent7);
    }
}
