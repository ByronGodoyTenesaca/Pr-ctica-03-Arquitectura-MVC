package ec.edu.ups.clases;

/**
 *
 * @Byron Godoy
 */
public class MedioTransporte implements Comparable<MedioTransporte>{
    
    private int llantas;
    private String color;
    private boolean combustible;
    private double velocidad;
    private String matricula;
    private int codigo;

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

    public MedioTransporte(int llantas, String color, boolean combustible, double velocidad, String matricula, int codigo) {
        this.llantas = llantas;
        this.color = color;
        this.combustible = combustible;
        this.velocidad = velocidad;
        this.matricula = matricula;
        this.codigo = codigo;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "MedioTransporte{" + "llantas=" + llantas + ", color=" + color + ", combustible=" + combustible + ", velocidad=" + velocidad + ", matricula=" + matricula + ", codigo=" + codigo + '}';
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

   
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MedioTransporte other = (MedioTransporte) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(MedioTransporte o) {
        if (matricula.compareTo(o.getMatricula())>=1){
        
            return 1;
        }else if(matricula.compareTo(o.getMatricula())<=1){
            return -1;
        }else {
        
            return 0;
        }
           
    }
    
   
   
}
