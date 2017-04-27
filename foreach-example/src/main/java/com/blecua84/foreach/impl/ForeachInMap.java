package com.blecua84.foreach.impl;

import com.blecua84.foreach.ForeachDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * Foreach example with a map. In Java 8, you can loop a Map with forEach + lambda expression.
 *
 * @author blecua84
 */
public class ForeachInMap implements ForeachDefinition {

    private Map<String, Integer> getExampleMap() {

        Map<String, Integer> mapToReturn = new HashMap<>();

        mapToReturn.put("A", 10);
        mapToReturn.put("B", 20);
        mapToReturn.put("C", 30);
        mapToReturn.put("D", 40);
        mapToReturn.put("E", 50);
        mapToReturn.put("F", 60);

        return mapToReturn;
    }

    @Override
    public void printForeach() {
        System.out.println("Init " + ForeachInMap.class.getName() + "...");
        Map<String, Integer> items = getExampleMap();

        items.forEach((key, value) -> System.out.println("Item: " + key + ", Count: " + value));

        items.forEach((key, value) -> {
            System.out.println("Item: " + key + ", Count: " + value);

            if("E".equals(key)) {
                System.out.println("Hello E!");
            }
        });

        System.out.println("End " + ForeachInMap.class.getName() + "!!");
    }
}
