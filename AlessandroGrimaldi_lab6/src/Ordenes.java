
import java.util.ArrayList;
import java.util.Date;


public class Ordenes {

    ArrayList<Articulos> articulos=new ArrayList();
    private Clientes cliente;
    private Empleado empleado;
    private float total;
    private Date date;
    private int cantidadArticulo;

    public Ordenes() {
    }

    public Ordenes(Clientes cliente, Empleado empleado, float total, Date date, int cantidadArticulo) {
        this.cliente = cliente;
        this.empleado = empleado;
        this.total = total;
        this.date = date;
        this.cantidadArticulo = cantidadArticulo;
    }

    public int getCantidadArticulo() {
        return cantidadArticulo;
    }

    public void setCantidadArticulo(int cantidadArticulo) {
        this.cantidadArticulo = cantidadArticulo;
    }

    public void setArticulos(ArrayList<Articulos> articulos) {
        this.articulos = articulos;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Ordenes{" + "articulos=" + articulos + ", cliente=" + cliente + ", empleado=" + empleado + ", total=" + total + ", date=" + date + '}';
    }
    
}
