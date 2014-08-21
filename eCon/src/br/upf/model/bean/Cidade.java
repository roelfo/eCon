package br.upf.model.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class Cidade implements Serializable {

    @Id
    @SequenceGenerator(name = "GEN_CIDADE_ID", allocationSize = 1, sequenceName = "GEN_CIDADE_ID")
    @GeneratedValue(generator = "GEN_CIDADE_ID", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "nome", length = 50, nullable = false)
    private String nome;
    @Column(name = "cep", length = 8, nullable = false)
    private String cep;

    public Cidade() {
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return nome;
    }

}
