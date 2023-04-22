package com.example.testcase.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "services")

@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ServiceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "serviceName")
    private String serviceName;

    @Column(name = "subServiceName")
    private String subServiceName;

    @Column(name = "secondSubServiceName")
    private String secondSubServiceName;

    @OneToMany(mappedBy = "serviceModel", cascade = CascadeType.ALL)
    @Column(nullable = true)
    @JsonIgnore
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Set<Abonent> abonents = new HashSet<>();

    public ServiceModel(String serviceName) {
        this.serviceName = serviceName;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Set<Abonent> getAbonents() {
        return abonents;
    }

    public void setAbonents(Set<Abonent> abonents) {
        this.abonents = abonents;
    }

    public String getSubServiceName() {
        return subServiceName;
    }

    public void setSubServiceName(String subServiceName) {
        this.subServiceName = subServiceName;
    }

    public String getSecondSubServiceName() {
        return secondSubServiceName;
    }

    public void setSecondSubServiceName(String secondSubServiceName) {
        this.secondSubServiceName = secondSubServiceName;
    }
}
