package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

        private List<Integer> pupilsQuantityInSchool = new ArrayList<>();
        private String schoolName;

        public School (String schoolName, int...pupilsQuantityInSchool) {
                for (int pupilsQuantityInClass : pupilsQuantityInSchool)
                        this.pupilsQuantityInSchool.add(pupilsQuantityInClass);
                        this.schoolName=schoolName;
        }

        public int getTotalPupilsInSchool() {
                int totalPupilsInSchool=0;
                for (int pupilsQuantityInSchool :pupilsQuantityInSchool)
                totalPupilsInSchool = totalPupilsInSchool + pupilsQuantityInSchool;

                return totalPupilsInSchool;
        }
        public String getSchoolName() {
                return schoolName;
        }
}
