
package junit;


public class calificacion {
    
    public String calificarNota(int nota){
        if(nota <= 40){
            return "D";
        }else if(nota > 40 || nota <60){
            return "F";
        }else if(nota >=60 || nota < 80){
            return "A";
        }else{
            return "E";
        }
    }
    
}
