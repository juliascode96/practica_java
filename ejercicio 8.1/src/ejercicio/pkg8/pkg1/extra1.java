package ejercicio.pkg8.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

public class extra1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String selector;
        PerroSV sv = new PerroSV();
        PersonaSV sv2 = new PersonaSV();
        ArrayList<Perro> perrosEnAdopcion = new ArrayList();
        ArrayList<Persona> adoptantes = new ArrayList();

        do {
            Perro perro = sv.crearPerro();
            perrosEnAdopcion.add(perro);
            System.out.println("¿Desea agregar otro perro a la lista?");
            selector = read.next();
        } while (selector.equalsIgnoreCase("si"));

        System.out.println("¿Cuántas personas hay en la lista de espera de adopción?");
        int cant = read.nextInt();

        for (int i = 0; i < cant; i++) {
            Persona p = sv2.crearPersona();
            adoptantes.add(p);
        }
        
        adopciones(adoptantes, perrosEnAdopcion);
        mostrar(adoptantes);
        mostrar(perrosEnAdopcion);

    }

   
    //metodos
    public static void adopciones(ArrayList<Persona> adoptantes, ArrayList<Perro> perrosEnAdopcion) {
        Scanner read = new Scanner(System.in);
        for (Persona adop : adoptantes) {
            int c = 0;
            System.out.println("Qué perro de la lista desea adoptar?");
            String perro = read.next();
            for (int i = 0; i < perrosEnAdopcion.size(); i++) {
                c = 0;
                if (perrosEnAdopcion.get(i).getNombre().equalsIgnoreCase(perro)) {
                    c++;
                }
                if (c == 1) {
                    adop.setPerro(perrosEnAdopcion.get(i));
                    perrosEnAdopcion.remove(i);
                }
            }

            if (c == 0) {
                System.out.println("El perro no ha sido encontrado");
            }

        }

    }
    
    public static void mostrar(ArrayList lista) {
        for (Object object : lista) {
            System.out.println(object);
        }
        
    }
}
