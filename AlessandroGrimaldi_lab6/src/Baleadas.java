
import java.util.ArrayList;


public class Baleadas {
    ArrayList<String> ingredientes;

    public Baleadas() {
    }

    public Baleadas(ArrayList<String> ingredientes) {
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
        return "Baleadas{" + "ingredientes=" + ingredientes + '}';
    }
    
}
