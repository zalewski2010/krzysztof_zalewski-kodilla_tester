package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
Set <Stamp> stamps = new HashSet<>();
stamps.add(new Stamp("Madagascar",2.0, 2.1, " stamped"));
stamps.add(new Stamp("Madagascar",2.0, 3.5, " not stamped")); // powtarza się
stamps.add(new Stamp("Madagascar",2.0, 3.5, " not stamped"));
stamps.add(new Stamp("San Escobar",2.1, 2.2, "not stamped"));
stamps.add(new Stamp("San Escobar",2.1, 2.2, "not stamped")); // powtarza się
stamps.add(new Stamp("San Escobar",2.1, 2.2, " stamped"));
stamps.add(new Stamp("British Guiana",3.5, 2.3, " stamped"));
stamps.add(new Stamp("British Guiana",3.5, 2.3, " stamped")); // powtarza się
stamps.add(new Stamp("British Guiana",2.2, 2.3, " not stamped"));
stamps.add(new Stamp("The Penny Black",2.3, 2.4, " stamped"));
stamps.add(new Stamp("The Penny Black",2.3, 2.4, " stamped")); // powtarza się
stamps.add(new Stamp("The Penny Black",3.3, 3.4, " stamped"));
stamps.add(new Stamp("The Penny Black",2.3, 2.4, " not stamped"));
stamps.add(new Stamp("The Penny Black",2.3, 2.4, " not stamped")); // powtarza się
stamps.add(new Stamp("The Penny Black",3.3, 3.4, " not stamped"));

        System.out.println("numbers of elements = " + stamps.size() + " stamps");
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
