/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author balle
 */
public class Cuenta {
    
    private int numeroCuenta;
    private long DNIcliente;
    private int saldoactual;
    private int prueba;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNIcliente, int saldoactual) {
        this.numeroCuenta = numeroCuenta;
        this.DNIcliente = DNIcliente;
        this.saldoactual = saldoactual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNIcliente() {
        return DNIcliente;
    }

    public void setDNIcliente(long DNIcliente) {
        this.DNIcliente = DNIcliente;
    }

    public int getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(int saldoactual) {
        this.saldoactual = saldoactual;
    }
    
    
}
