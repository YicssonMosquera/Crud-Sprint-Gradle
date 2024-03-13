package com.example.CrudSprintGradle.jpa.cocuments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface RegisterInformationRepository extends CrudRepository<RegisterData, Integer>, QueryByExampleExecutor<RegisterData> {

}
