
package junit;


public class calculadora {
    
    private int ans;
    
    public calculadora(){
        
    }
    
    public int suma(int num1,int num2){
        this.ans = num1 + num2;
        return ans;
    }
   
    
    public int resta(int num1, int num2){
        this.ans = num1 - num2;
        return ans;
    }
    
    public int multiplicacion(int num1, int num2){
         this.ans = num1 * num2;
        return ans;
    }
    
    public void clear(){
        this.ans = 0;
    }
    
}
