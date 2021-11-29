package ArmaduraService;

import com.partesarmadura.Armadura;

public class JARVIS {

    public long caminar(Armadura a, int tiempo) {
        long consumido =
        (a.getBotaDerecha().getCantEnergia() - (tiempo * a.getBotaDerecha().getConsumo())) +
        (a.getBotaIzquierda().getCantEnergia() - (tiempo * a.getBotaIzquierda().getConsumo()));
        return consumido;
    }

    public long correr(Armadura a, int tiempo) {
        long consumido = 
        ((a.getBotaDerecha().getCantEnergia() - (tiempo * a.getBotaDerecha().getConsumo())) * 2) +
        ((a.getBotaIzquierda().getCantEnergia() - (tiempo * a.getBotaIzquierda().getConsumo())) * 2);
        return consumido;
    }

    public long propulsar(Armadura a, int tiempo) {
        long consumido = 
        ((a.getBotaDerecha().getCantEnergia() - (tiempo * a.getBotaDerecha().getConsumo())) * 3) + 
        ((a.getBotaIzquierda().getCantEnergia() - (tiempo * a.getBotaIzquierda().getConsumo())) * 3);
        return consumido;
    }

    public long volar(Armadura a, int tiempo) {
        long consumido = 
        ((a.getBotaDerecha().getCantEnergia() - (tiempo * a.getBotaDerecha().getConsumo())) * 3) +
        ((a.getBotaIzquierda().getCantEnergia() - (tiempo * a.getBotaIzquierda().getConsumo())) * 3) +
        ((a.getGuanteDerecho().getCantEnergia() - (tiempo * a.getGuanteDerecho().getConsumo())) * 2) +
        ((a.getGuanteIzquierdo().getCantEnergia() - (tiempo * a.getGuanteIzquierdo().getConsumo())) * 2);
        return consumido;
    }

    public long disparo(Armadura a, int tiempo, int g) {
        long consumido;
        switch (g) {
            case 0:
                consumido = ((a.getGuanteDerecho().getCantEnergia() - (tiempo * a.getGuanteDerecho().getConsumo())) * 3);
                break;
            case 1:
                consumido = ((a.getGuanteIzquierdo().getCantEnergia() - (tiempo * a.getGuanteIzquierdo().getConsumo())) * 2);
                break;
            default:
                System.out.println("Usted aún no tiene un tercer brazo...");
                consumido = 0;
                break;
        }

        return consumido;
    }
    
    public int usarCasco(Armadura a) {
      return a.getCasco().getConsumo();
    }
    
    public void mostrarEstado(Armadura a) {
       a.toString();
       a.getCasco().toString();
       a.getBotaDerecha().toString();
       a.getBotaIzquierda().toString();
       a.getGuanteDerecho().toString();
       a.getGuanteIzquierdo().toString();
       a.getGenerador().toString();
    }
    
    public void estadoDeBateria(Armadura a) {
        long total = 9223372036854775807l;
        double porcentaje = (a.getGenerador().getCantEnergia() * 100) / total;
        System.out.println("Batería: " + porcentaje + "%");
    }
    
    public boolean recibiendoDaño(Armadura a) {
       int n = (int) Math.floor(Math.random()*(3-1+1)+1); 
        return n%3 == 0;
    }
    

}
