
package structure;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;


public class SetJava {
    public static void main(String[] args) {
        Set<String> array = new HashSet<>();
        Set<String> array1 = new HashSet<>(Arrays.asList("1","2","3"));
        Set<String> array2 = new HashSet<>(5);
        System.out.println("*****ADD*****");
        array.add("1");
        array.add("2");
        array.add("3");
        array.add(null);
        array.add(null);
        array.addAll(Arrays.asList("3","4"));
        System.out.println(array);
        System.out.println("*******SIZE******");
        System.out.println(array.size());
        System.out.println("******REMOVE*****");
        array.remove("5");
        System.out.println(array);
        array.removeAll(Arrays.asList("1","3"));
        System.out.println(array);
        System.out.println("*******CONTAINS****");
        System.out.println(array.contains("2"));
        System.out.println(array.containsAll(Arrays.asList("2","4")));
        System.out.println("********CLEAR******");
        //array.clear();
        System.out.println(array);
        System.out.println("*******ISEMPTY****");
        System.out.println(array.isEmpty());
        System.out.println("*******TOARRAY****");
        String[] ar = new String[array.size()];
        array.toArray(ar);
        for(String a : ar){
            System.out.print(a + " ");
        }
        System.out.println("*****RECORRER***");
        for(String el : array){
            System.out.print(el + " ");
        }
    }
}
