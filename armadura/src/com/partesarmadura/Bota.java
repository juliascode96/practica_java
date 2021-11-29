
package com.partesarmadura;

public class Bota extends Generador {

    public Bota() {
    }

    public Bota(long cantEnergia, int consumo, boolean daño) {
        super(cantEnergia, consumo, daño);
    }



    @Override
    public void setConsumo(int consumo) {
        super.setConsumo(consumo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getConsumo() {
        return super.getConsumo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCantEnergia(long cantEnergia) {
        super.setCantEnergia(cantEnergia); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long getCantEnergia() {
        return super.getCantEnergia(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calibrarConsumo() {
        setConsumo(consumo*1);
    }

    @Override
    public String toString() {
        return "Bota{" + '}';
    }
    
    
  
}
