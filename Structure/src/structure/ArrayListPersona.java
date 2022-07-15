package structure;


import entity.Persona;
import java.util.ArrayList;
import java.util.List;

public class ArrayListPersona {

    public static void main(String[] args) {
        List<Persona> array = new ArrayList<>();
        array.add(null);
        array.add(null);
        array.add(new Persona("Sara", "Diaz", 32));
        array.add(new Persona("Pedro", "Suarez", 21));
        array.add(new Persona("Laura", "Perez", 42));
        
        List<Persona> result = buscarPorApellido(array,"Perez");
        System.out.println(result);
       

    }
    
    private static List<Persona> buscarPorApellido(List<Persona> array, String apellido){
        List<Persona> result = new ArrayList<>();
        for(Persona per : array){
            if(per.getApellido().equals(apellido)){
                result.add(per);
            }
        }
        return result;
    }

}
