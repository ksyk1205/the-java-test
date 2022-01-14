package me.whiteship.thejavatest;

import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {
    @Test
    @DisplayName("스터디 만들기 \uD83D\uDE31")
    void create_new_study(){
        assertTimeout(Duration.ofMillis(100), () -> {
            new Study(10);
            Thread.sleep(300);
        });

//        IllegalArgumentException exception =
//                assertThrows(IllegalArgumentException.class, () -> new Study(-10));
//
//        assertEquals("limit은 0보다 커야 한다.",exception.getMessage());

//        Study study = new Study(-10);
//        assertAll(
//                ()->  assertNotNull(study),
//                ()->assertEquals(StudyStatus.DRAFT, study.getStatus(),
//                        () ->"스터디를 처음 만들면 상태값이"+StudyStatus.DRAFT+"여야 한다."),
//                ()->assertTrue(study.getLimit() >0 ,"스터디는 최대 참석 가능 인원은 0보다 커야 한다")
//        );
    }
    @Test
    //@Disabled
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