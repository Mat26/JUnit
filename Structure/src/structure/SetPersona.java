
package structure;
import entity.Persona;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class SetPersona {
    public static void main(String[] args) {
        Set<Persona> personas = new HashSet<>();
        personas.add(null);
        personas.add(null);
        personas.add(new Persona("Sara", "Diaz", 32));
        personas.add(new Persona("Sara", "Perez", 32));
        personas.add(new Persona("Laura", "Perez", 42));
        System.out.println(personas);
    }
}
