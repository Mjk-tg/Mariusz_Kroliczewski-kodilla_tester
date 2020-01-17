package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
        private List<Integer> pupilsQuantityInSchool = new ArrayList<>();

        public School (int...pupilsQuantityInSchool) {
                for (int pupilsQuantityInClass : pupilsQuantityInSchool)
                        this.pupilsQuantityInSchool.add(pupilsQuantityInClass);
        }

        public int getTotalPupilsInSchool() {
                int totalPupilsInSchool=0;
                for (int pupilsQuantityInSchool :pupilsQuantityInSchool)
                totalPupilsInSchool = totalPupilsInSchool + pupilsQuantityInSchool;

                return totalPupilsInSchool;
        }
}
