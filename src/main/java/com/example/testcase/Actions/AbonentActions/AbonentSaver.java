package com.example.testcase.Actions.AbonentActions;

import com.example.testcase.Models.Abonent;
import com.example.testcase.repository.AbonentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
public class AbonentSaver {

    private final AbonentRepository abonentRepository;


    @Transactional
    public void saveAbonent(Abonent abonent){
        abonentRepository.save(abonent);
    }

}
