
package junit;



import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;



public class calificacionTest {
    
    calificacion calificar;
    
    @Before
    public void setUp(){
        calificar = new calificacion();
    }
    
    @Test
    public void giveNotaMenorA40_whenCalificarNota_thenReturnD() {
        String expected = "D";
        String actual = calificar.calificarNota(0);
        Assert.assertEquals(expected, actual);
    }
    
    
    @Test
    public void giveNotaEntre40And60_whenCalificarNota_thenReturnF() {
        String expected = "F";
        String actual = calificar.calificarNota(50);
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void giveNotaEntre60And80_whenCalificarNota_thenReturnA() {
        String expected = "A";
        String actual = calificar.calificarNota(70);
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void giveNotaMayorA80_whenCalificarNota_thenReturnE() {
        String expected = "E";
        String actual = calificar.calificarNota(89);
        Assert.assertEquals(expected, actual);
    }
    
}
