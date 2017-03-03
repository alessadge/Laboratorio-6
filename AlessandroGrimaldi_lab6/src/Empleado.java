
import java.util.Date;


public class Empleado extends Persona{
    protected String lugar,estado;
    protected Date entrada;
    protected Date salida;
    protected int sueldo;

    public Empleado() {
    }

    public Empleado(String lugar, String estado, Date entrada, Date salida, int sueldo) {
        this.lugar = lugar;
        this.estado = estado;
        this.entrada = entrada;
        this.salida = salida;
        this.sueldo = sueldo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
