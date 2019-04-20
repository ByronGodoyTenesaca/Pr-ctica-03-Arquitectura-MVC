package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Transporte;

/**
 *
 * @author Usuario
 */
public final class Avion extends Aereo implements Transporte{
    
    private int alas;
    private String distribucion;
    private boolean entretenimiento;
  

    public Avion() {
    }

    public Avion(int alas, String distribucion, boolean entretenimiento) {
        this.alas = alas;
        this.distribucion = distribucion;
        this.entretenimiento = entretenimiento;
       
    }

    public Avion(int alas, String distribucion, boolean entretenimiento, int rotores, int helices, int estabilizadores, boolean presurizacion) {
        super(rotores, helices, estabilizadores, presurizacion);
        this.alas = alas;
        this.distribucion = distribucion;
        this.entretenimiento = entretenimiento;
        
    }

    public Avion(int alas, String distribucion, boolean entretenimiento, int rotores, int helices, int estabilizadores, boolean presurizacion, int llantas, String color, boolean combustible, double velocidad, String matricula, int codigo) {
        super(rotores, helices, estabilizadores, presurizacion, llantas, color, combustible, velocidad, matricula, codigo);
        this.alas = alas;
        this.distribucion = distribucion;
        this.entretenimiento = entretenimiento;
    }

   

    
    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public String getDistribucion() {
        return distribucion;
    }

    public void setDistribucion(String distribucion) {
        this.distribucion = distribucion;
    }

    public boolean isEntretenimiento() {
        return entretenimiento;
    }

    public void setEntretenimiento(boolean entretenimiento) {
        this.entretenimiento = entretenimiento;
    }

    @Override
    public String toString() {
        return "Avion{" + "alas=" + alas + ", distribucion=" + distribucion + ", entretenimiento=" + entretenimiento + '}'+super.toString();
    }
    
    public void elevarse(){
    
        System.out.println("los aviones se elevan");
    } 
    
    public void decender(){
    
        System.out.println("los aviones decienden");
    }
    
    public void descargar(){
    
        System.out.println("los aviones descargan pasajeros ");
    }

    @Override
    public String imprimir() {
       return "la clase avion enviando parametros a la implementacion";
    }

    @Override
    public String modificar() {
       return "la clase avion modificando y mandadno parametros ";
    }

   /* @Override
    public String voladora() {
       return "llamado de la clase avion";
    }*/
}
