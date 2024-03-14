package com.example.CrudSprintGradle.web;

import com.example.CrudSprintGradle.domain.Register;
import com.example.CrudSprintGradle.usecase.RegisterUsecase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.util.ReflectionTestUtils;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RegisterServiceTest {
    @InjectMocks
    RegisterService registerService;

    @Mock
    RegisterUsecase usecase;

    @Mock
    RegisterJsonMapper mapper;

    Register register = Register.builder()
            .firs_name("prueba").secund_name("Prueba").surName("Prueba")
            .second_surName("Prueba").age(12).birthdate(Date.valueOf("2022-04-06")).id(Long.valueOf(1)).build();

    @Test
    void cargarTodo() {
        Mockito.when(usecase.getAlll()).thenReturn(Flux.just(register));
        StepVerifier.create(registerService.cargarTodo())
                .assertNext(Assertions::assertNotNull).verifyComplete();
    }

    @Test
    void guardarDatos() {
        Mockito.when(usecase.saveInformation(Mockito.any()))
                .thenReturn(Mono.just(register));
        StepVerifier.create(registerService.guardarDatos(Mockito.any()))
                .assertNext(Assertions::assertNotNull).verifyComplete();
    }

    @Test
    void getOne() {
        Mockito.when(usecase.getOne(Mockito.any(Integer.class))).thenReturn(Mono.just(register));
        StepVerifier.create(registerService.getOne(Mockito.any(Integer.class)))
                .assertNext(Assertions::assertNotNull).verifyComplete();
    }

    @Test
    void delete() {
    }
}