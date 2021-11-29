/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
 */
package ejercicio.pkg6.pkg4;


public class Rectangulo {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public static double superficie(Rectangulo rectangulo) {
        double superficie = rectangulo.getBase() * rectangulo.getAltura();
        return superficie;
    }
    
    public static double perimetro(Rectangulo rectangulo) {
        double perimetro = (rectangulo.getBase() + rectangulo.getAltura()) * 2;
        return perimetro;
    }
    
    public static void dibujarRectangulo(Rectangulo rectangulo){
        for (int i = 0; i < rectangulo.getAltura(); i++) {
            for (int j = 0; j < rectangulo.getBase(); j++) {
                if (i == 0 || j == 0 || i == (rectangulo.getAltura()-1) || j == (rectangulo.getBase()-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
 
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
    
}
