package com.example.CrudSprintGradle.web;

import com.example.CrudSprintGradle.domain.Register;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class RegisterJsonMapper {
    public Register getRegister(RegisterJsonData registerData){
        return Register.builder()
                .firs_name(registerData.getFirs_name())
                .secund_name(registerData.getSecund_name())
                .surName(registerData.getSurName())
                .second_surName(registerData.getSecond_surName())
                .age(registerData.getAge())
                .birthdate(registerData.getBirthdate())
                .id(registerData.getId())
                .build();
    }
}
