package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

// Testy metody validateUsername()
    @ParameterizedTest
    @ValueSource(strings = {"", "  ", "6_"})
    void validateUsernameShouldReturnFalseIfLesThenThreeCharacters(String strings) {
        assertFalse(userValidator.validateUsername(strings));
    }

    @ParameterizedTest
    @ValueSource(strings = {"&&&&", "%%%%", "$$$", "****", "AbCd#", "abCD*"})
    void validateUsernameShouldReturnFalseIfContainNotAllowedCharacters(String strings) {
        assertFalse(userValidator.validateUsername(strings));
    }

    @ParameterizedTest
    @NullSource
    void validateUsernameShouldReturnFalseIfContainNull(String string) {
        assertFalse(userValidator.validateUsername(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {"AAA","ABC", "aaa", "---", "123", "___", "...", "aBcd7_-.q"})
    void validateUsernameShouldReturnTrueIfContainsAllowedCharacters(String strings) {
        assertTrue(userValidator.validateUsername(strings));
    }

// Testy metody validateEmail()

    @ParameterizedTest
    @NullSource
    void validateEmailShouldReturnFalseIfContainNull(String string) {
        assertFalse(userValidator.validateEmail(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {"t@t.t", "t@t.t.t.t", "tytus.dezoo@trapez.fik.zoo.ss.dd.tt.r.t.yy.uu.kkk.mmm.ll.asdfgh", "t.t.t.t@t.t"})
    void validateEmailShouldReturnTrue(String strings) {
        assertTrue(userValidator.validateEmail(strings));

    }

    @ParameterizedTest
    @ValueSource(strings = {"&@t.t", "t@&.t.t.t", "tytus.dezoo@trapez.fik.zoo.*"})
    void validateEmailShouldReturnFalse(String strings) {
        assertFalse(userValidator.validateEmail(strings));

    }
    @ParameterizedTest
    @EmptySource
    void validateEmailShouldReturnFalseIfEmpty(String string) {
        assertTrue(userValidator.validateEmail(string));
    }
}