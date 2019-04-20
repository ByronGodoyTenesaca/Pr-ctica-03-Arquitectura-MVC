
package ec.edu.ups.Controladores;

import ec.edu.ups.clases.Auto;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class ControladorAuto {
 
    private SortedSet<Auto> listaOrdenada;
    private int codigo;

    public ControladorAuto() {
    
        listaOrdenada=new TreeSet<>();
        codigo =1;
    }
    
    
    public void cread(Auto auto){
    
        codigo++;
        auto.setCodigo(codigo);
        listaOrdenada.add(auto);
        
    }
    
    public Auto read(int codigo){
    
        for (Auto auto : listaOrdenada) {
            
            if (auto.getCodigo()==codigo){
            
                return auto;
               
            }
        }
        return null;
    }
    
    public void update(Auto auto){
    
        if(listaOrdenada.contains(auto)){
        
            listaOrdenada.remove(auto);
            listaOrdenada.add(auto);
        }
    }
    
    public void delete(int codigo){
    
        for (Auto auto : listaOrdenada) {
            if (auto.getCodigo()==codigo){
            
                listaOrdenada.remove(auto);
                break;
            }
        }
    }
    
    public void impTodo(){
    
        System.out.println("imprimiendo en orden de matricula");
        for (Auto auto : listaOrdenada) {
            System.out.println(auto);
        }
    
    }
    
}
