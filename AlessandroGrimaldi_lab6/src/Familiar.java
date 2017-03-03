
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.tree.DefaultTreeModel;


class Familiar extends Persona {
    protected Familiar padre;
    protected ArrayList<Familiar> hijos;

    public Familiar() {
    }

    public Familiar(Familiar padre, ArrayList<Familiar> hijos, int edad, String ID, String nacionalidad, String lugar, String nombre, DefaultTreeModel arbol, Color color, Familiar familiar) {
        super(edad, ID, nacionalidad, lugar, nombre, arbol, color, familiar);
        this.padre = padre;
        this.hijos = hijos;
    }

    public Familiar getPadre() {
        return padre;
    }

    public void setPadre(Familiar padre) {
        this.padre = padre;
    }

    public ArrayList<Familiar> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Familiar> hijos) {
        this.hijos = hijos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
