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
public class MedioTransporte {
    
    private int llantas;
    private String color;
    private boolean combustible;
    private double velocidad;
    private String matricula;

    public MedioTransporte() {
    }

    public MedioTransporte(int llantas, String color) {
        this.llantas = llantas;
        this.color = color;
    }

    public MedioTransporte(int llantas, String color, boolean combustible, double velocidad, String matricula) {
        this.llantas = llantas;
        this.color = color;
        this.combustible = combustible;
        this.velocidad = velocidad;
        this.matricula = matricula;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCombustible() {
        return combustible;
    }

    public void setCombustible(boolean combustible) {
        this.combustible = combustible;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "\nMedioTransporte{" + "llantas=" + llantas + ", color=" + color + ", combustible=" + combustible + ", velocidad=" + velocidad + ", matricula=" + matricula + '}';
    }
    
    
   public void llantas(){
   
       System.out.println("este metodo imprime la cantidad de llantas que poseen");
   }
   
   public void velocidad(){
   
       System.out.println("este metodo imprime la velocidad que pueden alcanzar los medios de transporte");
   }
   
   public void matricula(){
   
       System.out.println("metodo que imprime los numeros de matricula que poseen");
   }
    
}
