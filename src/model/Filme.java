package model;

public class Filme {
    private Integer id;
    private String nome;
    private String descricao;
    private String classificacao;
    private Integer minutosTotais;

    public Filme() {
    }

    public Filme(Integer id, String nome, String descricao, String classificacao, Integer minutosTotais) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.classificacao = classificacao;
        this.minutosTotais = minutosTotais;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public Integer getMinutosTotais() {
        return minutosTotais;
    }

    public void setMinutosTotais(Integer minutosTotais) {
        this.minutosTotais = minutosTotais;
    }
    
}
