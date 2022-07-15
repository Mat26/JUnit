
package structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListJava {

  
    public static void main(String[] args) {
        String[] a = new String[]{"1","2"};
        List<String> array = new ArrayList<>();
        System.out.println("*******ADD**********");
        array.add("0");
        array.add("1");
        array.add("2");
        array.add("3");
        System.out.println(array);
        array.add(1, "4");
        System.out.println(array);
        array.addAll(Arrays.asList("5","7"));
        System.out.println(array);
        array.addAll(2,Arrays.asList("7","8"));
        System.out.println(array);
        System.out.println("*******GET*********");
        String elemento3 = array.get(3);
        System.out.println(elemento3);
        System.out.println("*******SET********");
        array.set(0, "9");
        System.out.println(array);
        System.out.println("****CONTAINS*****");
        boolean esta = array.contains("0");
        System.out.println(esta);
        boolean estan = array.containsAll(Arrays.asList("8","0"));
        System.out.println(estan);
        System.out.println("*****INDEXOF*******");//no existe devuelve -1
        int posicion = array.indexOf("7");
        System.out.println(posicion);
        int posicionFinal = array.lastIndexOf("7");
        System.out.println(posicionFinal);
        System.out.println("******REMOVE******");
        array.remove("7");
        System.out.println(array);
        array.remove(4);
        System.out.println(array);
        array.removeAll(Arrays.asList("4","10"));
        System.out.println(array);
        System.out.println("*********SORT*********");
        Collections.reverse(array);
        System.out.println(array);
        /*
        System.out.println("*******CLEAR*****");
        array.clear();
        System.out.println(array);
        System.out.println("******ISEMPTY****");
        System.out.println(array.isEmpty());
        recorrerLista2(array);*/
        
    }
    
    private static void recorrerLista(List<String> array){
        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
    }
    
    private static void recorrerLista2(List<String> array){
        for(String ar : array){
            System.out.println(ar);
        }
    }
    
}
