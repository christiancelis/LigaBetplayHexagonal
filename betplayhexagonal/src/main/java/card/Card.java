package card;

import match.domain.Match;
import player.Player;

public class Card {
    private Integer id;
    private Player jugador;
    private Match partido;
    private String tipo;
    private Integer minuto;

    public Card() {
    }

    public Card(Integer id, Player jugador, Match partido, String tipo, Integer minuto) {
        this.id = id;
        this.jugador = jugador;
        this.partido = partido;
        this.tipo = tipo;
        this.minuto = minuto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Player getJugador() {
        return jugador;
    }

    public void setJugador(Player jugador) {
        this.jugador = jugador;
    }

    public Match getPartido() {
        return partido;
    }

    public void setPartido(Match partido) {
        this.partido = partido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getMinuto() {
        return minuto;
    }

    public void setMinuto(Integer minuto) {
        this.minuto = minuto;
    }    
}


