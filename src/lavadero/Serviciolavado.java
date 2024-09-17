/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavadero;

/**
 *
 * @author crani
 */
public class Serviciolavado {
    
    public String tipolavado;

    public Serviciolavado(String tipolavado) {
        this.tipolavado = tipolavado;
    }
    
    public String getTipolavado(){
            return tipolavado;
    }
    
    public void setTipolavado(String tipolavado){
    this.tipolavado = tipolavado;
    }
    
}
