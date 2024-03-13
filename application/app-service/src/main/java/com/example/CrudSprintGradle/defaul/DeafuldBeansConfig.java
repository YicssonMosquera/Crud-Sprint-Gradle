package com.example.CrudSprintGradle.defaul;

import com.example.CrudSprintGradle.domain.Register;
import com.example.CrudSprintGradle.domain.gateway.RegisterRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Configuration
public class DeafuldBeansConfig {
    @Bean
    @ConditionalOnMissingBean
    public RegisterRepository registerRepository(){

        return registerRepository();
    }

    private final RegisterRepository registerRepository = new RegisterRepository() {
        @Override
        public Mono<Register> save(Register register) {
            return Mono.empty();
        }

        @Override
        public Flux<Register> finAll() {
            return Flux.empty();
        }

        @Override
        public Mono<Register> finById(Integer id) {
            return Mono.empty();
        }

        @Override
        public Mono<Void> delete(Integer id) {
            return Mono.empty();
        }
    };
}
