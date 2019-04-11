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
public class Auto extends Terrestre{
    
    private String materialparachoques;
    private boolean capo;
    private boolean maletero;
    private int tapacubos;

    public Auto() {
    }

    public Auto(String materialparachoques, boolean capo, boolean maletero, int tapacubos) {
        this.materialparachoques = materialparachoques;
        this.capo = capo;
        this.maletero = maletero;
        this.tapacubos = tapacubos;
    }

    public Auto(String materialparachoques, boolean capo, boolean maletero, int tapacubos, String mediopropulsion, int aro, String material, boolean motorizado) {
        super(mediopropulsion, aro, material, motorizado);
        this.materialparachoques = materialparachoques;
        this.capo = capo;
        this.maletero = maletero;
        this.tapacubos = tapacubos;
    }

    public Auto(String materialparachoques, boolean capo, boolean maletero, int tapacubos, String mediopropulsion, int aro, String material, boolean motorizado, int llantas, String color) {
        super(mediopropulsion, aro, material, motorizado, llantas, color);
        this.materialparachoques = materialparachoques;
        this.capo = capo;
        this.maletero = maletero;
        this.tapacubos = tapacubos;
    }

    public Auto(String materialparachoques, boolean capo, boolean maletero, int tapacubos, String mediopropulsion, int aro, String material, boolean motorizado, int llantas, String color, boolean combustible, double velocidad, String matricula) {
        super(mediopropulsion, aro, material, motorizado, llantas, color, combustible, velocidad, matricula);
        this.materialparachoques = materialparachoques;
        this.capo = capo;
        this.maletero = maletero;
        this.tapacubos = tapacubos;
    }

    public String getMaterialparachoques() {
        return materialparachoques;
    }

    public void setMaterialparachoques(String materialparachoques) {
        this.materialparachoques = materialparachoques;
    }

    public boolean isCapo() {
        return capo;
    }

    public void setCapo(boolean capo) {
        this.capo = capo;
    }

    public boolean isMaletero() {
        return maletero;
    }

    public void setMaletero(boolean maletero) {
        this.maletero = maletero;
    }

    public int getTapacubos() {
        return tapacubos;
    }

    public void setTapacubos(int tapacubos) {
        this.tapacubos = tapacubos;
    }

    @Override
    public String toString() {
        return "Auto{" + "materialparachoques=" + materialparachoques + ", capo=" + capo + ", maletero=" + maletero + ", tapacubos=" + tapacubos + '}';
    }
    
    public void dañado(){
    
        System.out.println("los autos se dañan");
    } 
    
    public void tuniado(){
    
        System.out.println("los autos estan modificados");
    }
    
    public void rapido(){
    
        System.out.println("los autos corren rapido");
    }
}
