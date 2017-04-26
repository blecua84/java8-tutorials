package com.blecua84;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Sorting example with Java 8. "List" interface provides a new method called "sort". This avoids to use the Collections
 * method.
 *
 * @author blecua84
 */
public class Sorting {

    public static void main(String[] args) {

        List<Developer> developers = getDevelopers();

        System.out.println("Before Sort...");
        for(Developer developer: developers) {
            System.out.println(developer);
        }

        System.out.println("After Sort... -> Age");
        developers.sort((d1, d2) -> d1.getAge().compareTo(d2.getAge()));

        developers.forEach((developer) -> System.out.println(developer));

        System.out.println("After Sort... -> Salary");  
        developers.sort((d1, d2) -> d1.getSalary().compareTo(d2.getSalary()));
        developers.forEach((developer) -> System.out.println(developer));

        System.out.println("After Sort... -> Salary with comparator");
        Comparator<Developer> comparator = (d1, d2) -> d1.getSalary().compareTo(d2.getSalary());
        developers.sort(comparator);

        developers.forEach((developer) -> System.out.println(developer));

        System.out.println("After Sort... -> Salary with comparator reversed");
        developers.sort(comparator.reversed());

        developers.forEach((developer) -> System.out.println(developer));
    }

    private static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("jason", new BigDecimal("100000"), 10));
        result.add(new Developer("iris", new BigDecimal("170000"), 55));

        return result;

    }
}
