
package com.partesarmadura;

public class Armadura {
    private String colorPrimario;
    private String colorSecundario;
    private int salud;
    private int dureza;
    private Generador generador;
    private Bota botaIzquierda;
    private Bota botaDerecha;
    private Guante guanteIzquierdo;
    private Guante guanteDerecho;
    private Casco casco;
    
    

    public Armadura() {
    }

    public Armadura(String colorPrimario, String colorSecundario, int salud, int dureza, Generador generador, Bota botaIzquiera, Bota botaDerecha, Guante guanteIzquierdo, Guante guanteDerecho, Casco casco) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.salud = salud;
        this.dureza = dureza;
        this.generador = generador;
        this.botaIzquierda = botaIzquiera;
        this.botaDerecha = botaDerecha;
        this.guanteIzquierdo = guanteIzquierdo;
        this.guanteDerecho = guanteDerecho;
        this.casco = casco;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    public Generador getGenerador() {
        return generador;
    }

    public void setGenerador(Generador generador) {
        this.generador = generador;
    }

    public Bota getBotaIzquierda() {
        return botaIzquierda;
    }

    public void setBotaIzquierda(Bota botaIzquiera) {
        this.botaIzquierda = botaIzquiera;
    }

    public Bota getBotaDerecha() {
        return botaDerecha;
    }

    public void setBotaDerecha(Bota botaDerecha) {
        this.botaDerecha = botaDerecha;
    }

    public Guante getGuanteIzquierdo() {
        return guanteIzquierdo;
    }

    public void setGuanteIzquierdo(Guante guanteIzquierdo) {
        this.guanteIzquierdo = guanteIzquierdo;
    }

    public Guante getGuanteDerecho() {
        return guanteDerecho;
    }

    public void setGuanteDerecho(Guante guanteDerecho) {
        this.guanteDerecho = guanteDerecho;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }

    @Override
    public String toString() {
        return "Armadura{" + "colorPrimario=" + colorPrimario + ", colorSecundario=" + colorSecundario + ", salud=" + salud + ", dureza=" + dureza + ", generador=" + generador + ", botaIzquierda=" + botaIzquierda + ", botaDerecha=" + botaDerecha + ", guanteIzquierdo=" + guanteIzquierdo + ", guanteDerecho=" + guanteDerecho + ", casco=" + casco + '}';
    }
    
    
    
    

}
