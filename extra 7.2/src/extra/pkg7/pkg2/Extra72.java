/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
package extra.pkg7.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

public class Extra72 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<CantanteFamoso> cantantes = new ArrayList();
        CantanteFamoso c1 = new CantanteFamoso("Alonso", "Perez", "Los días oscuros");
        CantanteFamoso c2 = new CantanteFamoso("Miranda", "R", "La vida escolar");
        CantanteFamoso c3 = new CantanteFamoso("Florencio", "Azul", "Cargando");
        CantanteFamoso c4 = new CantanteFamoso("Maitena", "Romualdo", "Peligro inminente");
        CantanteFamoso c5 = new CantanteFamoso("Astor", "Pastor", "Rimas y versos");

        cantantes.add(c1);
        cantantes.add(c2);
        cantantes.add(c3);
        cantantes.add(c4);
        cantantes.add(c5);

        cantantes.forEach((cantante) -> {
            System.out.println(cantante);
        });

        int selector = 0;

        while (selector < 4) {
            System.out.println("Ingrese el número de la acción que desea realizar");
            System.out.println("1. Agregar un cantante \n 2. Eliminar un cantante \n 3. Ver todos los cantantes \n 4. Salir");
            selector = read.nextInt();
            switch (selector) {
                case 1:
                    System.out.println("Ingrese nombre del cantante");
                    String nombre = read.next();
                    System.out.println("Ingrese apellido del cantante");
                    String apellido = read.next();
                    System.out.println("Ahora ingrese su disco más vendido");
                    String disco = read.next();
                    CantanteFamoso cNuevo = new CantanteFamoso(nombre, apellido, disco);
                    cantantes.add(cNuevo);
                    break;
                case 2:
                    System.out.println("Ingrese apellido del cantante que desea eliminar");
                    String cEliminar = read.next();
                    for (int i = 0; i < cantantes.size() - 1; i++) {
                        if (cEliminar.equalsIgnoreCase(cantantes.get(i).getApellido())) {
                            cantantes.remove(i);
                        }
                    }

                    break;
                case 3:
                    cantantes.forEach((cantante) -> {
                        System.out.println(cantante);
                    });
                    break;

                default:
                    break;
            }

        }

        cantantes.forEach((cantante) -> {
            System.out.println(cantante);
        });

    }
}
