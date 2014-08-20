package br.upf.model.bean;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
public class Produto implements Serializable {
     @Id
    @SequenceGenerator(name="GEN_PRODUTO_ID",
            allocationSize=1,
            sequenceName="GEN_PRODUTO_ID")
    @GeneratedValue(generator="GEN_PRODUTO_ID",
                    strategy= GenerationType.SEQUENCE)
    private Integer id;
    @Column(length=80,
            nullable=false,
            unique=true)
    private String nome;
    @Column (length = 300)
    private float preco;
    @Column (nullable = false, precision=2)
    private String descricao;
    @Column(nullable=false,precision=2)
    private String unidadeMedida;
    @Column(nullable = false)
    private String fornecedor;
   

    public Produto() {
    }

    public Produto(Integer id, String nome, float preco, String descricao, String unidadeMedida, String fornecedor) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.unidadeMedida = unidadeMedida;
        this.fornecedor = fornecedor;
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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
    
    
}
