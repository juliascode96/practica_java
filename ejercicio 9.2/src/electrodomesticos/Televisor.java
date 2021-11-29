
package electrodomesticos;
import java.util.Scanner;
public class Televisor extends Electrodomestico{
  private Integer resolucion;
  private Boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean sintonizador) {
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Televisor(Integer resolucion, Boolean sintonizador, Double precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

  @Override
    public Double getPrecio() {
        return precio;
    }

  @Override
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

  @Override
    public String getColor() {
        return color;
    }

  @Override
    public void setColor(String color) {
        this.color = color;
    }

  @Override
    public char getConsumo() {
        return consumo;
    }

  @Override
    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

  @Override
    public Double getPeso() {
        return peso;
    }

  @Override
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    //Metodos
    
     @Override
    public void crearElectrodomestico() {
        Scanner read = new Scanner(System.in);
        super.crearElectrodomestico();
         System.out.println("Ingrese resolución del televisor");
         Integer res = read.nextInt();
         this.resolucion = res;
         System.out.println("Ingrese si el televisor tiene sintetizador");
         String r = read.next();
         this.sintonizador = r.equalsIgnoreCase("si");
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        
        if(sintonizador) {
            this.precio = this.precio + 500;
        }
        
        if (this.resolucion>40) {
          this.precio = this.precio + (this.precio*0.3);
        }
        
    }
    
    

   
  
    
  
    
}
