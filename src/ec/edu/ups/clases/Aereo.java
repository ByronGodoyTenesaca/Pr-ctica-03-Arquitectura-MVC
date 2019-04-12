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
public abstract class Aereo extends MedioTransporte {
    
    private int rotores;
    private int helices;
    private int estabilizadores;
    private boolean presurizacion;

    public Aereo() {
    }

    public Aereo(int rotores, int helices, int estabilizadores, boolean presurizacion) {
        this.rotores = rotores;
        this.helices = helices;
        this.estabilizadores = estabilizadores;
        this.presurizacion = presurizacion;
    }

    public Aereo(int rotores, int helices, int estabilizadores, boolean presurizacion, int llantas, String color) {
        super(llantas, color);
        this.rotores = rotores;
        this.helices = helices;
        this.estabilizadores = estabilizadores;
        this.presurizacion = presurizacion;
    }

    public Aereo(int rotores, int helices, int estabilizadores, boolean presurizacion, int llantas, String color, boolean combustible, double velocidad, String matricula) {
        super(llantas, color, combustible, velocidad, matricula);
        this.rotores = rotores;
        this.helices = helices;
        this.estabilizadores = estabilizadores;
        this.presurizacion = presurizacion;
    }

    public int getRotores() {
        return rotores;
    }

    public void setRotores(int rotores) {
        this.rotores = rotores;
    }

    public int getHelices() {
        return helices;
    }

    public void setHelices(int helices) {
        this.helices = helices;
    }

    public int getEstabilizadores() {
        return estabilizadores;
    }

    public void setEstabilizadores(int estabilizadores) {
        this.estabilizadores = estabilizadores;
    }

    public boolean isPresurizacion() {
        return presurizacion;
    }

    public void setPresurizacion(boolean presurizacion) {
        this.presurizacion = presurizacion;
    }

    @Override
    public String toString() {
        return super.toString()+"Aereo{" + "rotores=" + rotores + ", helices=" + helices + ", estabilizadores=" + estabilizadores + ", presurizacion=" + presurizacion + '}';
    }
   
    public void despegar(){
    
        System.out.println("los vehiculos aereos despegan");
    }
    
    public void aterrizar(){
    
        System.out.println("los vehiculos aereos pueden aterrizar");
    }
    
    public void volar(){
    
        System.out.println("los vehiculos llevan un vuelo de crucero ");
    }
    
    public abstract String voladora();
    
}
