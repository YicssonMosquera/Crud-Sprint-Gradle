package com.example.CrudSprintGradle.usecase;

import com.example.CrudSprintGradle.domain.Register;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.example.CrudSprintGradle.domain.gateway.RegisterRepository;

@RequiredArgsConstructor
public class RegisterUsecase {
    private final RegisterRepository repository;

    public Mono<Register> saveInformation(Register register){
        return repository.save(register);
    }

    public Flux<Register>getAlll(){
        return repository.finAll().filter(register -> register.getSecund_name().equals("Arnulfo"));
    }

    public Mono<Register>getOne(Integer id){
        return repository.finById(id);
    }
}
