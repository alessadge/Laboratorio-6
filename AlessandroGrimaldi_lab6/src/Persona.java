
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;


public class Persona {
    
    protected int edad;
    protected String ID;
    protected String nacionalidad;
    protected String lugar,nombre;
    protected JTree arbol;
    protected String color;
    protected ArrayList<Familiar> familiares;

    public Persona() {
    }

    public Persona(int edad, String ID, String nacionalidad, String lugar, String nombre, JTree arbol, String color, Familiar familiar) {
        this.edad = edad;
        this.ID = ID;
        this.nacionalidad = nacionalidad;
        this.lugar = lugar;
        this.nombre = nombre;
        this.arbol = arbol;
        this.color = color;
 
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public JTree getArbol() {
        return arbol;
    }

    public void setArbol(JTree arbol) {
        this.arbol = arbol;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Familiar> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(ArrayList<Familiar> familiares) {
        this.familiares = familiares;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
