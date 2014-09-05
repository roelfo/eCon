package br.upf.model.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    @Id
    @SequenceGenerator(name = "GEN_CLIENTE_ID", allocationSize = 1, sequenceName = "GEN_CLIENTE_ID")
    @GeneratedValue(generator = "GEN_CLIENTE_ID", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(length = 80, nullable = false)
    private String nome;
    @Column(length = 60, nullable = false)
    private String endereco;
    @Column(length = 15, nullable = false)
    private String cpf;
    @ManyToOne
    @JoinColumn(name="CIDADE", referencedColumnName="ID", nullable=false)
    private Cidade cidade;
    @Column(length = 13, nullable = false)
    private String telefone;

    public Cliente() {
    }

    @Override
    public String toString() {
        return nome;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

      public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
