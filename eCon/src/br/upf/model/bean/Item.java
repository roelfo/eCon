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
@Table(name = "item")
public class Item implements Serializable {

    @Id
    @SequenceGenerator(name = "GEN_ITEM_ID", allocationSize = 1, sequenceName = "GEN_ITEM_ID")
    @GeneratedValue(generator = "GEN_ITEM_ID", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "numero", nullable = false)
    private Integer numero;
    @Column(name = "codigo", nullable = false)
    private Integer codigo;
    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;
    @Column(name = "valorUnitario", nullable = false)
    private Double valorUnitario;
    @Column(name = "valorItem", nullable = false)
    private Double valorItem;

    public Item() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorItem() {
        return valorItem;
    }

    public void setValorItem(Double valorItem) {
        this.valorItem = valorItem;
    }

}
