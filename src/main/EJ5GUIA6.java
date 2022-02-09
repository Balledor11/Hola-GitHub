/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Cuenta;
import servicios.servicios;

/**
 *
 * @author balle
 */
public class EJ5GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicios C = new servicios();
        
        Cuenta C1= C.crearcuenta();
        
        C.ingresar(C1);
        C.retirar(C1);
        C.extraccionrapida(C1);
        C.consultarsaldo(C1);
        C.consultardatos(C1);
    }
    
}
