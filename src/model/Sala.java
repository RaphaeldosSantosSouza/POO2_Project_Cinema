package model;

import java.util.ArrayList;

public class Sala {
    private Integer id;
    private String nome;
    private Integer qtdeAssentos;
    private ArrayList<Assento> assentos;

    public Sala() {
    }

    public Sala(Integer id, String nome, Integer qtdeAssentos, ArrayList<Assento> assentos) {
        this.id = id;
        this.nome = nome;
        this.qtdeAssentos = qtdeAssentos;
        this.assentos = assentos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdeAssentos() {
        return qtdeAssentos;
    }

    public void setQtdeAssentos(Integer qtdeAssentos) {
        this.qtdeAssentos = qtdeAssentos;
    }

    public ArrayList<Assento> getAssentos() {
        return assentos;
    }
    
}
