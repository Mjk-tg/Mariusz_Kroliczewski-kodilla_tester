package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonTestSources {

    static Stream <Arguments> provideDataForTestingPerson() {
        Person person1 = new Person(1.75, 45.906);
        Person person2 = new Person(1.75, 48.999);
        Person person3 = new Person(1.75, 56.656);
        Person person4 = new Person(1.75, 76.562);
        Person person5 = new Person(1.75, 91.874);
        Person person6 = new Person(1.75,  107.187);
        Person person7 = new Person(1.75, 122.499);
        Person person8 = new Person(1.75, 137.812);
        Person person9 = new Person(1.75, 153.120);
        Person person10 = new Person(1.75, 183.749);
        Person person11 = new Person(1.75, 183.78);

        return Stream.of(
                Arguments.of(person1, "Very severely underweight"),
                Arguments.of(person2, "Severely underweight"),
                Arguments.of(person3, "Underweight"),
                Arguments.of(person4, "Normal (healthy weight)"),
                Arguments.of(person5, "Overweight"),
                Arguments.of(person6, "Obese Class I (Moderately obese)"),
                Arguments.of(person7, "Obese Class II (Severely obese)"),
                Arguments.of(person8, "Obese Class III (Very severely obese)"),
                Arguments.of(person9, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(person10, "Obese Class V (Super Obese)"),
                Arguments.of(person11, "Obese Class VI (Hyper Obese)")
        );
    }
}
