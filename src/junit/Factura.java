
package junit;

import java.util.ArrayList;


public class Factura {
     private ArrayList<Double> lineas= new ArrayList<>();
  
  
  public ArrayList<Double> getLineas() {
    return lineas;
  }
  public void setLineas(ArrayList<Double> lineas) {
    this.lineas = lineas;
  }
  
  public void addLinea(double linea) {    
    lineas.add(linea);    
  }
  
  
  public double sumarLineas () {
    double total=0;
    for (double linea: lineas) {
      
      total+=linea;
      
    }
    return total;
  }
  
  
  public double mayor () {
    double mayor=0;
    for (double linea: lineas) {
      
      if (mayor<linea) {
        mayor=linea;
      }
      
    }
    return mayor;
  }
  
}
