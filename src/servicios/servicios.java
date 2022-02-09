/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author balle
 */
public class servicios {
    Scanner leer= new Scanner(System.in);
    public Cuenta crearcuenta(){
    Cuenta C1 = new Cuenta();
    
        System.out.println(" Ingrese su DNI ");
        C1.setDNIcliente(leer.nextLong());
        System.out.println(" Ingrese su numero de cuenta bancaria ");
        C1.setNumeroCuenta(leer.nextInt());
        System.out.println(" Ingrese su saldo actual ");
        C1.setSaldoactual(leer.nextInt());
    return C1;
    }
    
    public Cuenta ingresar(Cuenta C1){
        int ingreso;
        System.out.println(" Ingrese dinero ");
        ingreso = leer.nextInt();
        C1.setSaldoactual(C1.getSaldoactual()+ingreso);
        System.out.println(" El saldo actual mas el ingreso es " + (C1.getSaldoactual()));
     return null;   
    }
    
    public Cuenta retirar (Cuenta C1){
        int retiro;
        System.out.println(" Ingrese dinero a retirar ");
        retiro= leer.nextInt();
      
        if (C1.getSaldoactual()>retiro){
             C1.setSaldoactual(C1.getSaldoactual() -retiro);
             System.out.println(" El saldo actual menos el retiro es " + C1.getSaldoactual());
        }else if (C1.getSaldoactual()<retiro) {
                 C1.setSaldoactual(0);
                System.out.println(" El saldo es " + C1.getSaldoactual());
                }
    return null;
    }
    
    public Cuenta extraccionrapida (Cuenta C1){
    int rapida= C1.getSaldoactual()*20/100;
        System.out.println(" Puede retirar solo el 20% de su saldo " + rapida);
        return null;
    }
    
    public Cuenta consultarsaldo (Cuenta C1){
        System.out.println(" Su saldo actual es " + C1.getSaldoactual());
        return null;
    }
    
    public Cuenta consultardatos (Cuenta C1){
        System.out.println(" DNI del cliente " + C1.getDNIcliente());
        System.out.println(" Numero de cuenta " + C1.getNumeroCuenta());
        
        return null;

    }
    

}


