
import java.util.ArrayList;


public class Baleadas extends Articulos {
    ArrayList<String> ingredientes;

    public Baleadas() {
    }

    public Baleadas(ArrayList<String> ingredientes, float precio) {
        super(precio);
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return ""+precio;
    }
    
}
