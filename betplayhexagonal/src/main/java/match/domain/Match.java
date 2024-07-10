package match.domain;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import card.Card;
import goal.Goal;
import incident.Incident;
import referee.Referee;
import resut.Result;
import stadium.Stadium;
import team.Team;


public class Match {
    private int id;
    private Team equipoLocal;
    private Team equipoVisitante;
    private Date fecha;
    private Time hora;
    private Stadium estadio;
    private Referee arbitro;
    private List<Goal> lstGoles;
    private List<Card> lstTarjetas;
    private List<Incident> lstIncidentes;
    private Result resultado;
    
    public Match() {
        this.lstGoles = new ArrayList<>();
        this.lstTarjetas = new ArrayList<>();
        this.lstIncidentes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Team getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Team equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Team getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Team equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Stadium getEstadio() {
        return estadio;
    }

    public void setEstadio(Stadium estadio) {
        this.estadio = estadio;
    }

    public Referee getArbitro() {
        return arbitro;
    }

    public void setArbitro(Referee referee) {
        this.arbitro = referee;
    }

    public List<Goal> getLstGoles() {
        return lstGoles;
    }

    public void addGoal(Goal goal) {
        this.lstGoles.add(goal);
    }

    public List<Card> getLstTarjetas() {
        return lstTarjetas;
    }

    public void setLstTarjetas(List<Card> lstTarjetas) {
        this.lstTarjetas = lstTarjetas;
    }

    public List<Incident> getLstIncidentes() {
        return lstIncidentes;
    }

    public void addIncident(Incident incident) {
        this.lstIncidentes.add(incident);
    }

    public Result getResultado() {
        return resultado;
    }

    public void setResultado(Result resultado) {
        this.resultado = resultado;
    }
    
}
