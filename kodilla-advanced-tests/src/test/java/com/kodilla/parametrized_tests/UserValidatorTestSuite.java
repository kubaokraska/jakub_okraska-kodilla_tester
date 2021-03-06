package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    UserValidator userValidator = new UserValidator();

    // VALIDATE USERNAME METHOD TESTS
    @ParameterizedTest
    @ValueSource(strings = {"", "1", "PA", "pass@", "pass#", "pass!", "pass$"})
    public void shouldReturnFalseIfStringIsNotWorkingWithRegexValidateUsernameMethod(String username) {
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"123", "pas", "PAS", "pass.", "pass-", "_PA"})
    public void shouldReturnTrueIfStringIsWorkingWithRegexValidateUsernameMethod(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    // VALIDATE EMAIL METHOD TESTS
    @ParameterizedTest
    @ValueSource(strings = {"a", "1", "gmail.com", "@gmail.com", "K.@gmail.com", "user..name@gmail.com", "u@gmail..com",
            "u@gmail.com1", "u@gmail.com.pl1", "u @gmail.com", "u@gmail .com", "u@ gmail.com", "u@gmail. com"})
    public void shouldReturnFalseIfStringIsNotWorkingWithRegexValidateEmailMethod(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"user_.name_@gmai-.com.pl.de", "-user.-name@gmail-.com"})
    public void shouldReturnTrueIfStringIsWorkingWithRegexValidateEmailMethod(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }
}