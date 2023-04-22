package com.example.testcase.repository;

import com.example.testcase.Models.Abonent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AbonentRepository extends JpaRepository<Abonent, Long> {
        List<Abonent> findByOrderByAccount();
        List<Abonent> findByAccount(Long account);
        Page<Abonent> findByServiceModelServiceName(String serviceName, Pageable pageable);
        Page<Abonent> findByServiceModelServiceNameAndServiceModelSubServiceNameAndServiceModelSecondSubServiceName(String serviceName, String subServiceName, String secondSubServiceName, Pageable pageable);

        Page<Abonent> findByServiceModelSubServiceName(String subServiceName, Pageable pageable);

        Page<Abonent> findByServiceModelSecondSubServiceName(String secondSubServiceName, Pageable pageable);
        Abonent findByServiceModelServiceName(String serviceName);

}
