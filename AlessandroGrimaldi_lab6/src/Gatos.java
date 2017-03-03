
public class Gatos extends Articulos {
   private int peso;
   private int altura;

    public Gatos() {
    }

    public Gatos(int peso, int altura, int precio) {
        super(precio);
        this.peso = peso;
        this.altura = altura;
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
        return "Gatos{" + "peso=" + peso + ", altura=" + altura + '}';
    }
   
}
