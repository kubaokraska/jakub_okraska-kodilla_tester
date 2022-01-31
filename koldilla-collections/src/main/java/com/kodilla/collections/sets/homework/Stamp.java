package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampWidth;
    private double stampHigh;
    boolean stampStamp;

    public Stamp(String stampName, double stampWidth, double stampHigh, boolean stampStamp) {
        this.stampName = stampName;
        this.stampWidth = stampWidth;
        this.stampHigh = stampHigh;
        this.stampStamp = stampStamp;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampWidth() {
        return stampWidth;
    }

    public double getStampHigh() {
        return stampHigh;
    }

    public boolean isStampStamp() {
        return stampStamp;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampWidth=" + stampWidth +
                ", stampHigh=" + stampHigh +
                ", stampStamp=" + stampStamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampWidth, stampWidth) == 0 && Double.compare(stamp.stampHigh, stampHigh) == 0 && stampStamp == stamp.stampStamp && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampWidth, stampHigh, stampStamp);
    }
}