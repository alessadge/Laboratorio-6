
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;


class Familiar extends Persona {
    private ArrayList<Familiar> hijos;
    private Familiar padre;

    public Familiar() {
        super();
    }

    public Familiar(ArrayList<Familiar> hijos, Familiar padre, int edad, String ID, String nacionalidad, String lugar, String nombre, JTree arbol, String color, Familiar familiar) {
        super(edad, ID, nacionalidad, lugar, nombre, arbol, color, familiar);
        this.hijos = hijos;
        this.padre = padre;
    }

    public ArrayList<Familiar> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Familiar> hijos) {
        this.hijos = hijos;
    }

    public Familiar getPadre() {
        return padre;
    }

    public void setPadre(Familiar padre) {
        this.padre = padre;
    }

    @Override
    public String toString() {
        return super.toString()+"Familiar{" + "hijos=" + hijos + ", padre=" + padre + '}';
    }
   
    
}
