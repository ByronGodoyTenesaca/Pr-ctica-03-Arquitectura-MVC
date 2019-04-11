/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author Usuario
 */
public class Helicoptero extends Aereo{
    
    private int palanca;
    private String tipo;
    private boolean artilleria;
    private int mastil;

    public Helicoptero() {
    }

    public Helicoptero(int palanca, String tipo, boolean artilleria, int mastil) {
        this.palanca = palanca;
        this.tipo = tipo;
        this.artilleria = artilleria;
        this.mastil = mastil;
    }

    public Helicoptero(int palanca, String tipo, boolean artilleria, int mastil, int rotores, int helices, int estabilizadores, boolean presurizacion) {
        super(rotores, helices, estabilizadores, presurizacion);
        this.palanca = palanca;
        this.tipo = tipo;
        this.artilleria = artilleria;
        this.mastil = mastil;
    }

    public Helicoptero(int palanca, String tipo, boolean artilleria, int mastil, int rotores, int helices, int estabilizadores, boolean presurizacion, int llantas, String color) {
        super(rotores, helices, estabilizadores, presurizacion, llantas, color);
        this.palanca = palanca;
        this.tipo = tipo;
        this.artilleria = artilleria;
        this.mastil = mastil;
    }

    public Helicoptero(int palanca, String tipo, boolean artilleria, int mastil, int rotores, int helices, int estabilizadores, boolean presurizacion, int llantas, String color, boolean combustible, double velocidad, String matricula) {
        super(rotores, helices, estabilizadores, presurizacion, llantas, color, combustible, velocidad, matricula);
        this.palanca = palanca;
        this.tipo = tipo;
        this.artilleria = artilleria;
        this.mastil = mastil;
    }

    public int getPalanca() {
        return palanca;
    }

    public void setPalanca(int palanca) {
        this.palanca = palanca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isArtilleria() {
        return artilleria;
    }

    public void setArtilleria(boolean artilleria) {
        this.artilleria = artilleria;
    }

    public int getMastil() {
        return mastil;
    }

    public void setMastil(int mastil) {
        this.mastil = mastil;
    }

    @Override
    public String toString() {
        return "Helicoptero{" + "palanca=" + palanca + ", tipo=" + tipo + ", artilleria=" + artilleria + ", mastil=" + mastil + '}';
    }
    
    
    
    
}
