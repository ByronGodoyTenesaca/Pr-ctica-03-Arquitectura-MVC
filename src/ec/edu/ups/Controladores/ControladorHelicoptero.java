package ec.edu.ups.Controladores;

import ec.edu.ups.clases.Helicoptero;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class ControladorHelicoptero {
 
    private Set<Helicoptero> lista;
    int codigo;

    public ControladorHelicoptero() {
    
        lista=new HashSet<>();
        codigo=0;
    }
    
    public void cread(Helicoptero helicoptero){
    
        codigo++;
        helicoptero.setCodigo(codigo);
        lista.add(helicoptero);
    }
    
    public Helicoptero read(int codigo){
    
        for (Helicoptero helicoptero : lista) {
            if (helicoptero.getCodigo()==codigo){
            
                return helicoptero;
            }
        }
        return null;
    }
    
    public void update(Helicoptero helicoptero){
    
        if (lista.contains(helicoptero)){
        
            lista.remove(helicoptero);
            lista.add(helicoptero);
        }
    }
    
    public void remove(int codigo){
    
        for (Helicoptero helicoptero : lista) {
            
            if (helicoptero.getCodigo()==codigo){
            
                lista.remove(helicoptero);
                break;
            }
        }
    }
    
}
