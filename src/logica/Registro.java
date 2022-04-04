/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dto.Ingreso;
import java.util.Date;
import java.util.Timer;

/**
 *
 * @author WINDOWS10PRO
 */
public class Registro {

    public Ingreso registrarVehiculo(String placa, Date fecha, Timer hora, String identificacion) {
        if (placa == null || fecha == null || hora == null || identificacion == null || placa.isEmpty()
                || identificacion.isEmpty()) {
            return null;
        } else {
            Ingreso elVehiculo = this.registrarVehiculo(placa, fecha, hora, identificacion);
            Ingreso c = new Ingreso(placa, fecha, hora, identificacion);
            return c;
        }
    }
}
