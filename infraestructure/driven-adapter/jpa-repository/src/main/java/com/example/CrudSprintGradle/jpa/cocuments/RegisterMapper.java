package com.example.CrudSprintGradle.jpa.cocuments;

import com.example.CrudSprintGradle.domain.Register;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class RegisterMapper {
    public Register getRegister(RegisterData registerData){
        return Register.builder()
                .id(registerData.getId())
                .firs_name(registerData.getFirs_name())
                .secund_name(registerData.getSecund_name())
                .surName(registerData.getSurName())
                .second_surName(registerData.getSecond_surName())
                .age(registerData.getAge())
                .birthdate(registerData.getBirthdate())
                .build();
    }

    public RegisterData registerDataMapper(Register register){
        return RegisterData.builder()
                .id(register.getId())
                .firs_name(register.getFirs_name())
                .secund_name(register.getSecund_name())
                .surName(register.getSurName())
                .second_surName(register.getSecond_surName())
                .age(register.getAge())
                .birthdate(register.getBirthdate())
                .build();
    }
}
