/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dto.Vehiculo;
import java.util.Date;


/**
 *
 * @author WINDOWS10PRO
 */
public class Registro {

    public Vehiculo crearVehiculo(String placa, Date fecha, String hora, String identificacion){
        Vehiculo v = new Vehiculo();
        v.modificarFecha(fecha);
        v.modificarHora(hora);
        v.modificarIdentificacion(identificacion);
        v.modificarPlaca(placa);
        return v;
    }
}
