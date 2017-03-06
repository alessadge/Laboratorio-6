
public class Gatos extends Articulos {
   private int peso;
   private int altura;
   private String ID;

    public Gatos() {
    }

    public Gatos(int peso, int altura, float precio) {
        super(precio);
        this.peso = peso;
        this.altura = altura;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return ""+precio;
    }
   
}
