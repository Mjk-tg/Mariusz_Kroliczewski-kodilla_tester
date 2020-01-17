package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolPrincipal = new HashMap<>();
        Principal mrBrown = new Principal( "Mr.Brown", "Primary School No 1");
        Principal msCat = new Principal("Ms.Cat", "Primary School No 2");
        Principal mrDog = new Principal("Mr.Dog", "Primary School No 3");
        Principal msCarpet = new Principal("Ms.Carpet", "Secondary School No 1");

        School mrBrownSchool = new School(22, 26, 30, 31, 29, 30, 29, 22);
        School msCatSchool = new School(23, 26, 30, 31, 29, 30);
        School mrDogSchool = new School(24, 26, 30, 31, 29, 30, 33);
        School mrCarpetSchool = new School(25, 26, 30, 31, 29, 30);

        schoolPrincipal.put(mrBrown, mrBrownSchool);
        schoolPrincipal.put(msCat, msCatSchool);
        schoolPrincipal.put(mrDog, mrDogSchool);
        schoolPrincipal.put(msCarpet, mrCarpetSchool);

        for (Map.Entry<Principal, School> schoolPrincipalEntry : schoolPrincipal.entrySet())
            System.out.println("School Principal " + schoolPrincipalEntry.getKey().getName()  + " manages the " + schoolPrincipalEntry.getKey().getSchool() + " with total school pupils " + schoolPrincipalEntry.getValue().getTotalPupilsInSchool());

    }
}
