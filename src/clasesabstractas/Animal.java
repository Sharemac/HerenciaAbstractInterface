
package clasesabstractas;


public abstract class Animal {
    private int numLegs;

    public Animal(int numLegs) {
        this.numLegs = numLegs;
    }

    public int getNumLegs() {
        return numLegs;
    }
    
    
  /*  public void hacerSonido(){
        System.out.println(" ");
    } No hay necesidad de hacerlo
    no sirve para obligar a los hijos a definir
    la clase debe ser abstract 
    */  
    
    public abstract void hacerSonido();
        
    }
