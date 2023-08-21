package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericsExample {
    public static void main(String [] args) {
        // An example without Generics
        List listWithoutGenerics = new ArrayList();
        listWithoutGenerics.add("Element 1");
        listWithoutGenerics.add(10);

        // printing out
        listWithoutGenerics.forEach(element -> System.out.println(element.getClass().getName()));

        //An example using Generics
        List<String> listGenerics = new ArrayList<>();
        listGenerics.add("Element 1");
        listGenerics.add("Element 2");
        // listGenerics.add(10); it doesn't permit adding the element because it's an Integer

        // printing out
        listGenerics.forEach(element -> System.out.println(element.getClass().getName()));

        System.out.println("***********************************************************");
        System.out.println();

        System.out.println("Maps");

        Map mapWithoutGenerics = new HashMap();
        mapWithoutGenerics.put("Key 1", 10);
        mapWithoutGenerics.put("key 2", "11");

        System.out.println();
        System.out.println("Without Generics");
        mapWithoutGenerics.forEach((key, value) -> {
            System.out.print(key + " - Value: ");
            System.out.println(value);
            System.out.println(key.getClass().getName());
            System.out.println(value.getClass().getName());
        });

        Map<String, Integer> mapGenerics = new HashMap<>();
        mapGenerics.put("Key 1", 10);
        mapGenerics.put("key 2", 11);
        //mapGenerics.put("key 3", "12"); it's not permitted

        System.out.println();
        System.out.println("With Generics");
        mapGenerics.forEach((key, value) -> {
            System.out.print(key + " - Value: ");
            System.out.println(value);
            System.out.println(key.getClass().getName());
            System.out.println(value.getClass().getName());
        });


    }

}
