package com.tsarenko.homework.hw.Homework.ENUM;

public enum Genge {
    DYSTOPIAN("Dystopian"), FAIRY_TALE("Fairy tale"), ROMANCE("Romance"), CLASSIC("Classic");
    String genge;

    Genge(String genge) {
        this.genge = genge;
    }

    public String getGenge() {
        return genge;
    }
}
