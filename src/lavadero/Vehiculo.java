/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavadero;

/**
 *
 * @author crani
 */
public class Vehiculo {
    
    public String placa;
    public String tipo;

    public Vehiculo(String placa, String tipo) {
        this.placa = placa;
        this.tipo = tipo;
    }
    
    public String getPlaca(){
            return placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getTipo(){
            return tipo;
    }
    
    public void setTipo(String tipo){
    this.tipo = tipo;
    }
}
