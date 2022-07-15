
package structure;
import java.util.HashMap;
import java.util.Map;

public class HashMapJava {
    public static void main(String[] args) {
        HashMap<Integer, String> diccionario = new HashMap<>();
        System.out.println("*******PUT********");
        diccionario.put(1, "valor1");
        diccionario.put(2, "valor2");
        diccionario.put(3, "valor3");
        diccionario.put(4, "valor4");
        System.out.println(diccionario);
        System.out.println("******SIZE******");
        System.out.println(diccionario.size());
        System.out.println("*******GETKEY****");
        System.out.println(diccionario.get(3));
        System.out.println("*******CONTAINS*****");
        System.out.println(diccionario.containsKey(5));
        System.out.println(diccionario.containsValue("valor3"));
        System.out.println("******REPLACE******");
        diccionario.replace(3,"valor3","valorActualizado");
        System.out.println(diccionario);
        System.out.println("****REMOVE****");
        diccionario.remove(3,"valorActualizado");
        System.out.println(diccionario);
        System.out.println("*******CLONE*******");
        HashMap<Integer, String> clone = (HashMap) diccionario.clone();
        System.out.println(clone);
        System.out.println(diccionario.entrySet());
        recorrerDiccionario2(diccionario);
        
    }
    
    private static void recorrerDiccionario(Map<Integer,String> diccionario){
        for(Integer a: diccionario.keySet()){
            System.out.println("Clave: " + a + " Value: " + diccionario.get(a));
        }
    }
    
     private static void recorrerDiccionario2(Map<Integer,String> diccionario) {
        for(Map.Entry entry : diccionario.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " , valor: " + entry.getValue());
        }
    }
}
