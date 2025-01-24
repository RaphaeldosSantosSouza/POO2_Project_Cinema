package model;

public class Ingresso {
    private Integer id;
    private Double preco;
    private Sessao sessao;
    private Cliente cliente;

    public Ingresso() {
    }

    public Ingresso(Integer id, Double preco, Sessao sessao, Cliente cliente) {
        this.id = id;
        this.preco = preco;
        this.sessao = sessao;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
