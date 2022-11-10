package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String stampName;
    private double stampHeight;
    private double stampWidth;
    private String stampCondition;

    public Stamp(String stampName, double stampHeight, double stampWidth, String stampCondition) {
        this.stampName = stampName;
        this.stampHeight = stampHeight;
        this.stampWidth = stampWidth;
        this.stampCondition = stampCondition;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampHeight() {
        return stampHeight;
    }

    public double getStampWidth() {
        return stampWidth;
    }

    public String getStampCondition() {
        return stampCondition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp stamp)) return false;
        return Double.compare(stamp.getStampHeight(), getStampHeight()) == 0 && Double.compare(stamp.getStampWidth(), getStampWidth()) == 0 && getStampName().equals(stamp.getStampName()) && getStampCondition().equals(stamp.getStampCondition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStampName(), getStampHeight(), getStampWidth(), getStampCondition());
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampHeight=" + stampHeight +
                ", stampWidth=" + stampWidth +
                ", stampCondition='" + stampCondition + '\'' +
                '}';
    }
}
