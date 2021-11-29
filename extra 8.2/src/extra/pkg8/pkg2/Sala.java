package extra.pkg8.pkg2;

import java.util.ArrayList;
import java.util.Arrays;

public class Sala {

    private String[][] asientos;
    private ArrayList<Cliente> espectadores;

    public Sala() {
        asientos = new String[8][6];  
    }

    public String[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(String[][] asientos) {
        this.asientos = asientos;
    }

    public ArrayList<Cliente> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Cliente> espectadores) {
        this.espectadores = espectadores;
    }

    @Override
    public String toString() {
        return "Sala{" + "asientos=" + Arrays.toString(asientos) + ", espectadores=" + espectadores + '}';
    }

    //Metodos
    public Sala llenarSala(Sala s, ArrayList<Cliente> clientes) {
        String [][] disposicion = {
            { "1A", "1B", "1C", "1D", "1E", "1F" },
            { "2A", "2B", "2C", "2D", "2E", "2F" }, 
            { "3A", "3B", "3C", "3D", "3E", "3F" }, 
            { "4A", "4B", "4C", "4D", "4E", "4F" }, 
            { "5A", "5B", "5C", "5D", "5E", "5F" }, 
            { "6A", "6B", "6C", "6D", "6E", "6F" }, 
            { "7A", "7B", "7C", "7D", "7E", "7F" },
            { "8A", "8B", "8C", "8D", "8E", "8F" }
        };
        
        System.arraycopy(disposicion, 0, s.getAsientos(), 0, s.getAsientos().length);
        int cont = 0;
        for (Cliente c : clientes) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 6; j++) {
                    if (c.getAsientoAsignado().equalsIgnoreCase(s.getAsientos()[i][j])) {
                       s.getAsientos()[i][j] = "X"; 
                    } else if (s.getAsientos()[i][j].equalsIgnoreCase("X")){
                        cont++;
                    }
  
                }
 
            }
            
        }
        if (cont>0) {
           System.out.println("Asiento ya ocupado"); 
        }
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("{"+ s.getAsientos()[i][j] +"}");
            }
            System.out.println("");
        }
        
        return s;
        
    }

}
