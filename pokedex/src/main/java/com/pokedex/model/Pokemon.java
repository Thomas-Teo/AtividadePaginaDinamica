package com.pokedex.model;


import javax.persistence.*;

@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "habilidade")
    private String habilidade;
    @Column(name = "movimento")
    private String movimento;
    @Column(name = "vida")
    private Long vida;
    @Column(name = "ataque")
    private Long ataque;
    @Column(name = "defesa")
    private Long defesa;
    @Column(name = "velocidade")
    private Long velocidade;
    @Column(name = "tipo")
    private String tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getMovimento() {
        return movimento;
    }

    public void setMovimento(String movimento) {
        this.movimento = movimento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getVida() {
        return vida;
    }

    public void setVida(Long vida) {
        this.vida = vida;
    }

    public Long getAtaque() {
        return ataque;
    }

    public void setAtaque(Long ataque) {
        this.ataque = ataque;
    }

    public Long getDefesa() {
        return defesa;
    }

    public void setDefesa(Long defesa) {
        this.defesa = defesa;
    }

    public Long getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Long velocidade) {
        this.velocidade = velocidade;
    }
}
