/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesabstractas;

/**
 *
 * @author Estudiante
 */
public class Gato extends Animal {

    public Gato(int numLegs) {
        super(numLegs);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau..."); 
    }
    
}
