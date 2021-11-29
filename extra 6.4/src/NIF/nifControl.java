
package NIF;

public class nifControl {
    public NIF crearNif(long DNI) {
        NIF nif = new NIF();
        
        nif.setDNI(DNI);
        int digitoVerificador = (int) DNI%23;
        String[] letras = new String[] {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        for (int i = 0; i < 23; i++) {
            if (i == digitoVerificador) {
                nif.setNIF(letras[i]);   
            }
 
            
        }
        
        
        return nif;
    }
    
    public void mostrar(NIF nif){
        System.out.println(nif.getDNI() + "-" + nif.getNIF());
        
    }
    
}
