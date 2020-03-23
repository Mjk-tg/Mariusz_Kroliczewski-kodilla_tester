package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachineTestData_GetLessThenSixNumbers.csv")
    public void shouldReturnExceptionIfGetLessThen6numbers(int one, int two, int three, int four, int five) {
        Set<Integer> resources = new HashSet<>();
        resources.add(one);
        resources.add(two);
        resources.add(three);
        resources.add(four);
        resources.add(five);
        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(resources);
        });

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachineTestData_GetMoreThenSixNumbers.csv")
    public void shouldReturnExceptionIfGetMoreThen6numbers(int one, int two, int three, int four, int five, int six, int seven) throws InvalidNumbersException {
        Set<Integer> resources = new HashSet<>();
        resources.add(one);
        resources.add(two);
        resources.add(three);
        resources.add(four);
        resources.add(five);
        resources.add(six);
        resources.add(seven);
        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(resources);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachineTestData.csv")
    public void shouldReturnHowManyWinsCounter(int one, int two, int three, int four, int five, int six) throws InvalidNumbersException {
        Set<Integer> resources = new HashSet<>();
        resources.add(one);
        resources.add(two);
        resources.add(three);
        resources.add(four);
        resources.add(five);
        resources.add(six);
        int result = gamblingMachine.howManyWins(resources);
        assertTrue(result >= 0 && result<=5);
    }

}