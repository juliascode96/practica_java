/*
Los profesores del curso de programación de Egg necesitan llevar un registro de
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de
cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
del programa los profesores necesitan obtener por pantalla la cantidad de
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
con promedio mayor o igual al 7 de sus notas del curso.
 */
package extra.pkg5.pkg20;
import java.util.Scanner;

public class Extra520 {


    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        double[] notas = new double[10];
        int tp1;
        int tp2;
        int integrador1;
        int integrador2;
        double nota;
        int aprobados = 0;
        int desaprobados = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota del primer trabajo práctico del alumno número "+(i+1));
            tp1 = Sc.nextInt();
            System.out.println("Ingrese la nota del segundo trabajo práctico del alumno número "+(i+1));
            tp2 = Sc.nextInt();
            System.out.println("Ingrese la nota del primer integrador del alumno número "+(i+1));
            integrador1 = Sc.nextInt();
            System.out.println("Ingrese la nota del segundo integrador del alumno número "+(i+1));
            integrador2 = Sc.nextInt();
            
            nota = (tp1*0.1)+(tp2*0.15)+(integrador1*0.25)+(integrador2*0.5);
            System.out.println(nota);
            
            notas[i] = nota;
        }
        
        for (int i = 0; i < 10; i++) {
            if(notas[i]<7) {
                desaprobados++;
            } else {
                aprobados++;
            }
            
        }
        
        System.out.println("La cantidad de alumnos aprobados es: "+aprobados+".");
        System.out.println("La cantidad de alumnos desaprobados es: "+desaprobados+".");
        
        
        
    }
    
}
