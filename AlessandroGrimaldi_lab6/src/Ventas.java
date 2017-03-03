
import java.util.ArrayList;
import java.util.Date;


public class Ventas {
    private Clientes cliente;
    private Empleado empleado;
    private float total;
    private Date date;

    public Ventas() {
    }

    public Ventas(Clientes cliente, Empleado empleado, float total, Date date) {
        this.cliente = cliente;
        this.empleado = empleado;
        this.total = total;
        this.date = date;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Ventas{" + "cliente=" + cliente + ", empleado=" + empleado + ", total=" + total + ", date=" + date + '}';
    }
    
    
}
