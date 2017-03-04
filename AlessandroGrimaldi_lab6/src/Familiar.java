
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;


class Familiar extends Persona {
    private ArrayList hijos;
    private Object padre;

    public Familiar() {
        super();
    }

    public Familiar(ArrayList hijos, Object padre, int edad, String ID, String nacionalidad, String lugar, String nombre, JTree arbol, String color, Familiar familiar) {
        super(edad, ID, nacionalidad, lugar, nombre, arbol, color, familiar);
        this.hijos = hijos;
        this.padre = padre;
    }

    public ArrayList getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList hijos) {
        this.hijos = hijos;
    }

    public Object getPadre() {
        return padre;
    }

    public void setPadre(Object padre) {
        this.padre = padre;
    }

    @Override
    public String toString() {
        return super.toString()+"Familiar{" + "hijos=" + hijos + ", padre=" + padre ;
    }
   
    
}
