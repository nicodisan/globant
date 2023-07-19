package desafio18;

import entities.Cliente;
import entities.Rutina;
import java.util.ArrayList;
import java.util.Scanner;
import service.ServicioCliente;
import service.ServicioRutina;

public class Desafio18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Cliente> listaClientes = new ArrayList();
        ArrayList<Rutina> listaRutinas = new ArrayList();

        ServicioCliente servC = new ServicioCliente();
        ServicioRutina servR = new ServicioRutina();
        int opc = 0;
        String salir = "";

        do {

            System.out.println("Menu "
                    + "\n1-Crear Cliente"
                    + "\n2-Crear Rutina"
                    + "\n3-Ver lista Clientes"
                    + "\n4-Ver lista Rutinas"
                    + "\n5-Atualizar y ver Clientes"
                    + "\n6-Actualizar y ver Rutinas"
                    + "\n7-Eliminar y ver Clientes"
                    + "\n8-Eliminar y ver Rutinas"
                    + "\n9-Salir");
            System.out.println("Ingrese opcion:");
            opc = sc.nextInt();
            switch (opc) {
                case 1: {
                    listaClientes.add(servC.crearCliente());
                    break;
                }
                case 2: {
                    listaRutinas.add(servR.crearRutina());
                    break;
                }
                case 3: {
                    //Visualiza Clientes//
                    servC.obtenerClientes(listaClientes);
                }
                case 4: {
                    servR.obtenerRutina(listaRutinas);
                    break;
                }
                case 5: {
                    //Actualizar Cliente//
                    servC.actualizarCliente(listaClientes);
                    servC.obtenerClientes(listaClientes);
                    break;
                }
                case 6: {
                    servR.actualizarCliente(listaRutinas);
                    servR.obtenerRutina(listaRutinas);
                    break;
                }
                case 7: {
                    //Elimina un cliente//
                    servC.eliminarCliente(listaClientes);
                    servC.obtenerClientes(listaClientes);
                }
                case 8: {
                    servR.eliminarRutina(listaRutinas);
                    servR.obtenerRutina(listaRutinas);
                    break;
                }
                case 9: {
                    System.out.println("Desea salir? s/n");
                    salir = sc.next();
                    break;
                }

            }

        } while (!salir.equalsIgnoreCase("s"));

    }

}
