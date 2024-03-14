package com.example.CrudSprintGradle.web;


import com.example.CrudSprintGradle.domain.Register;
import com.example.CrudSprintGradle.usecase.RegisterUsecase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "david/prueba")
public class RegisterService {
    private final RegisterUsecase registerUsecase;
    private final RegisterJsonMapper mapper;

    @GetMapping(path = "/cargar")
    public Flux<Register> cargarTodo(){
        return registerUsecase.getAlll();
    }

    @PostMapping(path = "/guardar")
    public Mono<Register> guardarDatos(@RequestBody RegisterJsonData register){
        return registerUsecase.saveInformation(mapper.getRegister(register));
    }

    @GetMapping(path = "/cargar/{id}")
    public Mono<Register>getOne(@PathVariable ("id") Integer id){
        return registerUsecase.getOne(id);
    }

    @DeleteMapping(path = "/delete/{id}")
    public Mono<Void> delete(@PathVariable ("id") Integer id){
        return null;
    }


}
