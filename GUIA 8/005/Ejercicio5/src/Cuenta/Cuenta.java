
package Cuenta;

import java.util.Scanner;

public class Cuenta {
    
    private int numCuenta;
    private int dni;
    private int saldo;
    

    public Cuenta() {
    }

    public Cuenta(int numCuenta, int dni, int saldo) {
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.saldo = saldo;
       
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
          
    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", dni=" + dni + ", saldo=" + saldo + '}';
    }
    
}
