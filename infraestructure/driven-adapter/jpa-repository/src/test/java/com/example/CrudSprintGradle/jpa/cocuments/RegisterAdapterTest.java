package com.example.CrudSprintGradle.jpa.cocuments;

import com.example.CrudSprintGradle.domain.Register;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class RegisterAdapterTest {
    @InjectMocks
    private RegisterAdapter registerAdapter;

    @Mock
    RegisterInformationRepository repository;

    @Mock
    RegisterMapper mapper;


    Register register = Register.builder()
            .firs_name("prueba").secund_name("Prueba").surName("Prueba")
            .second_surName("Prueba").age(12).birthdate(Date.valueOf("2022-04-06")).id(Long.valueOf(1)).build();

    @Test
    void save() {
        Mockito.when(mapper.registerDataMapper(Mockito.any(Register.class))).thenReturn(new RegisterData());
        Mockito.when(mapper.getRegister(Mockito.any(RegisterData.class))).thenReturn(register);
        Mockito.when(repository.save(Mockito.any(RegisterData.class))).thenReturn(Mockito.mock(RegisterData.class));
        StepVerifier.create(registerAdapter.save(register))
                .assertNext(Assertions::assertNotNull)
                .verifyComplete();
    }

    @Test
    void finAll() {
        List<RegisterData>registerData = new ArrayList<>();
        Mockito.when(repository.findAll()).thenReturn(registerData);
        StepVerifier.create(registerAdapter.finAll()).verifyComplete();
    }

    @Test
    void finById() {
        Mockito.when(repository.findById(Mockito.any())).thenReturn(Optional.of(RegisterData.builder().build()));
        StepVerifier.create(registerAdapter.finById(Mockito.any()))
                .assertNext(Assertions::assertNotNull)
                .verifyComplete();
    }

    @Test
    void delete() {
    }
}