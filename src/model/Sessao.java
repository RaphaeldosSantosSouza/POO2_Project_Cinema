package model;

import java.util.Date;

public class Sessao {
    private Integer id;
    private String cam;
    private Date horarioDaSessao;
    private Filme filme;
    private Sala sala;

    public Sessao() {
    }

    public Sessao(Integer id, String cam, Date horarioDaSessao, Filme filme, Sala sala) {
        this.id = id;
        this.cam = cam;
        this.horarioDaSessao = horarioDaSessao;
        this.filme = filme;
        this.sala = sala;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCam() {
        return cam;
    }

    public void setCam(String cam) {
        this.cam = cam;
    }

    public Date getHorarioDaSessao() {
        return horarioDaSessao;
    }

    public void setHorarioDaSessao(Date horarioDaSessao) {
        this.horarioDaSessao = horarioDaSessao;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
}