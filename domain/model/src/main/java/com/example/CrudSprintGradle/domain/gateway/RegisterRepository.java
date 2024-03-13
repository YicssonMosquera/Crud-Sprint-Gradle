package com.example.CrudSprintGradle.domain.gateway;


import com.example.CrudSprintGradle.domain.Register;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RegisterRepository {
    Mono<Register> save(Register register);
    Flux<Register> finAll();
    Mono<Register> finById(Integer id);
    Mono<Void> delete(Integer id);


}
