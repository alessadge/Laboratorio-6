
import java.util.ArrayList;


public class Empleado extends Persona{
    protected String lugar,estado;
    protected int entrada;
    protected int salida;
    protected float sueldo;
    protected ArrayList<Ordenes> ordenes;

    public Empleado() {
    }

    public Empleado(String lugar, String estado,int entrada,int  salida, int sueldo) {
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

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public ArrayList<Ordenes> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Ordenes> ordenes) {
        this.ordenes = ordenes;
    }

    
    @Override
    public String toString() {
        return super.nombre;
    }
    
}
