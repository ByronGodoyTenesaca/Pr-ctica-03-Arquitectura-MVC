package ec.edu.ups.Controladores;

import ec.edu.ups.clases.Bicicleta;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Usuario
 */
public class ControladorBicicleta {
  
    private Map<Integer,Bicicleta> mapa;
    private int codigo;

    public ControladorBicicleta() {
    
        codigo=0;
        mapa=new HashMap<>();
    }
    
    
    public void Creat(Bicicleta bici){
    
        codigo++;
        bici.setCodigo(codigo);
        mapa.put(codigo, bici);
        
    }
    
    public Bicicleta read(int codigo){
    
        for (Entry<Integer, Bicicleta> bici : mapa.entrySet()) {
            
            if (bici.getKey()==codigo){
            
                System.out.println(bici);
            }
        }
        return null;
    }
    
    public void update(Bicicleta bici,int codigo){
    
        if (mapa.containsKey(codigo)){
        
            mapa.remove(codigo,bici);
            mapa.put(codigo, bici);
        }
    
    }
    
    public void delete(int codigo){
    
         for (Entry<Integer, Bicicleta> bici : mapa.entrySet()) {
            
            if (bici.getKey()==codigo){
            
               mapa.remove(codigo);
               break;
            }
        }
    }
    
    public void leerTodo(){
    
        for (Entry<Integer, Bicicleta> bici : mapa.entrySet()) {
           
            System.out.println("codigo: "+bici.getKey()+" ==>  Informacion: "+bici.getValue());
        }
        
    }
    
}
