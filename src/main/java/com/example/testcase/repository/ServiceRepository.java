package com.example.testcase.repository;

import com.example.testcase.Models.ServiceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ServiceRepository extends JpaRepository<ServiceModel, Long> {

        void deleteByServiceName(String serviceName);
        List<ServiceModel> findByServiceName(String serviceName);
        List<ServiceModel> findBySubServiceName(String subServiceName);
        List<ServiceModel> findBySecondSubServiceName(String secondSubServiceName);
        void deleteBySubServiceName(String subServiceName);
        void deleteBySecondSubServiceName(String secondSubServiceName);
        void deleteAllByServiceName(String serviceName);
}
