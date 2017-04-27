package com.blecua84;

import com.blecua84.foreach.ForeachDefinition;
import com.blecua84.foreach.impl.ForeachInList;
import com.blecua84.foreach.impl.ForeachInMap;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<ForeachDefinition> foreachDefinitionList = new ArrayList<>();

        foreachDefinitionList.add(new ForeachInMap());
        foreachDefinitionList.add(new ForeachInList());

        foreachDefinitionList.forEach((foreachMethod) -> foreachMethod.printForeach());
    }
}
