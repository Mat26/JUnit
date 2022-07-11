
package junit;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class calculadoraTest {
    
    calculadora cal;
    
    @Before
    public void setUp(){
       System.out.println("Before");
       cal = new calculadora(); 
    }
    
    @Test
    public void testSuma(){
        System.out.println("Suma");
        int actual = 15;
        //calculadora cal = new calculadora();
        int expected = cal.suma(7, 8);
        Assert.assertEquals(expected,actual);
    }
    
    @Test
    public void testResta(){
        System.out.println("Resta");
        int actual = -1;
        //calculadora cal = new calculadora();
        int expected = cal.resta(7, 8);
        Assert.assertEquals(expected,actual);
    }
    
    @Test
    public void testMultiplicacion(){
        System.out.println("Multiplicacion");
        int actual = 56;
        //calculadora cal = new calculadora();
        int expected = cal.multiplicacion(7, 8);
        Assert.assertEquals(expected,actual);
    }
    
    @After
    public void after(){
        System.out.println("After");
        cal.clear();
    }
}
