
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
@Table(name = "nivelAdmin")
public class NivelAdmin implements Serializable{
    @Id
    @SequenceGenerator(name = "GEN_NIVELADMIN_ID", allocationSize = 1, sequenceName = "GEN_NIVELADMIN_ID")
    @GeneratedValue(generator = "GEN_NIVELADMIN_ID", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "nome", length = 50, nullable = false)
    private String nome;
    @Column(name = "descricao", length = 50, nullable = false)
    private String descricao;

    public NivelAdmin() {
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

    @Override
    public String toString() {
        return nome;
    }
    
}
