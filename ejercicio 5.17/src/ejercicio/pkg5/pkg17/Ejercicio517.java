//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
//tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
//con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
//carácter tiene que ser X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la
//secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
//secuencia distinta de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
//correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
//se utilizan las siguientes funciones de Java Substring(), Length(), equals().

package ejercicio.pkg5.pkg17;

import java.util.Scanner;
import java.lang.String;

public class Ejercicio517 {

 
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int correcto = 0;
        int incorrecto = 0;
        String frase = " ";
        
        while (!"&&&&&".equals(frase)) {
            System.out.println("Ingrese una frase. Para que sea correcta debe comenzar con X, terminar con O y tener cinco letras. Ingrese &&&&& para salir");
            frase = Sc.nextLine();
            
            if (frase.length() == 5 && frase.charAt(0) == 'X' && frase.charAt(frase.length()-1) == 'O') {
                correcto ++;
                
            } else {
                incorrecto++;
            }
            System.out.println(frase.charAt(0));
            System.out.println(frase.charAt(frase.length()-1));
                
            }
        incorrecto--; //para no contar la cadena de salida del bucle
        
        System.out.println("La cantidad de cadenas correctas es " + correcto);
        System.out.println("La cantidad de cadenas incorrectas es " + incorrecto);
        
       
            
        }
        
    }
    
}
