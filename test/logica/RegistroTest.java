/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package logica;

import dto.Vehiculo;
import java.util.Calendar;
import java.util.Date;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author WINDOWS10PRO
 */
public class RegistroTest {
    
    
    @Test
    public void CrearVehiculoNull() {
        String placa = null;
        Date fecha = null;
        String hora = null;
        String identificacion = null;
        Registro v = new Registro();
        Vehiculo result = v.crearVehiculo(placa, fecha, hora, identificacion);
        assertNull(result);
    }
    
    @Test
    public void CrearVehiculoVacio(){
        String placa = "";
        Calendar c = Calendar.getInstance();
        Date fecha = c.getTime() ;
        String hora = "";
        String identificacion = "";
        Registro v = new Registro();
        Vehiculo result = v.crearVehiculo(placa, fecha, hora, identificacion);
        assertNull(result);
    }
    @Test
    public void CrearVehiculoPlacaNull(){
        String placa = null;
        Calendar c = Calendar.getInstance();
        Date fecha = c.getTime();
        String hora = "11:25";
        String identificacion = "1234567342";
        Registro v = new Registro();
        Vehiculo result = v.crearVehiculo(placa, fecha, hora, identificacion);
        assertNull(result);
    }
    @Test
    public void CrearVehiculoFechaNull(){
        String placa = "XYZ123";
        Calendar c = Calendar.getInstance();
        Date fecha = null;
        String hora = "11:25";
        String identificacion = "1234567342";
        Registro v = new Registro();
        Vehiculo result = v.crearVehiculo(placa, fecha, hora, identificacion);
        assertNull(result);
    }
    @Test
    public void CrearVehiculoHoraNull(){
        String placa = "XYZ123";
        Calendar c = Calendar.getInstance();
        Date fecha = c.getTime();
        String hora = null;
        String identificacion = "1234567342";
        Registro v = new Registro();
        Vehiculo result = v.crearVehiculo(placa, fecha, hora, identificacion);
        assertNull(result);
    }
    @Test
    public void CrearVehiculoIdentificacionNull(){
        String placa = "XYZ123";
        Calendar c = Calendar.getInstance();
        Date fecha = c.getTime();
        String hora = "11:25";
        String identificacion = null;
        Registro v = new Registro();
        Vehiculo result = v.crearVehiculo(placa, fecha, hora, identificacion);
        assertNull(result);
    }
}
