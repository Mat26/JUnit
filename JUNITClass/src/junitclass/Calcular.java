
package junitclass;


public class Calcular {
    
    public int x;
    public int y;
    
    public Calcular(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int sumar(){
        return x + y;
    }
    
    public int restar(){
        return x - y;
    }
    
    public int multiplicar(){
        return x * y;
    }
    
}
