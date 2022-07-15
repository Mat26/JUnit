
package junitclass;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;




public class CalcularTest {
    
    Calcular cal;
    
    @BeforeClass//@BeforeAll
    public static void before(){
        System.out.println("BeforeClass");
    }
    
    @Before//@BeforeEach
    public void setUp(){
        System.out.println("Before");
        cal = new Calcular(4,2);
    }
    
    @Test
    public void sumarTest(){
        System.out.println("Sumar");
        Assert.assertEquals(6, cal.sumar());
    }
    
    @Test
    public void restarTest(){
        System.out.println("Restar");
        Assert.assertEquals(2, cal.restar());
    }
    
    @Test
    public void multiplicarTest(){
        System.out.println("Multiplicar");
        Assert.assertEquals(8, cal.multiplicar());
    }
    
    @After
    public void after(){
        System.out.println("AFTER");
        
    }
    
    @AfterClass
    public static void afterClas(){
        System.out.println("AfterClass");
    }
    
    
}
