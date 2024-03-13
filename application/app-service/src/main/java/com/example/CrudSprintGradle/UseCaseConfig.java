package com.example.CrudSprintGradle;

import com.example.CrudSprintGradle.domain.gateway.RegisterRepository;
import com.example.CrudSprintGradle.usecase.RegisterUsecase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public RegisterUsecase registerUsecase(RegisterRepository registerRepository){
        return new RegisterUsecase(registerRepository);
    }

}
