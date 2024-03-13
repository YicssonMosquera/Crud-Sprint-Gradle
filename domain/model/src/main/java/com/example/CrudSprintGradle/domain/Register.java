package com.example.CrudSprintGradle.domain;

import lombok.Builder;

import java.util.Date;

@Builder(toBuilder = true)
public class Register {
    public String getFirs_name() {
        return firs_name;
    }

    public String getSecund_name() {
        return secund_name;
    }

    public String getSurName() {
        return surName;
    }

    public String getSecond_surName() {
        return second_surName;
    }

    public Integer getAge() {
        return age;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    private final String firs_name;
    private final String secund_name;
    private final String surName;
    private final String second_surName;
    private final Integer age;
    private final Date birthdate;

    public Long getId() {
        return id;
    }

    private final Long id;
}
