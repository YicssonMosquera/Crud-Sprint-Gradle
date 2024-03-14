package com.example.CrudSprintGradle.defaul;

import com.example.CrudSprintGradle.domain.Register;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

class DeafuldBeansConfigTest {
    DeafuldBeansConfig deafuldBeansConfig = new DeafuldBeansConfig();

    @Test
    void registerRepository() {
        assertThat(deafuldBeansConfig.registerRepository().save(Mockito.mock(Register.class))).isNotNull();

    }
}