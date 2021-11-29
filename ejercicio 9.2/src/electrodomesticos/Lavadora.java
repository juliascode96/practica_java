
package electrodomesticos;

import java.util.Scanner;

public class Lavadora extends Electrodomestico{
    private Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga) {
        this.carga = carga;
    }

    public Lavadora(Double carga, Double precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    @Override
    public Double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public char getConsumo() {
        return consumo;
    }

    @Override
    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    @Override
    public Double getPeso() {
        return peso;
    }

    @Override
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    
    //Metodos
    
     @Override
    public void crearElectrodomestico() {
        Scanner read = new Scanner(System.in);
        super.crearElectrodomestico(); 
        System.out.println("Cuánta carga soporta la lavadora?");
        Double carga = read.nextDouble();
        this.carga = carga;
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        
        if (carga>30) {
           this.precio = this.precio + 500; 
        }
    }
    
    
}
