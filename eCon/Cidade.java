
import br.upf.ads.daoo.estoque.javabeans.Estado;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Infus
 */
@Entity
public class Cidade implements Serializable {
    @Id
    @SequenceGenerator(name="GEN_CIDADE_ID",
            allocationSize=1,
            sequenceName="GEN_CIDADE_ID")
    @GeneratedValue(generator="GEN_CIDADE_ID",
                    strategy= GenerationType.SEQUENCE)
    private Integer id;
    @Column(length=80,nullable=false)
    private String nome;
      @Column(length=80,nullable=false)
    private String cep;
  

    public Cidade() {
    }

    public Cidade(Integer id, String nome, String cep) {
        this.id = id;
        this.nome = nome;
        this.cep = cep;
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
