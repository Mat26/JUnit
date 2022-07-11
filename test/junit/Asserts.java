
package junit;

import junit.framework.Assert;
import org.junit.Test;


public class Asserts {
    
   @Test
   public void assertTest(){
       
       byte c = 1;
       byte d = 1;
       Assert.assertEquals(c,d);
       Assert.assertEquals("",c,d);
       
       short e = 9;
       short f = 9;
       Assert.assertEquals(e,f);
       Assert.assertEquals("",e,f);
       
       int a = 10;
       int b = 10;
       Assert.assertEquals(a,b);
       Assert.assertEquals("",a,b);
       
       long i = 1123;
       long j = 1123;
       Assert.assertEquals(i,j);
       Assert.assertEquals("",i,j);
       
       float g = 10.3f;
       float h = 10.3f;
       Assert.assertEquals(g,h,0);
       Assert.assertEquals("",g,h,0);
       
       double k = 10.5;
       double l = 10.3;
       Assert.assertEquals(k,l,0.3);//El valor absoluto de la resta k y l, si es menor a delta ent true, sino es false
       Assert.assertEquals("",k,l,1);
       
       boolean m = true;
       boolean n = true;
       Assert.assertEquals(m,n);
       Assert.assertEquals("",m,n);
       //Assert.assertFalse(m);
       Assert.assertTrue(n);
       
       char o = 'a';
       char p = 'a';
       Assert.assertEquals(o,p);
       Assert.assertEquals("",o,p);
       
       String q = "Hola";
       String r = "Hola";
       Assert.assertEquals(q,r);
       Assert.assertEquals("",q,r);
       Assert.assertSame(q, r);
       
       String s = new String("Hola");
       String t = new String("Hola");
       Assert.assertEquals(s,t);
       Assert.assertSame(s, t);
       Assert.assertSame("",s, t);
       
      
   }
}
