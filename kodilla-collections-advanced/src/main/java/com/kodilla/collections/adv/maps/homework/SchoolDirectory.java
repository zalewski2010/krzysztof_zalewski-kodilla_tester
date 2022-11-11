package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> edu = new HashMap<>();
        Principal czeslaw = new Principal("Czesław", "Michniewicz", "LO im Obrońców Azovstali");
        Principal kosta = new Principal("Kosta", "Runjaić", "LO im Bohaterów Donbasu");
        Principal marek = new Principal("Marek", "Papszun", "LO im Powstańców Warszawy");
        Principal john = new Principal("John", "van den Brom", "LO im Huty Stalowej Wola");

        School czeslawSchool = new School(Arrays.asList(25, 23, 27));
        School kostaSchool = new School (Arrays.asList(24, 28, 29));
        School marekSchool = new School(Arrays.asList(23, 24, 22));
        School johnSchool = new School(Arrays.asList(22, 21, 23));

        edu.put(czeslaw, czeslawSchool);
        edu.put(kosta, kostaSchool);
        edu.put(marek, marekSchool);
        edu.put(john, johnSchool);

        for (Map.Entry<Principal, School> principalEntry : edu.entrySet()) {
            System.out.println(principalEntry.getKey().getFirstname() + "," + principalEntry.getKey().getLastname()
                    + ",dyrektor : " + principalEntry.getKey().getSchoolName()
                    + " ,liczba uczniów w szkole :" + principalEntry.getValue().getSum());
        }
    }
}
