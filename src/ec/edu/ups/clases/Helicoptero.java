package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Transporte;

/**
 *
 * @author Usuario
 */
public final class Helicoptero extends Aereo implements Transporte{
    
    private int codigo;
    private String tipo;
    private boolean artilleria;
    private int mastil;

    public Helicoptero() {
    }

    public Helicoptero(int codigo, String tipo, boolean artilleria, int mastil) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.artilleria = artilleria;
        this.mastil = mastil;
    }

    public Helicoptero(int codigo, String tipo, boolean artilleria, int mastil, int rotores, int helices, int estabilizadores, boolean presurizacion) {
        super(rotores, helices, estabilizadores, presurizacion);
        this.codigo = codigo;
        this.tipo = tipo;
        this.artilleria = artilleria;
        this.mastil = mastil;
    }

    public Helicoptero(int codigo, String tipo, boolean artilleria, int mastil, int rotores, int helices, int estabilizadores, boolean presurizacion, int llantas, String color) {
        super(rotores, helices, estabilizadores, presurizacion, llantas, color);
        this.codigo = codigo;
        this.tipo = tipo;
        this.artilleria = artilleria;
        this.mastil = mastil;
    }

    public Helicoptero(int codigo, String tipo, boolean artilleria, int mastil, int rotores, int helices, int estabilizadores, boolean presurizacion, int llantas, String color, boolean combustible, double velocidad, String matricula) {
        super(rotores, helices, estabilizadores, presurizacion, llantas, color, combustible, velocidad, matricula);
        this.codigo=codigo;
        this.tipo = tipo;
        this.artilleria = artilleria;
        this.mastil = mastil;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setcodigo(int codigo) {
        this.codigo = codigo;
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
        return super.toString()+"Helicoptero{" + "codigo=" + codigo + ", tipo=" + tipo + ", artilleria=" + artilleria + ", mastil=" + mastil + '}';
    }
    
    public void encender(){
    
        System.out.println("los helicoteros se encienden");
    } 
    
    public void arreglar(){
    
        System.out.println("los helicopteros e arreglan ¿");
    }
    
    public void cargar(){
    
        System.out.println("el helicoptero carga los materiales");
    }

    @Override
    public String imprimir() {
       return "este entra al metodo imprimir clase Helicotero";
    }

    @Override
    public String modificar() {
        return "se puede modificar desde aqui clase Helicoptero";
    }

    /*@Override
    public String voladora() {
        return "llamado de la clase helicoptero";
    }*/
   
    
    
}
