package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolPrincipal = new HashMap<>();

        schoolPrincipal.put(new Principal("John","Brown"), new School("Primary School No 1",22, 26, 30, 31, 29, 30, 29, 22));
        schoolPrincipal.put(new Principal("Henrietta","Cat"),new School("Primary School No 2", 23, 26, 30, 31, 29, 30));
        schoolPrincipal.put(new Principal("Burt","Dog"),new School("Primary School No 3",24, 26, 30, 31, 29, 30, 33));
        schoolPrincipal.put(new Principal("Alice","Carpet"), new School("Secondary School No 1",25, 26, 30, 31, 29, 30));

        for (Map.Entry<Principal, School> schoolPrincipalEntry : schoolPrincipal.entrySet())
            System.out.println("School Principal " + schoolPrincipalEntry.getKey().getFirstName()+" "+ schoolPrincipalEntry.getKey().getLastName() + " manages the " + schoolPrincipalEntry.getValue().getSchoolName() + " with total school pupils " + schoolPrincipalEntry.getValue().getTotalPupilsInSchool());

    }
}
