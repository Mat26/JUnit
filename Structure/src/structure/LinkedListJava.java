package structure;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;

public class LinkedListJava {

    public static void main(String[] args) {
        LinkedList<Integer> array = new LinkedList<>();
        LinkedList<Integer> array2 = new LinkedList<>(Arrays.asList(6, 7, 8));
        System.out.println("****************ADD*********");
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        System.out.println(array);
        array.add(2,5);
        System.out.println(array);
        array.addAll(array2);
        System.out.println(array);
        array.addFirst(0);
        System.out.println(array);
        array.addLast(9);
        System.out.println(array);
        array.offer(5);
        System.out.println(array);
        System.out.println("**********GET********");
        System.out.println(array.get(4));
        System.out.println(array.getFirst());
        System.out.println(array.getLast());
        //FIFO Primero en entrar, primero en salir
        //LIFO Ultimo en entrar, primero en salir
        System.out.println("********CONTAINS****");
        boolean esta = array.contains(8);
        System.out.println(esta);
        boolean estan = array.containsAll(Arrays.asList(1,2,3,4));
        System.out.println(estan);
        System.out.println("******INDEXOF*******");
        System.out.println(array.indexOf(5));
        System.out.println(array.lastIndexOf(5));
        System.out.println("*******POP*******");
        System.out.println(array.pop());
        System.out.println(array);
        System.out.println("*******PUSH*******");
        array.push(11);
        System.out.println(array);
        System.out.println(array.peek());
        System.out.println(array.peekFirst());
        System.out.println(array.peekLast());
        System.out.println("*******CLONE*****");
        List<Integer> listaClonada = (LinkedList)array.clone();
        System.out.println(listaClonada);
        recorrerLinked2(array);
    }
    
    private static void recorrerLinked(LinkedList<Integer> array){
        for(int i = 0; i < array.size(); i++){
            System.out.print(array.get(i) + " ");
        }
    }
    
    private static void recorrerLinked2(LinkedList<Integer> array){
        for(Integer i : array){
            System.out.print(i + " ");
        }
    }

}
