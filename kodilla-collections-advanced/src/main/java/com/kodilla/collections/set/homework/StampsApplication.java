package com.kodilla.collections.set.homework;

import com.kodilla.collections.set.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Blue Mauritius", "1,2 x 1,5", true));
        stamps.add(new Stamp("Kings of Poland", "2,5 x 3,5", true));
        stamps.add(new Stamp("Cutty Sark Clipper", "1,5 x 2,5", false));
        stamps.add(new Stamp("Blue Mauritius", "1,2 x 1,5", false));
        stamps.add(new Stamp("Blue Mauritius", "1,2 x 1,5", true));

        System.out.println();
        System.out.println("Size " + stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);

    }

}
