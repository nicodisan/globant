
package com.mycompany.ejercicio7.entities;

public class Persona {
    
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    
    
    //constructor vacio
    public Persona() {
    }
    
    //constructor con parametros
    public Persona(String nombre, int edad, 
            String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    
    // getters & setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    // tostring
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + 
                nombre + ", edad=" + edad + 
                ", sexo=" + sexo + ", peso=" + 
                peso + ", altura=" + altura + '}';
    }
    
    
    
    
    

}
