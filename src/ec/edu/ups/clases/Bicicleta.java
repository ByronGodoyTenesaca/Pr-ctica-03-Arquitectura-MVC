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
public class Bicicleta extends Terrestre{
    
    private int pedales;
    private int montura;
    private String materialcuadro;
    private boolean horquilla;

    public Bicicleta() {
    }

    public Bicicleta(int pedales, int montura, String materialcuadro, boolean horquilla) {
        this.pedales = pedales;
        this.montura = montura;
        this.materialcuadro = materialcuadro;
        this.horquilla = horquilla;
    }

    public Bicicleta(int pedales, int montura, String materialcuadro, boolean horquilla, String mediopropulsion, int aro, String material, boolean motorizado) {
        super(mediopropulsion, aro, material, motorizado);
        this.pedales = pedales;
        this.montura = montura;
        this.materialcuadro = materialcuadro;
        this.horquilla = horquilla;
    }

    public Bicicleta(int pedales, int montura, String materialcuadro, boolean horquilla, String mediopropulsion, int aro, String material, boolean motorizado, int llantas, String color) {
        super(mediopropulsion, aro, material, motorizado, llantas, color);
        this.pedales = pedales;
        this.montura = montura;
        this.materialcuadro = materialcuadro;
        this.horquilla = horquilla;
    }

    public Bicicleta(int pedales, int montura, String materialcuadro, boolean horquilla, String mediopropulsion, int aro, String material, boolean motorizado, int llantas, String color, boolean combustible, double velocidad, String matricula) {
        super(mediopropulsion, aro, material, motorizado, llantas, color, combustible, velocidad, matricula);
        this.pedales = pedales;
        this.montura = montura;
        this.materialcuadro = materialcuadro;
        this.horquilla = horquilla;
    }

    public int getPedales() {
        return pedales;
    }

    public void setPedales(int pedales) {
        this.pedales = pedales;
    }

    public int getMontura() {
        return montura;
    }

    public void setMontura(int montura) {
        this.montura = montura;
    }

    public String getMaterialcuadro() {
        return materialcuadro;
    }

    public void setMaterialcuadro(String materialcuadro) {
        this.materialcuadro = materialcuadro;
    }

    public boolean isHorquilla() {
        return horquilla;
    }

    public void setHorquilla(boolean horquilla) {
        this.horquilla = horquilla;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "pedales=" + pedales + ", montura=" + montura + ", materialcuadro=" + materialcuadro + ", horquilla=" + horquilla + '}';
    }
    
    
}
