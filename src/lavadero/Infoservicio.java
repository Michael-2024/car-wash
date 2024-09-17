/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavadero;

/**
 *
 * @author crani
 */
public class Infoservicio {
    
    public Cliente cliente;
    public Vehiculo vehiculo;
    public Serviciolavado serviciolavado;

    public Infoservicio(Cliente cliente, Vehiculo vehiculo, Serviciolavado serviciolavado) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.serviciolavado = serviciolavado;
    }
    
    public Cliente getCliente(){
            return cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public Vehiculo getVehiculo(){
            return vehiculo;
    }
    
    public void setVehiculo(){
        this.vehiculo = vehiculo;
    }
    
    public Serviciolavado getServiciolavado(){
            return serviciolavado;
    }
    
    public void setServiciolavado(){
        this.serviciolavado = serviciolavado;
    }
    public String resumenServicio() {
        return "Cliente: " + cliente.getNombre() + "\n" +
               "Teléfono: " + cliente.getTelefono() + "\n" +
               "Vehículo: " + vehiculo.getTipo() + "\n" + 
                "Placa: " + vehiculo.getPlaca() + "\n" +
               "Tipo de lavado: " + serviciolavado.getTipolavado();
    }
}
