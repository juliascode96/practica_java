package electrodomesticos.service;

import electrodomesticos.Electrodomestico;
import java.util.Scanner;

public class ElectrodomesticoSV {
    Electrodomestico e = new Electrodomestico();

    private void comprobarConsumo(char letra) {
        switch (letra) {
            case 'A':
                e.setConsumo(letra);
                break;
            case 'B':
                e.setConsumo(letra);
                break;
            case 'C':
                e.setConsumo(letra);
                break;
            case 'D':
                e.setConsumo(letra);
                break;
            case 'E':
                e.setConsumo(letra);
                break;
            case 'F':
                e.setConsumo(letra);
                break;
            default:
                e.setConsumo('F');
                break;
        }
        
    }

    private void comprobarColor(String color) {
        switch (color) {
            case "blanco":
                e.setColor(color);
                break;
            case "negro":
                e.setColor(color);
                break;
            case "rojo":
                e.setColor(color);
                break;
            case "azul":
                e.setColor(color);
                break;
            case "gris":
                e.setColor(color);
                break;
            default:
                e.setColor("blanco");
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
        e.setColor(color);
        e.setConsumo(letra);
        e.setPeso(peso);
        e.setPrecio(1000d);
        comprobarColor(color);
        comprobarConsumo(letra);
       
    }

    public void precioFinal() {
        switch (e.getConsumo()) {
            case 'A':
                e.setPrecio(e.getPrecio() + 1000);
                break;
            case 'B':
                e.setPrecio(e.getPrecio() + 800);
                break;
            case 'C':
                e.setPrecio(e.getPrecio() + 600);
                break;
            case 'D':
                e.setPrecio(e.getPrecio() + 500);
                break;
            case 'E':
                e.setPrecio(e.getPrecio() + 300);
                break;
            case 'F':
                e.setPrecio(e.getPrecio() + 100);
                break;
        }

        if (e.getPeso()<19) {
            e.setPrecio(e.getPrecio()+100);
        } else if (e.getPeso()>20 || e.getPeso()<50) {
             e.setPrecio(e.getPrecio()+500);
        } else if (e.getPeso()>50 || e.getPeso()<80) {
             e.setPrecio(e.getPrecio()+800);
        } else {
             e.setPrecio(e.getPrecio()+1000);
        }

    }

}
