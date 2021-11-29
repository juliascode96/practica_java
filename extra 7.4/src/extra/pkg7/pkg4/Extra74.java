/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos
 */
package extra.pkg7.pkg4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Extra74 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        HashMap<Integer, String> ciudades = new HashMap();
        ciudades.put(17000, "Sanxay");
        ciudades.put(00000, "Kanton");
        ciudades.put(3919, "Kujalleq");
        ciudades.put(43601, "Bayan");
        ciudades.put(040303, "Carchi");
        ciudades.put(5140, "Hinche");
        ciudades.put(1401, "Cojutepeque");
        ciudades.put(8011, "Christchurch");
        ciudades.put(49220, "Atoyac");
        ciudades.put(32050, "Budisavci");

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese una ciudad");
            String ciudad = read.next();
            System.out.println("Ingrese su código postal");
            Integer cp = read.nextInt();
            ciudades.put(cp, ciudad);
        }

        ciudades.entrySet().forEach((aux) -> {
            Integer key = aux.getKey();
            String value = aux.getValue();

            System.out.println("Código postal: " + key + ", ciudad: " + value);
        });

        System.out.println("Ingrese un código postal para buscar la ciudad correspondiente");
        Integer codigo = read.nextInt();
        ciudades.entrySet().forEach((aux) -> {
            if (codigo.intValue() == aux.getKey().intValue()) {
                System.out.println(aux.getValue());

            }
        });

        System.out.println("Ingrese una ciudad");
        String ciudad = read.next();
        System.out.println("Ingrese su código postal");
        Integer cp = read.nextInt();
        ciudades.put(cp, ciudad);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese ciudad para borrar");
            String borrar = read.next();
            for (Iterator<Map.Entry<Integer, String>> it = ciudades.entrySet().iterator(); it.hasNext();) {
                Map.Entry<Integer, String> entry = it.next();
                if (entry.getValue().equals(borrar)) {
                    it.remove();
                }
            }

        }

        ciudades.entrySet().forEach((aux) -> {
            Integer key = aux.getKey();
            String value = aux.getValue();

            System.out.println("Código postal: " + key + ", ciudad: " + value);
        });

    }
}
