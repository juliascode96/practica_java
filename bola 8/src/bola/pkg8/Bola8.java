
package bola.pkg8;
import java.util.Scanner;

public class Bola8 {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Scanner read1 = new Scanner(System.in);
        
        System.out.println("Bienvenido al servidor de preguntas y respuestas de Madame Coquet... Ingresa una pregunta y (con suerte) sabrás la respuesta...");
        do {
            System.out.println("Ingrese pregunta");
            int respuesta = (int)Math.floor(Math.random()*(8-1+1)+1);
            read.nextLine();

        switch (respuesta) {
            case 1:
                System.out.println("Si");
                break;
            case 2:
                System.out.println("No");
                break;
            case 3:
                System.out.println("La respuesta es eso que estas pensando...");
                break;
            case 4:
                System.out.println("Clarifica tus ideas y sabrás");
                break;
            case 5:
                System.out.println("Escucha las estrellas");
                break;
            case 6:
                System.out.println("Seguí tus deseos");
                break;
            case 7:
                System.out.println("No tienes la suerte");
                break;
            case 8:
                System.out.println("Haz lo correcto");
                break;
        }
            
            System.out.println("Desea preguntar otra cosa?");
            
        } while (read1.next().equalsIgnoreCase("Si"));
        
    }
    
}
