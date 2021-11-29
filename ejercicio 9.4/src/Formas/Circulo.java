
package Formas;

public class Circulo implements CalculosFormas{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("El área del circulo es: " + (PI*(radio*radio)));
    }

    @Override
    public void calcularPerimetro() {
       System.out.println("El perímetro del circulo es: " + (PI*(radio*2)));
    }
    
    
}
