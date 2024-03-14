package com.example.CrudSprintGradle;

import com.example.CrudSprintGradle.domain.gateway.RegisterRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class UseCaseConfigTest {
    @InjectMocks
    UseCaseConfig useCaseConfig;

    @Mock
    RegisterRepository registerRepository;

    @Test
    void registerUsecase() {
        assertThat(useCaseConfig.registerUsecase(registerRepository)).isNotNull();
    }
}