
package ec.edu.ups.prueba;

import ec.edu.ups.clases.*;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


/**
 *
 * @author Usuario
 */
public class Prueba {
    
    public static void main(String[] args) {
        Avion avion1=new Avion();
        avion1.setCodigo(2);
        avion1.setMatricula("323abc");
        
        Avion avion2=new Avion();
        avion2.setCodigo(1);
        avion2.setMatricula("123abc");
        
        Avion avion3=new Avion();
        avion3.setCodigo(4);
        avion3.setMatricula("223abc");
        
        Helicoptero heli=new Helicoptero();
        heli.setCodigo(3);
        heli.setMatricula("sad256");
        
        
        if (avion1.equals(avion2)){
            System.out.println("son iguales");
        }else{
            System.out.println("no son iguales");
        }
        
        if(avion1.equals(heli)){
        
            System.out.println("son iguales");
        }else{
        
            System.out.println("no son iguales");
        }
        
        
        Set<Avion> lista=new HashSet<>();
        
        lista.add(avion1);
        lista.add(avion2);
        lista.add(avion3);
        
        for (Avion avion : lista) {
            System.out.println(avion.getMatricula());
        }
        
        if (lista.contains(avion2)){
            System.out.println("si existe");
        }
        
        /*SortedSet<Avion> listaOrdenada=new TreeSet<>();// ordena las listas 
        listaOrdenada.add(avion3);
        listaOrdenada.add(avion1);
        listaOrdenada.add(avion2);
        
        System.out.println("lista ordenada");
        for (Avion avion : listaOrdenada) {
            System.out.println(avion.getMatricula());
        }*/
    }
}
