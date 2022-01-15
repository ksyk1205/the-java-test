package me.whiteship.thejavatest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {
    @Test
    @DisplayName("스터디 만들기 \uD83D\uDE31")
    @EnabledIfEnvironmentVariable(named = "TEST_ENV", matches = "LOCAL")
    void create_new_study(){
        String test_env = System.getenv("TEST_ENV");
        //System.out.println(test_env);
        //assertTrue("LOCAL".equalsIgnoreCase(test_env));

        assumingThat("LOCAL".equalsIgnoreCase(test_env),()->{
            Study actual = new Study(100);
            assertThat(actual.getLimit()).isGreaterThan(0);
        });

        assumingThat("keesun".equalsIgnoreCase(test_env),()->{
            Study actual = new Study(10);
            assertThat(actual.getLimit()).isGreaterThan(0);
        });

    }
    @Test
    @DisabledOnOs(OS.MAC)
    void create_new_study_again(){
        System.out.println("create1");
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("before all");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before each");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After each");
    }
}