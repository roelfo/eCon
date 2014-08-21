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
@Table(name = "itensOrcamento")
public class ItensOrcamento implements Serializable {

    @Id
    @SequenceGenerator(name = "GEN_ITENORCAMENTO_ID", allocationSize = 1, sequenceName = "GEN_ITENORCAMENTO_ID")
    @GeneratedValue(generator = "GEN_ITENORCAMENTO_ID", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(nullable = false)
    private Integer quantidade;
    @Column(nullable = false)
    private Double valorUnitario;
    @Column(nullable = false)
    private Integer valorTotal;

    public ItensOrcamento() {
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

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Integer getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Integer valorTotal) {
        this.valorTotal = valorTotal;
    }

}
