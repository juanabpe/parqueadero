/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author WINDOWS10PRO
 */
public class Vehiculo implements Serializable{
    private String placa;
    private Date fecha;
    private String hora;
    private String identificacion;

    public String obtenerPlaca() {
        return placa;
    }

    public void modificarPlaca(String placa) {
        this.placa = placa;
    }

    public Date obtenerFecha() {
        return fecha;
    }

    public void modificarFecha(Date fecha) {
       this.fecha = fecha;
    }

    public String obtenerHora() {
        return hora;
    }

    public void modificarHora(String hora) {
        this.hora = hora;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public void modificarIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    
}
    

