
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.tree.DefaultTreeModel;


public class Clientes extends Persona {
    private int ticket;
    private float dinero;
    private ArrayList<String> ordenes;

    public Clientes() {
    }

    public Clientes(int ticket, float dinero, ArrayList<String> ordenes, int edad, String ID, String nacionalidad, String lugar, String nombre, DefaultTreeModel arbol, Color color, Familiar familiar) {
        super(edad, ID, nacionalidad, lugar, nombre, arbol, color, familiar);
        this.ticket = ticket;
        this.dinero = dinero;
        this.ordenes = ordenes;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public ArrayList<String> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<String> ordenes) {
        this.ordenes = ordenes;
    }

    @Override
    public String toString() {
        return super.nombre;
    }
    
}
