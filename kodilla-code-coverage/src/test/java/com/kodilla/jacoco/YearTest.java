package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class YearTest {

    @ParameterizedTest
    @ValueSource(ints = {1600, 8, 400})
    void shouldBeLeapYearIfDivisibleBy400(int number) {

        //given
        Year year = new Year(number);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 700, 1800})
    void shouldNotBeLeapYearIfDivisibleByAllNumbers(int number) {

        //given
        Year year = new Year(number);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertFalse(isLeapYear);
    }
}