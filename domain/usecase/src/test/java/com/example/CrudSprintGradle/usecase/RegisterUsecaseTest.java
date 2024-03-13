package com.example.CrudSprintGradle.usecase;

import com.example.CrudSprintGradle.domain.Register;
import com.example.CrudSprintGradle.domain.gateway.RegisterRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.sql.Date;

@ExtendWith(MockitoExtension.class)
class RegisterUsecaseTest {
    @InjectMocks
    private RegisterUsecase usecase;

    @Mock
    RegisterRepository repository;

    Register register = Register.builder()
            .firs_name("prueba").secund_name("Prueba").surName("Prueba")
            .second_surName("Prueba").age(12).birthdate(Date.valueOf("2022-04-06")).id(Long.valueOf(1)).build();

    @Test
    void saveInformation() {
        Mockito.when(repository.save(register)).thenReturn(Mono.just(register));
        usecase.saveInformation(register).as(StepVerifier::create).assertNext(
                register1 -> Assertions.assertEquals(register1.getAge(),register.getAge())
        ).verifyComplete();
    }

    @Test
    void getAlll() {
        Mockito.when(repository.finAll()).thenReturn(Flux.just(register));
        StepVerifier.create(usecase.getAlll()).verifyComplete();
    }

    @Test
    void getOne() {
        Mockito.when(repository.finById(Mockito.any())).thenReturn(Mono.just(register));
        StepVerifier.create(usecase.getOne(Mockito.any())).assertNext(
                register1 -> Assertions.assertEquals(register1,register)
        ).verifyComplete();
    }

    @Test
    void delete() {
    }
}