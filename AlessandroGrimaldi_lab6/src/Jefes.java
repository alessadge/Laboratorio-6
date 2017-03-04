
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;


public class Jefes extends Persona {
    private String seccion;
    private ArrayList<Empleado> empleados;
    private int numero;
    private float ganancia;

    public Jefes() {
        super();
    }

    public Jefes(String seccion, ArrayList<Empleado> empleados, int numero, float ganancia, int edad, String ID, String nacionalidad, String lugar, String nombre, JTree arbol, String color, Familiar familiar) {
        super(edad, ID, nacionalidad, lugar, nombre, arbol, color, familiar);
        this.seccion = seccion;
        this.empleados = empleados;
        this.numero = numero;
        this.ganancia = ganancia;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getGanancia() {
        return ganancia;
    }

    public void setGanancia(float ganancia) {
        this.ganancia = ganancia;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
