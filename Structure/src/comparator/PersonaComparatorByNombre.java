
package comparator;

import java.util.Comparator;
import entity.Persona;

public class PersonaComparatorByNombre implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getNombre().compareTo(p2.getNombre());
    }
    
}
