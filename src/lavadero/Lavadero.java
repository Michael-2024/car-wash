/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lavadero;



/**
 *
 * @author crani
 */
public class Lavadero extends menu {

    public Lavadero() {
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear instancias de las clases
        Cliente cliente = new Cliente("Juan Pérez", "555-1234");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Sedán");
        Serviciolavado servicioLavado = new Serviciolavado("Lavado Completo");

        // Crear el registro de servicio
        Infoservicio informacion = new Infoservicio(cliente, vehiculo, servicioLavado);

        // Mostrar el resumen del servicio
        System.out.println(informacion.resumenServicio());
    }
    
}
