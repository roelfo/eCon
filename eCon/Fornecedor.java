
import br.upf.ads.daoo.estoque.javabeans.Cidade;
import br.upf.ads.daoo.estoque.javabeans.Produto;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
public class Fornecedor implements Serializable{
     @Id
    @SequenceGenerator(name="GEN_FORNECEDOR_ID",
            allocationSize=1,
            sequenceName="GEN_FORNECEDOR_ID")
    @GeneratedValue(generator="GEN_FORNECEDOR_ID",
                    strategy= GenerationType.SEQUENCE)
    private Integer id;
    @Column(length=80,nullable=false)
    private String nome;
    @Column(length=60,nullable=false)
    private String telefone;
    @Column(length=60,nullable=false)
    private String cnpj;
    @ManyToMany
    private Collection<Produto> produtos;

    public Fornecedor() {
    }

    public Fornecedor(Integer id, String nome, String telefone, String cnpj, Collection<Produto> produtos) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.produtos = produtos;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Collection<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Collection<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return nome;
    }

    
}
