package com.kodilla.collections.set.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String dimensionHeightAndWidth;
    private boolean isStamped;

    public Stamp(String stampName, String dimensionHeightAndWidth, boolean isStamped) {
        this.stampName = stampName;
        this.dimensionHeightAndWidth = dimensionHeightAndWidth;
        this.isStamped = isStamped;
    }

    public String getStampName() {
        return stampName;
    }

    public String getDimensionHeightAndWidth() {
        return dimensionHeightAndWidth;
    }

    public boolean isStamped() {
        return isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return isStamped == stamp.isStamped &&
                Objects.equals(stampName, stamp.stampName) &&
                Objects.equals(dimensionHeightAndWidth, stamp.dimensionHeightAndWidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, dimensionHeightAndWidth, isStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", dimensionHeightAndWidth='" + dimensionHeightAndWidth + '\'' +
                ", isStamped=" + isStamped +
                '}';
    }




}
