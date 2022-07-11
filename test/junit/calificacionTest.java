
package junit;



import junit.framework.Assert;
import org.junit.Test;



public class calificacionTest {
    
    @Test//Marca este método como una prueba.(Reconoce JUNIT como una prueba)
    public void testCalificarNota() {
        String actual = "D";
        calificacion instance = new calificacion();
        String expected = instance.calificarNota(0);
        Assert.assertEquals(expected, actual);
    }
    
}
