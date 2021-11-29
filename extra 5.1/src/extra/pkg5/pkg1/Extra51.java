package extra.pkg5.pkg1;

import java.util.Scanner;

public class Extra51 {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("Ingrese tiempo en minutos");

        int minutos = Sc.nextInt();

        int horas = 0;
        int dias = 0;

        if (minutos >= 60) {
            horas = minutos / 60;
            minutos = minutos % 60;

            if (horas >= 24) {
                dias = horas / 24;
                horas = horas % 24;
            } 
            System.out.println("Días: " + dias + " - horas: " + horas + " - minutos: " + minutos);

        } else {
            System.out.println("Días: " + dias + " - horas: " + horas + " - minutos: " + minutos);
        }
        
        

    }

}
