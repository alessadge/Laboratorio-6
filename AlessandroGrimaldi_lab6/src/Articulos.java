
public class Articulos {
    protected float precio;
    private String ID;
    public Articulos() {
    }

    public Articulos(float precio) {
        this.precio = precio;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulos{" + "precio=" + precio + '}';
    }
    
}
