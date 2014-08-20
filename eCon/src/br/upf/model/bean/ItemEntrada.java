package br.upf.model.bean;
import br.upf.model.bean.Produto;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;


    @Entity
public class ItemEntrada implements Serializable {
    @Id
    @SequenceGenerator(
            name="GEN_ITEM_ENTRADA_ID",
            allocationSize=1,
            sequenceName="GEN_ITEM_ENTRADA_ID")
    @GeneratedValue(
            generator="GEN_ITEM_ENTRADA_ID",
            strategy= GenerationType.SEQUENCE)
    private Integer id;
    @Column(precision=2,nullable=false)
    private Integer quantidade;
    @Column(precision=2,nullable=false)
    private Float valorUnitario;
    @ManyToOne(optional=false)
    private Produto produto;

    public ItemEntrada() {
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    
}

