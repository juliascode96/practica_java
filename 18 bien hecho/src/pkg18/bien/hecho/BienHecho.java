
package pkg18.bien.hecho;

public class BienHecho {

    public static void main(String[] args) {
        for(int i=0; i<= 9; i++){
            for(int j=0; j<= 9; j++){
                for(int k=0; k<= 9; k++){ 
                    String num1 = Integer.toString(i);
                    String num2 = Integer.toString(j);
                    String num3 = Integer.toString(k);
                    if (num1.equals("3")){
                     num1 = "E";
                    }
                    if (num2.equals("3")){
                       num2 = "E"; 
                    }
                    if (num3.equals("3")){
                        num3 = "E";
                    }
                    
                    System.out.println(num1 + " - " + num2 + " - " + num3);
                }
            }   
        }
    }
    }
    

