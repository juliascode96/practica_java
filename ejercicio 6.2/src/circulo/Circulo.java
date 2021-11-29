
package circulo;
import java.util.Scanner;
public class Circulo {
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public Circulo crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un radio para el circulo");
        double radio = leer.nextDouble();
        Circulo circulo = new Circulo(radio);
        circulo.setRadio(radio);
        return circulo;
    }
    
    
}
