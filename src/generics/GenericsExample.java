package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String [] args) {
        // An example without Generics
        List listWithoutGenerics = new ArrayList();
        listWithoutGenerics.add("Element 1");
        listWithoutGenerics.add(10);

        System.out.println(listWithoutGenerics);

        //An example using Generics
        List<String> listGenerics = new ArrayList<>();
        listGenerics.add("Element 1");
        listGenerics.add("Element 2");
        // listGenerics.add(10);

        System.out.println(listGenerics);
    }

}
