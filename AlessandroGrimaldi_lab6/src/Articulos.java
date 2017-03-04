
public class Articulos {
    private float precio;

    public Articulos() {
    }

    public Articulos(float precio) {
        this.precio = precio;
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
