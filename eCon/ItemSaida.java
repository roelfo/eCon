
import br.upf.ads.daoo.estoque.javabeans.Produto;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;


@Entity
public class ItemSaida implements Serializable {
    @Id
    @SequenceGenerator(
            name="GEN_ITEM_SAIDA_ID",
            allocationSize=1,
            sequenceName="GEN_ITEM_SAIDA_ID")
    @GeneratedValue(
            generator="GEN_ITEM_SAIDA_ID",
            strategy= GenerationType.SEQUENCE)
    private Integer id;
    @Column(precision=2,nullable=false)
    private Integer quantidade;
    @Column(precision=2,nullable=false)
    private Float valorUnitario;
    @ManyToOne(optional=false)
    private Produto produto;

    public ItemSaida() {
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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}