
package com.partesarmadura;


public class Casco  extends Generador {
    private String sintetizador;
    private String consola;

    public Casco() {
    }

    public Casco(String sintetizador, String consola) {
        this.sintetizador = sintetizador;
        this.consola = consola;
    }

    public Casco(String sintetizador, String consola, long cantEnergia, int consumo, boolean daño) {
        super(cantEnergia, consumo, daño);
        this.sintetizador = sintetizador;
        this.consola = consola;
    }



    public String getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(String sintetizador) {
        this.sintetizador = sintetizador;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
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
        setConsumo(consumo*3);
    }

    @Override
    public String toString() {
        return "Casco{" + "sintetizador=" + sintetizador + ", consola=" + consola + '}';
    }
    
    
    
    
}
