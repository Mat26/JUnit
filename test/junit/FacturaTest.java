package junit;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FacturaTest {

    Factura f;

    @Before
    public void inicializar() {
        f = new Factura();
        f.addLinea(100);
        f.addLinea(200);
    }

    @Test
    public void sumaTest() {
        Assert.assertEquals(300, f.sumarLineas(), 0);
    }

    @Test
    public void restaTest() {
        Assert.assertEquals(200, f.mayor(), 0);
    }

    @After
    public void finaliza() {
        f = null;
    }

}
