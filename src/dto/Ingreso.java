
package dto;

import java.util.Date;
import java.util.Timer;

/**
 *
 * @author WINDOWS10PRO
 */
public class Ingreso {
    private String placa;
    private Date fecha;
    private Timer hora;
    private String identificacion;

    public Ingreso(String placa, Date fecha, Timer hora, String identificacion) {
        this.fecha = fecha;
        this.hora = hora;
        this.identificacion = identificacion;
        this.placa = placa;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Timer getHora() {
        return hora;
    }

    public void setHora(Timer hora) {
        this.hora = hora;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
   
}
