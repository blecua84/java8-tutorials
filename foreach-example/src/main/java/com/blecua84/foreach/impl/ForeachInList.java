package com.blecua84.foreach.impl;

import com.blecua84.foreach.ForeachDefinition;

import java.util.ArrayList;
import java.util.List;

/**
 * Foreach example with Java8 and List.
 *
 * @author blecua84
 */
public class ForeachInList implements ForeachDefinition {

    private List<String> getExampleList() {
        List<String> items = new ArrayList<>();

        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        return items;
    }

    @Override
    public void printForeach() {
        System.out.println("Init " + ForeachInList.class.getName() + "...");
        List<String> items = getExampleList();

        items.forEach((item) -> System.out.println(item));

        items.forEach((item) -> {
            if("E".equals(item)) {
                System.out.println("Hello E!");
            }
        });

        items.forEach(System.out::println);

        items.stream()
                .filter(item -> item.contains("B"))
                .forEach(System.out::println);

        System.out.println("End " + ForeachInList.class.getName() + "!!");
    }
}
