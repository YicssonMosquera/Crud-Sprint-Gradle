package com.example.CrudSprintGradle.jpa.cocuments;

import com.example.CrudSprintGradle.domain.gateway.RegisterRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.example.CrudSprintGradle.domain.Register;

@Repository
public class RegisterAdapter implements RegisterRepository {

    private final RegisterInformationRepository repository;
    private final RegisterMapper mapper;

    public RegisterAdapter(RegisterInformationRepository repository, RegisterMapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Mono<Register> save(Register register) {
        return Mono.just(mapper.getRegister(repository.save(mapper.registerDataMapper(register))));
    }

    @Override
    public Flux<Register> finAll() {
        return Flux.fromIterable(repository.findAll()).map(mapper::getRegister);
    }

    @Override
    public Mono<Register> finById(Integer id) {
        return Mono.just(repository.findById(id)
                        .map(mapper::getRegister).orElse(Register.builder().build()));
    }

    @Override
    public Mono<Void> delete(Integer id) {
        return null;
    }
}
