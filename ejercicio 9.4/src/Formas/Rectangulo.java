
package Formas;

public class Rectangulo implements CalculosFormas{
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("El área del rectangulo es: " + (base*altura));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perímetro del rectangulo es: " + ((base*2) + (altura*2)));
    }
    
    
}
