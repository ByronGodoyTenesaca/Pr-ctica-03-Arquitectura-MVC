/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;
import ec.edu.ups.Controladores.ControladorAvion;
import ec.edu.ups.clases.*;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Vista {
    public static void main(String[] args) {
            Scanner x=new Scanner(System.in);
            ControladorAvion CA=new ControladorAvion();
           
    int sub; 
    boolean prin=true;
        do{
        System.out.print("*************************\n"
                + "*        MENU           *\n"
                + "*1. CRUD Avion          *\n"
                + "*2. CRUD Helicoptero    *\n"
                + "*3. CRUD Auto           *\n"
                + "*4. CRUD Bicicleta      *\n"
                + "*5. Salir               *\n"
                + "*************************\n"
                + "ingrese su opcion:");
        int o=x.nextInt();
        switch(o){
            case 1:
            
                boolean salir = true;
                
                do{
                    subMenu();
                    sub=x.nextInt();
                    
                    switch(sub){
                        case 1:
                            String res,dis,color,mat;
                            int codigo,alas,rotor,eli,est,llanta;
                            double vel;
                            
                            boolean entre=false,pre=false;
                            System.out.print("ingrese el codigo: ");
                            codigo=x.nextInt();
                            System.out.print("ingrese la distribucion: ");
                            dis=x.next();
                            System.out.print("el avion tiene entretenimiento ? ");
                            res=x.next();
                            if (res.equals("si")){
                                entre=true;
                            }
                            System.out.print("cuantas alas tiene el avion: ");
                            alas=x.nextInt();
                            System.out.print("cuantos rotores tiene el avion: ");
                            rotor=x.nextInt();
                            System.out.print("cuantas helices tiene el avion: ");
                            eli=x.nextInt();
                            System.out.print("cuantos estabilizadores tiene el avion: ");
                            est=x.nextInt();
                            System.out.print("el avion tiene presurizacion ? ");
                            res=x.next();
                            if (res.equals("si")){
                                pre=true;
                            }
                            System.out.print("cuantas llantas tiene el avion: ");
                            llanta=x.nextInt();
                            System.out.print("que color es el avion: ");
                            color=x.next();
                            System.out.print("cual es la velocidad a la que va el avion: ");
                            vel=x.nextDouble();
                            System.out.print("cual es la matricula del avion: ");
                            mat=x.next();
                            
                            Avion avion=new Avion(codigo, dis, entre, alas , rotor, eli, est, pre, llanta, color, true, vel, mat);
                            CA.creat(avion);
                            
                            break;
                            
                        case 2:
                            
                            System.out.println("ingrese el codigo a verificar: ");
                            codigo=x.nextInt();
                            System.out.println("datos del avion:\n"+CA.read(codigo));
                            
                            break;
                            
                        case 3:
                            entre=false;
                            pre=false;
                            System.out.print("ingrese el codigo: ");
                            codigo=x.nextInt();
                            System.out.print("ingrese la distribucion: ");
                            dis=x.next();
                            System.out.print("el avion tiene entretenimiento ? ");
                            res=x.next();
                            if (res.equals("si")){
                                entre=true;
                            }
                            System.out.print("cuantas alas tiene el avion: ");
                            alas=x.nextInt();
                            System.out.print("cuantos rotores tiene el avion: ");
                            rotor=x.nextInt();
                            System.out.print("cuantas helices tiene el avion: ");
                            eli=x.nextInt();
                            System.out.print("cuantos estabilizadores tiene el avion: ");
                            est=x.nextInt();
                            System.out.print("el avion tiene presurizacion ? ");
                            res=x.next();
                            if (res.equals("si")){
                                pre=true;
                            }
                            System.out.print("cuantas llantas tiene el avion: ");
                            llanta=x.nextInt();
                            System.out.print("que color es el avion: ");
                            color=x.next();
                            System.out.print("cual es la velocidad a la que va el avion: ");
                            vel=x.nextDouble();
                            System.out.print("cual es la matricula del avion: ");
                            mat=x.next();
                            
                            avion=new Avion(codigo, dis, entre, alas , rotor, eli, est, pre, llanta, color, true, vel, mat);
                            CA.update(avion);
                            break;
                            
                        case 4:
                            System.out.println("ingrese el codigo a verificar: ");
                            codigo=x.nextInt();
                            CA.delete(codigo);
                            break;
                            
                        case 5:
                            salir=false;
                            System.out.println("ADIOS........ :(");
                            break;
                            
                    }
                }while(salir==true);
            
            case 2:
                
                subMenu();
                sub=x.nextInt();
                break;
                
            case 3:
                subMenu();
                sub=x.nextInt();
                break;
                
            case 4:
                subMenu();
                sub=x.nextInt();
                break;
                
            case 5:
                prin=false;
                System.out.println("ADIOS........"
                        + "Apagando.......");
                break;
                
            default:
                System.out.println("Numero Incorecto ingrese desde el 1 al 5");
                        
        }
        
        }while(prin==true);
    }
    
    
    public static void subMenu(){

        System.out.print("**********************\n"
                + "*1. Create           *\n"
                + "*2. Read             *\n"
                + "*3. Update           *\n"
                + "*4. Delete           *\n"
                + "*5. Regresar         *\n"
                + "************************\n"
                + "ingrese su opcion:");
    }
}
