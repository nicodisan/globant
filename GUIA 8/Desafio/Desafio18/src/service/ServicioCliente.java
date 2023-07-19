package service;


import entities.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioCliente {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Cliente crearCliente() {

        Cliente cliente = new Cliente();

        
        System.out.println("Ingrese ID");
        cliente.setId(sc.nextInt());
        System.out.println("Ingrese Nombre");
        cliente.setNombre(sc.next());
        System.out.println("Ingrese Edad");
        cliente.setEdad(sc.nextInt());
        System.out.println("Ingrese peso");
        cliente.setPeso(sc.nextDouble());
        System.out.println("Ingrese Objetivo");
        cliente.setObjetivo(sc.next());

        return cliente;

    }

    public void obtenerClientes(ArrayList<Cliente> listaClientes) {

        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println(listaClientes.get(i));

        }
    }
    
       
    public void actualizarCliente(ArrayList<Cliente> listaClientes){
        
        
        System.out.println("Cual ID Actualizar?");
        int idMod = sc.nextInt();
        System.out.println("Nombre:");
        String nombre = sc.next();
        System.out.println("Edad:");
        int edad = sc.nextInt();
        System.out.println("Peso:");
        double peso = sc.nextDouble();
        System.out.println("Objetivo:");
        String objetivo = sc.next();
        listaClientes.set(idMod-1, new Cliente(idMod, nombre, edad, peso, objetivo));
        
    }
    
    
    public void eliminarCliente(ArrayList<Cliente> listaClientes) {

        System.out.println("Cual ID borrar?");
        int ingreso = sc.nextInt();
        listaClientes.remove(ingreso - 1);

    }
    
    
    

}
