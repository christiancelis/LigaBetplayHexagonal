package player;

import java.util.ArrayList;
import java.util.List;

import injury.Injury;
import perform.Perform;
import person.Person;

public class Player extends Person{
    private int edad;
    private String posicion;
    private String nacionalidad;
    private int numeroCamiseta;
    private String equipo;
    private List<Injury> lstLesiones;
    private List<Perform> lstRendimientos;
    
    public Player() {
        super();
        lstLesiones = new ArrayList<Injury>();
        lstRendimientos = new ArrayList<Perform>();
    }

    public Player(int id, String nombre, int edad, String posicion, String nacionalidad, int numeroCamiseta,
            String equipo, List<Injury> lstLesiones, List<Perform> lstRendimientos) {
        super(id, nombre);
        this.edad = edad;
        this.posicion = posicion;
        this.nacionalidad = nacionalidad;
        this.numeroCamiseta = numeroCamiseta;
        this.equipo = equipo;
        this.lstLesiones = lstLesiones;
        this.lstRendimientos = lstRendimientos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public List<Injury> getLstLesiones() {
        return lstLesiones;
    }

    public void setLstLesiones(Injury injury) {
        this.lstLesiones.add(injury);
    }

    public List<Perform> getLstRendimientos() {
        return lstRendimientos;
    }

    public void setLstRendimientos(Perform performance) {
        this.lstRendimientos.add(performance);
    }
}
