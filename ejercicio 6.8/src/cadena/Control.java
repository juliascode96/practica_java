/*
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package cadena;

public class Control {

    public static boolean contiene(Cadena frase, String letra) {
        boolean cont = frase.getFrase().contains(letra);
        return cont;
    }

    public static String reemplazar(Cadena frase, String letra) {
        String nuevaFrase = "";
        
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().substring(i, i+1).equalsIgnoreCase("a")) {
                nuevaFrase += letra;
                
            } else {
                nuevaFrase += frase.getFrase().substring(i, i+1);
            }
            
        }

//        for (int i = 0; i < frase.getLongitud() - 1; i++) {
//            if (frase.getFrase().substring(i, i + 1).equalsIgnoreCase("a")) {
//                nuevaFrase = nuevaFrase.substring(0, i);
//                nuevaFrase = nuevaFrase.concat(letra);
//                nuevaFrase = nuevaFrase.concat(frase.getFrase().substring(i + 1, frase.getLongitud() - 1));
//
//            }
//
//        }
//
//        if (frase.getFrase().substring(frase.getLongitud() - 1).equalsIgnoreCase("a")) {
//            nuevaFrase = nuevaFrase.substring(0, nuevaFrase.length() - 1).concat(letra);
//        } else {
//            nuevaFrase = nuevaFrase.substring(0, nuevaFrase.length() - 1).concat(frase.getFrase().substring(frase.getLongitud() - 1));
//        }

        return nuevaFrase;

    }

    public static String unirFrases(Cadena frase, String frase2) {
        String nuevaFrase = frase.getFrase().concat(frase2);
        return nuevaFrase;

    }

    public static void compararFrases(Cadena frase, String frase2) {
        if (frase.getFrase().length() > frase2.length()) {
            System.out.println("La longitud de la primera frase es mayor...");

        } else if (frase.getFrase().length() < frase2.length()) {
            System.out.println("La longitud de la segunda frase ingresada es mayor...");
        } else if (frase.getFrase().length() == frase2.length()) {
            System.out.println("Ambas frases tienen la misma longitud...");
        }
    }

    public static int vecesRepetido(Cadena frase, String caracter) {
        int repeticiones = 0;

        for (int i = 0; i < frase.getLongitud(); i++) {
            if (caracter.equalsIgnoreCase(frase.getFrase().substring(i, i + 1))) {
                repeticiones++;
            }

        }

        return repeticiones;
    }

    public static String invertirFrase(Cadena frase) {
        StringBuilder invertir = new StringBuilder(frase.getFrase());
        String fraseInvertida = invertir.reverse().toString();

//        for (int i = frase.getLongitud() - 1; i > -1; i--) {
//            fraseInvertida = fraseInvertida.concat(frase.getFrase().substring(i, i + 1));
//        }
        return fraseInvertida;
    }

    public static int mostrarVocales(Cadena frase) {
        int vocales = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().substring(i, i + 1).equalsIgnoreCase("a")
                    || frase.getFrase().substring(i, i + 1).equalsIgnoreCase("e")
                    || frase.getFrase().substring(i, i + 1).equalsIgnoreCase("i")
                    || frase.getFrase().substring(i, i + 1).equalsIgnoreCase("o")
                    || frase.getFrase().substring(i, i + 1).equalsIgnoreCase("u")) {
                vocales++;
            }
        }
        return vocales;
    }

}
