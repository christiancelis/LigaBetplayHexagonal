package rol;

import java.util.ArrayList;
import java.util.List;

import permit.Permit;

public enum Rol {
    ADMINISTRADOR(1),
    EQUIPO_TECNICO(2),
    ARBITRO(3),
    PERIODISTA(4),
    AFICIONADO(5);

    private final int id;
    private final List<Permit> permisos;

    Rol(int id) {
        this.id = id;
        this.permisos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public List<Permit> getPermisos() {
        return permisos;
    }

    public void addPermiso(Permit permiso) {
        permisos.add(permiso);
    }
}
