package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalcTest {
   /* @BeforeAll
    public static void setup(){
        System.out.println("before all");
    }

    @BeforeEach
    public void setUpEach(){
        System.out.println("before each");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("after all");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("after each");
    }*/
    /*
    @RepeatedTest(2)
    @DisplayName("Проверка суммирования")
    @Timeout(10)
    @Tag("smoke")
    void summer() {
        Calc calc = new Calc();
        int result = calc.summ(1, 6);
        Assertions.assertEquals(7, result);
    }*/
@ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
@CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0 "})
@DisplayName("Проверка суммирования")
@Tag("Сложение")
    void summer1(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "#{index} - вычитание {0} и {1}, ожидаем {2}")
    @CsvSource({"5, 2, 3", "3, 1, 2", "1, 1, 0 "})
    @DisplayName("Проверка разности")
    @Tag("Вычитание")
    void subtraction(int a, int b, int expectedResult){
        Calc calc = new Calc();
        int result = calc.subtraction(a, b);
        Assertions.assertEquals(expectedResult, result);
    }
}