package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Papież Jan Paweł II 1993", 4, 4, false));
        stamps.add(new Stamp("50 rocznica powstania warszawskiego", 3, 4, true));
        stamps.add(new Stamp("Euro 2012", 3, 4, false));
        stamps.add(new Stamp("Kot Filemon 1998", 4, 4, false));
        stamps.add(new Stamp("Papież Jan Paweł II 1993", 4, 4, false)); // 5 element taki sam jak pierwszy

        System.out.println(stamps.size()); // powinno wyswietlic 4
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}