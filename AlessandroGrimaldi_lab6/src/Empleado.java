
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.tree.DefaultTreeModel;


public class Empleado extends Persona{
    protected String seccion,estado;
    protected int entrada;
    protected int salida;
    protected float sueldo;
    protected ArrayList<Ordenes> ordenes;

    public Empleado() {
    }

    public Empleado(String seccion, String estado, int entrada, int salida, float sueldo, ArrayList<Ordenes> ordenes, int edad, String ID, String nacionalidad, String lugar, String nombre, DefaultTreeModel arbol, Color color, Familiar familiar) {
        super(edad, ID, nacionalidad, lugar, nombre, arbol, color, familiar);
        this.seccion = seccion;
        this.estado = estado;
        this.entrada = entrada;
        this.salida = salida;
        this.sueldo = sueldo;
        this.ordenes = ordenes;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
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
