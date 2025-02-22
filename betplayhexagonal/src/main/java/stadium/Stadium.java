package stadium;

public class Stadium {
    private Integer id;
    private String nombre;
    private String ubicacion;
    private int capacidad;

    public Stadium() {
    }

  

    public Stadium(Integer id, String nombre, String ubicacion, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }



    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    

}
