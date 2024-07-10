package ticket;

import java.util.Date;

import match.domain.Match;
import user.User;

public class Ticket {
    private Integer id;
    private Match partido;
    private User comprador;
    private Date fechaCompra;
    private int cantidad;
    private double precioUnitario;
    private double precioTotal;
    private String ubicacion;

    public Ticket() {
    }

    public Ticket(Integer id,Match partido, User comprador, Date fechaCompra, int cantidad, double precioUnitario,
            double precioTotal, String ubicacion) {
        this.id = id;
        this.partido = partido;
        this.comprador = comprador;
        this.fechaCompra = fechaCompra;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioTotal = precioTotal;
        this.ubicacion = ubicacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Match getPartido() {
        return partido;
    }

    public void setPartido(Match partido) {
        this.partido = partido;
    }

    public User getComprador() {
        return comprador;
    }

    public void setComprador(User comprador) {
        this.comprador = comprador;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
