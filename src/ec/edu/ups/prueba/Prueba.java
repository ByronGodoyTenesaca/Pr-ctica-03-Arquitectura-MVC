/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

import ec.edu.ups.clases.*;

/**
 *
 * @author Usuario
 */
public class Prueba {
   
    public static void main(String []args){
    
        Helicoptero helicoptero=new Helicoptero(1, "militar", true, 1, 2, 25, 4, false, 3, "verde", true, 500, "avc056");
        Avion avion=new Avion(5, "tres clases", true, 15, 2, 45, 4, true, 10, "blanco", true, 900, "a1r305t");
        Bicicleta bici=new Bicicleta(2, 2, "hierro", true, "impulso", 2, "aliacion", false, 1, "azul", true, 25, "123asd");
        Auto carro=new Auto("hierro", true, true, 4, "motor", 4, "aluminio", true, 45, "rojo", true, 4, "asdc187");
        
        System.out.println(helicoptero);
        System.out.println(avion);
        System.out.println(bici);
        System.out.println(carro);
    }
}
