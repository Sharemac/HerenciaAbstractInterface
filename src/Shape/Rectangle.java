
package Shape;


public class Rectangle extends Shape {
    private double largo;
    private double ancho;

    public Rectangle(double largo, double ancho, int numSides) {
        super(numSides);
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double getArea() {
        return this.largo*this.ancho;
    }

    @Override
    public double getPerimetro() {
        return (2*this.largo)+(2*this.ancho);
    }
    
}
