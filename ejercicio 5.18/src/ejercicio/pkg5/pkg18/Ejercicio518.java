
package ejercicio.pkg5.pkg18;


public class Ejercicio518 {

  
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
for (int i = 0; i < 999; ++i) {
        num3++;
    
    if (num3>9) {
        num3 = 0;
        num2++;
    } 
    
    if (num2>9) {
        num3 = 0;
        num2 = 0;
        num1++;
    }
    
    if (num1 != 3 && num2 != 3 && num3 != 3) {
        System.out.println(num1 + " - " + num2 + " - " + num3);
            
            }
        }
    
    }
}
