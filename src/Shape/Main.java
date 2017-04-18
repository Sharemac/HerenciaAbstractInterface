
package Shape;


public class Main {
    public static void main(String[] args) {
        Shape rectangulo = new Rectangle(5,10,4);
        int l = rectangulo.getNumSides();
        double a = rectangulo.getArea();
        double p = rectangulo.getPerimetro();
        System.out.println(l +" "+ a + " "+ p);
    }
}
