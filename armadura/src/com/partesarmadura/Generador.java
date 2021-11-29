
package com.partesarmadura;

public abstract class Generador {
    protected long cantEnergia;
    protected int consumo;
    protected boolean daño;

    public Generador() {
    }

    public Generador(long cantEnergia, int consumo, boolean daño) {
        this.cantEnergia = cantEnergia;
        this.consumo = consumo;
        this.daño = daño;
    }

    public boolean isDaño() {
        return daño;
    }

    public void setDaño(boolean daño) {
        this.daño = daño;
    }

    public long getCantEnergia() {
        return cantEnergia;
    }

    public void setCantEnergia(long cantEnergia) {
        this.cantEnergia = cantEnergia;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    
    //Método
    
    public void calibrarConsumo() {
      
    }

    @Override
    public String toString() {
        return "Generador{" + "cantEnergia=" + cantEnergia + ", consumo=" + consumo + ", daño=" + daño + '}';
    }


    
}
