package junit;



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
        f.addLinea(300);
        f.addLinea(400);
    }

    @Test
    public void sumaTest() {
        Assert.assertEquals(1000, f.sumarLineas(), 0);
    }

    @Test
    public void mayorTest() {
        Assert.assertEquals(400, f.mayor(), 0);
    }


}
