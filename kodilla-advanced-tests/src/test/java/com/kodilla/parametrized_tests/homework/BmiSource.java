package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BmiSource {
    private static Stream<Arguments> bmiArguments() {
        return Stream.of(
                Arguments.of(1.95, 50, "Very severely underweight"),
                Arguments.of(1.95, 60, "Severely underweight"),
                Arguments.of(1.95, 65, "Underweight"),
                Arguments.of(1.95, 72, "Normal (healthy weight)"),
                Arguments.of(1.90, 95, "Overweight"),
                Arguments.of(1.90, 110, "Obese Class I (Moderately obese)"),
                Arguments.of(1.90, 130, "Obese Class II (Severely obese)"),
                Arguments.of(1.90, 150, "Obese Class III (Very severely obese)"),
                Arguments.of(1.90, 180, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.90, 190, "Obese Class V (Super Obese)"),
                Arguments.of(1.90, 250, "Obese Class VI (Hyper Obese)")
        );
    }
}