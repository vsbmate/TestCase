package com.example.testcase;

import com.example.testcase.Models.Abonent;
import com.example.testcase.Models.ServiceModel;
import com.example.testcase.repository.AbonentRepository;
import com.example.testcase.repository.ServiceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Configuration
public class ApplicationConfig {

    @Bean
    public AbonentRepository abonentRepository() {
        return new AbonentRepository() {

            @Override
            public List<Abonent> findByOrderByAccount() {
                return null;
            }

            @Override
            public List<Abonent> findByAccount(Long account) {
                return null;
            }

            @Override
            public Page<Abonent> findByServiceModelServiceName(String serviceName, Pageable pageable) {
                return null;
            }

            @Override
            public Page<Abonent> findByServiceModelServiceNameAndServiceModelSubServiceNameAndServiceModelSecondSubServiceName(String serviceName, String subServiceName, String secondSubServiceName, Pageable pageable) {
                return null;
            }

            @Override
            public Page<Abonent> findByServiceModelSubServiceName(String subServiceName, Pageable pageable) {
                return null;
            }

            @Override
            public Page<Abonent> findByServiceModelSecondSubServiceName(String secondSubServiceName, Pageable pageable) {
                return null;
            }

            @Override
            public Abonent findByServiceModelServiceName(String serviceName) {
                return null;
            }


            @Override
            public List<Abonent> findAll() {
                return null;
            }

            @Override
            public List<Abonent> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<Abonent> findAllById(Iterable<Long> iterable) {
                return null;
            }

            @Override
            public <S extends Abonent> List<S> saveAll(Iterable<S> iterable) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Abonent> S saveAndFlush(S s) {
                return null;
            }

            @Override
            public void deleteInBatch(Iterable<Abonent> iterable) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Abonent getOne(Long aLong) {
                return null;
            }

            @Override
            public <S extends Abonent> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Abonent> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<Abonent> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Abonent> S save(S s) {
                return null;
            }

            @Override
            public Optional<Abonent> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(Abonent abonent) {

            }

            @Override
            public void deleteAll(Iterable<? extends Abonent> iterable) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Abonent> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Abonent> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Abonent> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Abonent> boolean exists(Example<S> example) {
                return false;
            }
        }; // здесь необходимо создать и вернуть экземпляр реализации ServicesRepository
    }

    @Bean
    public ServiceRepository serviceRepository() {
        return new ServiceRepository() {

            @Override
            public List<ServiceModel> findByServiceName(String serviceName) {
                return null;
            }

            @Override
            public List<ServiceModel> findBySubServiceName(String subServiceName) {
                return null;
            }

            @Override
            public List<ServiceModel> findBySecondSubServiceName(String secondSubServiceName) {
                return null;
            }

            @Override
            public void deleteBySubServiceName(String subServiceName) {

            }

            @Override
            public void deleteBySecondSubServiceName(String secondSubServiceName) {

            }

            @Override
            public void deleteAllByServiceName(String serviceName) {

            }

            @Override
            public void deleteByServiceName(String serviceName) {

            }

            @Override
            public List<ServiceModel> findAll() {
                return null;
            }

            @Override
            public List<ServiceModel> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<ServiceModel> findAllById(Iterable<Long> iterable) {
                return null;
            }

            @Override
            public <S extends ServiceModel> List<S> saveAll(Iterable<S> iterable) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends ServiceModel> S saveAndFlush(S s) {
                return null;
            }

            @Override
            public void deleteInBatch(Iterable<ServiceModel> iterable) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public ServiceModel getOne(Long aLong) {
                return null;
            }

            @Override
            public <S extends ServiceModel> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends ServiceModel> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<ServiceModel> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends ServiceModel> S save(S s) {
                return null;
            }

            @Override
            public Optional<ServiceModel> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(ServiceModel serviceModel) {

            }

            @Override
            public void deleteAll(Iterable<? extends ServiceModel> iterable) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends ServiceModel> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends ServiceModel> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends ServiceModel> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends ServiceModel> boolean exists(Example<S> example) {
                return false;
            }
        };
        }
}