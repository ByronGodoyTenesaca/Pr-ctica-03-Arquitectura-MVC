/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;
import ec.edu.ups.Controladores.*;
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
            ControladorHelicoptero CH= new ControladorHelicoptero();
            ControladorAuto Ca=new ControladorAuto();
            ControladorBicicleta Cb=new ControladorBicicleta();
           
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
                            
                            
                            Avion avion=new Avion(alas, dis, entre, rotor, eli, est, pre, llanta, color, true, vel, mat, codigo);
                            
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
                            
                            avion=new Avion(alas, dis, entre, rotor, eli, est, pre, llanta, color, true, vel, mat, codigo);
                            CA.update(avion);
                            break;
                            
                        case 4:
                            System.out.println("ingrese el codigo a eliminar: ");
                            codigo=x.nextInt();
                            CA.delete(codigo);
                            break;
                            
                        case 5:
                            salir=false;
                            System.out.println("ADIOS........ :(");
                            break;
                            
                    }
                }while(salir==true);
            
           
                break;
            
            
                
                
            case 2:
               salir=true;
                do{
                subMenu();
                sub=x.nextInt();
                
                switch(sub){
                        case 1:
                            String res,tipo,color,mat;
                            int codigo,mastil,rotor,eli,est,llanta;
                            double vel;
                            
                            boolean entre=false,pre=false,arti=false;
             
                            System.out.print("Que tipo de Helicoptero es: ");
                            tipo=x.next();
                            System.out.print("el Helicoptero usa combustible: ");
                            res=x.next();
                            if (res.equals("si")){
                                entre=true;
                            }
                            System.out.print("cuantos mastiles tiene el Helicoptero ");
                            mastil=x.nextInt();
                            System.out.print("cuantos rotores tiene el Helicoptero: ");
                            rotor=x.nextInt();
                            System.out.print("cuantas helices tiene el Helicoptero: ");
                            eli=x.nextInt();
                            System.out.print("cuantos estabilizadores tiene el Helicoptero: ");
                            est=x.nextInt();
                            System.out.print("el Helicoptero tiene presurizacion ? ");
                            res=x.next();
                            if (res.equals("si")){
                                pre=true;
                            }
                            System.out.print("el Helicoptero es de artilleria ");
                            res=x.next();
                            if (res.equals("si")){
                                arti=true;
                            }
                            System.out.print("cuantas llantas tiene el Helicoptero: ");
                            llanta=x.nextInt();
                            System.out.print("que color es el Helicoptero: ");
                            color=x.next();
                            System.out.print("cual es la velocidad a la que va el Helicoptero: ");
                            vel=x.nextDouble();
                            System.out.print("cual es la matricula del Helicoptero: ");
                            mat=x.next();
                            
                           
                            Helicoptero heli=new Helicoptero(tipo, arti, mastil, rotor, eli, est, pre, llanta, color, entre, vel, mat);
                            
                            CH.cread(heli);
                            
                            break;
                            
                        case 2:
                            
                            System.out.println("ingrese el codigo a verificar: ");
                            codigo=x.nextInt();
                            System.out.println("datos del Helicoptero:\n"+CH.read(codigo));
                            
                            break;
                            
                        case 3:
                            
                            arti=false; pre=false; entre=false;
                           System.out.print("Que tipo de Helicoptero es: ");
                            tipo=x.next();
                            System.out.print("el Helicoptero usa combustible: ");
                            res=x.next();
                            if (res.equals("si")){
                                entre=true;
                            }
                            System.out.print("cuantos mastiles tiene el Helicoptero ");
                            mastil=x.nextInt();
                            System.out.print("cuantos rotores tiene el Helicoptero: ");
                            rotor=x.nextInt();
                            System.out.print("cuantas helices tiene el Helicoptero: ");
                            eli=x.nextInt();
                            System.out.print("cuantos estabilizadores tiene el Helicoptero: ");
                            est=x.nextInt();
                            System.out.print("el Helicoptero tiene presurizacion ? ");
                            res=x.next();
                            if (res.equals("si")){
                                pre=true;
                            }
                            System.out.print("el Helicoptero es de artilleria ");
                            res=x.next();
                            if (res.equals("si")){
                                arti=true;
                            }
                            System.out.print("cuantas llantas tiene el Helicoptero: ");
                            llanta=x.nextInt();
                            System.out.print("que color es el Helicoptero: ");
                            color=x.next();
                            System.out.print("cual es la velocidad a la que va el Helicoptero: ");
                            vel=x.nextDouble();
                            System.out.print("cual es la matricula del Helicoptero: ");
                            mat=x.next();
                            
                           
                            heli=new Helicoptero(tipo, arti, mastil, rotor, eli, est, pre, llanta, color, entre, vel, mat);
                            CH.update(heli);
                            break;
                            
                        case 4:
                            System.out.println("ingrese el codigo a eliminar: ");
                            codigo=x.nextInt();
                            CA.delete(codigo);
                            break;
                            
                        case 5:
                            salir=false;
                            System.out.println("ADIOS........ :(");
                            break;
                            
                    }
                }while(salir==true);
                
                break;
                
                
                
            case 3:
                salir =true;
                do{
                subMenu1();
                sub=x.nextInt();
                
                switch(sub){
                
                    case 1: 
                        String parachoques,propulsion,material,color,matricula;
                        boolean capo=false,maletero=false,motorizado=false,combustible=false;
                        int tapacubos,aro,llanta;
                        System.out.print("De que matrial es el parachoques");
                        parachoques=x.next();
                        System.out.print("El auto esta con el capon: ");
                        String res=x.next();
                        if(res.equals("si")){
                        capo=true;
                        }
                        System.out.print("El auto tiene maletero: ");
                        res=x.next();
                        if(res.equals("si")){
                        maletero=true;
                        }
                        System.out.print("cuantos tapacubos tiene el auto: ");
                        tapacubos=x.nextInt();
                        System.out.print("cual es el medio de propulsion: ");
                        propulsion=x.next();
                        System.out.print("cuantos aros tiene el auto: ");
                        aro=x.nextInt();
                        System.out.print("De que material esta echo el auto: ");
                        material=x.next();
                        System.out.print("El auto es motorizado: ");
                        res=x.next();
                        if(res.equals("si")){
                        motorizado=true;
                        }
                        System.out.print("cuantas llantas tiene el auto: ");
                        llanta=x.nextInt();
                        System.out.print("de que color es el auto: ");
                        color=x.next();
                        System.out.print("el auto es a combustible: ");
                        res=x.next();
                        if(res.equals("si")){
                        combustible=true;
                        }
                        System.out.print("A que velocidad va el auto: ");
                        double velo=x.nextDouble();
                        System.out.print("Cual es la matricula del auto: ");
                        matricula=x.next();
                        
                        Auto auto=new Auto(parachoques, capo, maletero, tapacubos, propulsion, aro, material, motorizado, llanta, color, combustible, velo, matricula);
                        Ca.cread(auto);
                        break;
                        
                    case 2:
                        System.out.println("ingrese el codigo a verificar: ");
                            int codigo=x.nextInt();
                            System.out.println("datos del Auto:\n"+CH.read(codigo));
                            break;
                            
                    case 3:
                        capo=false; maletero=false; motorizado=false; combustible=false;
                        System.out.print("De que matrial es el parachoques: ");
                        parachoques=x.next();
                        System.out.print("El auto esta con el capon: ");
                        res=x.next();
                        if(res.equals("si")){
                        capo=true;
                        }
                        System.out.print("El auto tiene maletero: ");
                        res=x.next();
                        if(res.equals("si")){
                        maletero=true;
                        }
                        System.out.print("cuantos tapacubos tiene el auto: ");
                        tapacubos=x.nextInt();
                        System.out.print("cual es el medio de propulsion: ");
                        propulsion=x.next();
                        System.out.print("cuantos aros tiene el auto: ");
                        aro=x.nextInt();
                        System.out.print("De que material esta echo el auto: ");
                        material=x.next();
                        System.out.print("El auto es motorizado: ");
                        res=x.next();
                        if(res.equals("si")){
                        motorizado=true;
                        }
                        System.out.print("cuantas llantas tiene el auto: ");
                        llanta=x.nextInt();
                        System.out.print("de que color es el auto: ");
                        color=x.next();
                        System.out.print("el auto es a combustible: ");
                        res=x.next();
                        if(res.equals("si")){
                        combustible=true;
                        }
                        System.out.print("A que velocidad va el auto: ");
                        velo=x.nextDouble();
                        System.out.print("Cual es la matricula del auto: ");
                        matricula=x.next();
                        System.out.println("Cual es el codigo del auto");
                        codigo=x.nextInt();
                        auto=new Auto(parachoques, capo, maletero, tapacubos, propulsion, aro, material, motorizado, llanta, color, combustible, velo, matricula, codigo);
                        Ca.update(auto);
                        break;
                        
                    case 4:
                        System.out.println("ingrese el codigo a eliminar: ");
                            codigo=x.nextInt();
                            Ca.delete(codigo);
                            break;
                          
                    case 5:
                        System.out.println("lista de datos ingresados: ");
                        Ca.impTodo();
                        break;
                        
                    case 6:
                        salir = false;
                        System.out.println("ADIOS...... :(");
                        
                }  
                   
                }while(salir !=false);
                
                break;
                
            case 4:
                salir=true;
                do{
                subMenu1();
                sub=x.nextInt();
                
                switch(sub){
                
                    case 1:
                        int pedales,montura,aro,llantas;
                        String materia,propulsion,material,color,matricula;
                        boolean hor=false,motorizado=false,combustible=false;
                        
                        System.out.print("cuantos pedales tiene la bici: ");
                        pedales=x.nextInt();
                        System.out.print("cuantas monturas tiene: ");
                        montura=x.nextInt();
                        System.out.print("de que material esta echo el marco: ");
                        materia=x.next();
                        System.out.print("la bicicleta tiene orquilla");
                        String res=x.next();
                        res=x.next();
                        if(res.equals("si")){
                        hor=true;
                        }
                        System.out.print("cual es medio de propulsion: ");
                        propulsion=x.next();
                        System.out.print("cuantos aros tiene la biicleta: ");
                        aro=x.nextInt();
                        System.out.print("de que material esta construido la bicicleta: ");
                        material=x.next();
                        System.out.print("la bicicleta esta motorizada: ");
                        res=x.next();
                        if(res.equals("si")){
                        motorizado=true;
                        }
                        System.out.print("cuantas llantas tiene la bicicleta: ");
                        llantas=x.nextInt();
                        System.out.print("de que color es la bicicleta: ");
                        color=x.next();
                        System.out.print("la bicicleta funciona a combustible: ");
                        res=x.next();
                        if(res.equals("si")){
                        combustible=true;
                        }
                        System.out.print("a que velocidad va la bicicleta: ");
                        double velo=x.nextDouble();
                        System.out.print("cual es la matricula de la bicicleta: ");
                        matricula=x.next();
                        
                        Bicicleta bici=new Bicicleta(pedales, montura, materia, hor, propulsion, aro, material, motorizado, llantas, color, combustible, velo, matricula);
                        Cb.Creat(bici);
                        break;
                        
                    case 2:
                        System.out.println("ingrese el codigo a verificar: ");
                            int codigo=x.nextInt();
                            System.out.println("datos de la Bicicleta: ");
                            Cb.read(codigo);
                            break;
                        
                    case 3:
                        hor=false;motorizado=false;combustible=false;
                        System.out.print("cuantos pedales tiene la bici: ");
                        pedales=x.nextInt();
                        System.out.print("cuantas monturas tiene: ");
                        montura=x.nextInt();
                        System.out.print("de que material esta echo el marco: ");
                        materia=x.next();
                        System.out.print("la bicicleta tiene orquilla");
                        res=x.next();
                        res=x.next();
                        if(res.equals("si")){
                        hor=true;
                        }
                        System.out.print("cual es medio de propulsion: ");
                        propulsion=x.next();
                        System.out.print("cuantos aros tiene la biicleta: ");
                        aro=x.nextInt();
                        System.out.print("de que material esta construido la bicicleta: ");
                        material=x.next();
                        System.out.print("la bicicleta esta motorizada: ");
                        res=x.next();
                        if(res.equals("si")){
                        motorizado=true;
                        }
                        System.out.print("cuantas llantas tiene la bicicleta: ");
                        llantas=x.nextInt();
                        System.out.print("de que color es la bicicleta: ");
                        color=x.next();
                        System.out.print("la bicicleta funciona a combustible: ");
                        res=x.next();
                        if(res.equals("si")){
                        combustible=true;
                        }
                        System.out.print("a que velocidad va la bicicleta: ");
                         velo=x.nextDouble();
                        System.out.print("cual es la matricula de la bicicleta: ");
                        matricula=x.next();
                        System.out.println("cual es el codigo de la bicicleta: ");
                        codigo=x.nextInt();
                        bici=new Bicicleta(pedales, montura, material, hor, propulsion, aro, material, motorizado, llantas, color, combustible, velo, matricula, codigo);
                        Cb.update(bici, codigo);
                        break;
                        
                    case 4:
                        System.out.println("ingrese el codigo a eliminar: ");
                            codigo=x.nextInt();
                            Cb.delete(codigo);
                            break;
                            
                    case 5:
                        System.out.println("todos los datos de la lista");
                        Cb.leerTodo();
                        break;
                        
                    case 6:
                        System.out.println("ADIOS........ :(");
                        salir=false;
                }
                }while(salir==true);
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
    
    public static void subMenu1(){

        System.out.print("**********************\n"
                + "*1. Create           *\n"
                + "*2. Read             *\n"
                + "*3. Update           *\n"
                + "*4. Delete           *\n"
                + "*5. print all        *\n"
                + "*6. Regresar         *\n"
                + "************************\n"
                + "ingrese su opcion:");
    }
}
