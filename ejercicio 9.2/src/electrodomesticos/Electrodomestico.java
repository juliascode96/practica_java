
package electrodomesticos;

import java.util.Scanner;

public class Electrodomestico {
   protected Double precio;
   protected String color;
   protected char consumo;
   protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
    
    
   
    //Metodos
    
    private void comprobarConsumo(char letra) {
        if (letra>'F' || letra<'A') {
            this.consumo = 'F';
            
        } else {
            this.consumo = letra;
        }
        
    }

    private void comprobarColor(String color) {
        switch (color) {
            case "blanco":
              this.color = color;
            case "negro":
               this.color = color;
                break;
            case "rojo":
                this.color = color;
                break;
            case "azul":
                this.color = color;
                break;
            case "gris":
                this.color = color;
                break;
            default:
                this.color = "Blanco";
                break;
        }
    }

    public void crearElectrodomestico() {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese consumo energético de su electrodoméstico");
        char letra = read.next().charAt(0);
        System.out.println("Ahora ingrese el color");
        String color = read.next();
        System.out.println("Por último ingrese su peso");
        Double peso = read.nextDouble();
        this.color = color;
        this.consumo = letra;
        this.peso = peso;
        this.precio = 1000d;
        comprobarColor(color);
        comprobarConsumo(letra);
    }

    public void precioFinal() {
        switch (this.consumo) {
            case 'A':
                this.precio = this.precio + 1000;
                break;
            case 'B':
                this.precio = this.precio + 800;
                break;
            case 'C':
                this.precio = this.precio + 600;
                break;
            case 'D':
                this.precio = this.precio + 500;
                break;
            case 'E':
                this.precio = this.precio + 300;
                break;
            case 'F':
                this.precio = this.precio + 100;
                break;
        }

        if (this.peso<19) {
            this.precio = this.precio + 100;
        } else if (this.peso>20 && this.peso<50) {
              this.precio = this.precio + 500;
        } else if (this.peso>50 && this.peso<80) {
            this.precio = this.precio + 800;
        } else {
             this.precio = this.precio + 1000;
        }

    }
   
   
   
    
}
