
package extra.pkg6.pkg5;
/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
No ha acertado. Intente adivinarlo introduciendo otro mes: octubre
¡Ha acertado!
*/

import java.util.Scanner;

public class Extra65 {
    


    public static void main(String[] args) {
        mesControl sv = new mesControl();
        String[] meses = new String[] {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        Mes mes = sv.definirMes(meses);
        System.out.println(mes.getMesSecreto());
        adivinarMes(mes);
        
        
    }
    
    public static void adivinarMes(Mes mes) {
    Scanner read = new Scanner(System.in);
    String adivinar = "";
    System.out.println("Introduzca el nombre de un mes");
    while (!adivinar.equalsIgnoreCase(mes.getMesSecreto())) {
        adivinar = read.next();
        if (adivinar.equalsIgnoreCase(mes.getMesSecreto())) {
            System.out.println("¡Ha acertado!");
        } else {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
        }
        
    }
        
    }
    
}
