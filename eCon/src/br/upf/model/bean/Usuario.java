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
@Table(name = "usuarios")
public class Usuario implements Serializable{
    @Id
    @SequenceGenerator(name = "GEN_USER_ID", allocationSize = 1, sequenceName = "GEN_USER_ID")
    @GeneratedValue(generator = "GEN_USER_ID", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    @Column(name = "senha", length = 100, nullable = false)
    private String senha;
    @Column(name = "endereco", length = 250, nullable = false)
    private String endereco;
    @Column(name = "fone", length = 10, nullable = false)
    private String fone;
    @Column(name = "documento", length = 15, nullable = false)
    private String documento;
    @Column(name = "tipo", length = 3, nullable = false)
    private String tipo;
    @ManyToOne
    @JoinColumn(name = "NIVELADMIN", referencedColumnName = "ID", nullable = false)
    private NivelAdmin nivelUser;
    @ManyToOne
    @JoinColumn(name = "CIDADE", referencedColumnName = "ID", nullable = false)
    private Cidade cidade;

    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NivelAdmin getNivelUser() {
        return nivelUser;
    }

    public void setNivelUser(NivelAdmin nivelUser) {
        this.nivelUser = nivelUser;
    }

}
