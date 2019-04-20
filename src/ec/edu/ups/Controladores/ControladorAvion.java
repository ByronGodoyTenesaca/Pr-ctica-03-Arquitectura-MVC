/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Controladores;

import ec.edu.ups.clases.Avion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorAvion {
    
    private List<Avion> lista;

    public ControladorAvion() {
        lista=new ArrayList<>();
    }
    
    public void creat(Avion avion){
    
        lista.add(avion);
    }
    
    public Avion read(int codigo){
    
        for (Avion avion : lista) {
            if (avion.getCodigo()==codigo){
            return avion;
            }
        }
        return null;
    }

    public void update(Avion avion){

        for (int i = 0; i < lista.size(); i++) {
            Avion elemento=lista.get(i);
            if(elemento.getCodigo()==avion.getCodigo()){
            
                lista.set(i, avion);
                break;
            }
        }
    }
    
    
    public void delete(int codigo){
    
        for (int i = 0; i < lista.size(); i++) {
            Avion elemento = lista.get(i);
            
            if(elemento.getCodigo()==codigo){
            
                lista.remove(i);
                break;
            }
        }
    }
    
}
