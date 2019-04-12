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
public abstract class Terrestre extends MedioTransporte{
    
    private String mediopropulsion;
    private int aro;
    private String material;
    private boolean motorizado;

    public Terrestre() {
    }

    public Terrestre(String mediopropulsion, int aro, String material, boolean motorizado) {
        this.mediopropulsion = mediopropulsion;
        this.aro = aro;
        this.material = material;
        this.motorizado = motorizado;
    }

    public Terrestre(String mediopropulsion, int aro, String material, boolean motorizado, int llantas, String color) {
        super(llantas, color);
        this.mediopropulsion = mediopropulsion;
        this.aro = aro;
        this.material = material;
        this.motorizado = motorizado;
    }

    public Terrestre(String mediopropulsion, int aro, String material, boolean motorizado, int llantas, String color, boolean combustible, double velocidad, String matricula) {
        super(llantas, color, combustible, velocidad, matricula);
        this.mediopropulsion = mediopropulsion;
        this.aro = aro;
        this.material = material;
        this.motorizado = motorizado;
    }

    public String getMediopropulsion() {
        return mediopropulsion;
    }

    public void setMediopropulsion(String mediopropulsion) {
        this.mediopropulsion = mediopropulsion;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isMotorizado() {
        return motorizado;
    }

    public void setMotorizado(boolean motorizado) {
        this.motorizado = motorizado;
    }

    @Override
    public String toString() {
        return super.toString()+"Terrestre{" + "mediopropulsion=" + mediopropulsion + ", aro=" + aro + ", material=" + material + ", motorizado=" + motorizado + '}';
    }
    
    public void acelerar(){
    
        System.out.println("los vehiculos terrrestres aceleran");
    }
    
    public void frenar(){
    
        System.out.println("los vehiculos frenan al atravezarse algo");
    }
    
    public void detenerse(){
    
        System.out.println("los vehiculos pueden detenerse en cualquier momen");
    }
    
    public abstract String llamado();

}
