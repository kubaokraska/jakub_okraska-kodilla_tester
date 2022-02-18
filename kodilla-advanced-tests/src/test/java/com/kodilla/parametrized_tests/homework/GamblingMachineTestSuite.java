package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/stringGamblingMachine.csv", numLinesToSkip = 1)
    public void shouldReturnTrueWhenNumbersAreFromInterval(String input) throws InvalidNumbersException {
        String[] numbersTable = input.split(" ");
        Set<Integer> numbersSet = new HashSet<>();
        GamblingMachine gamblingMachine = new GamblingMachine();

        for (int i = 0; i < numbersTable.length; i++){
            numbersSet.add(Integer.valueOf(numbersTable[i]));}

        int inputFinal = gamblingMachine.howManyWins(numbersSet);
        System.out.println("WINS: " + inputFinal);
        assertTrue(inputFinal > 0);
    }
}