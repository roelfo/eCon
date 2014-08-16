
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class ItensOrçamento implements Serializable{
        @Id
    @SequenceGenerator(name="GEN_ITENSORCAMENTO_ID",
            allocationSize=1,
            sequenceName="GEN_ITENSORCAMENTO_ID")
    @GeneratedValue(generator="GEN_ITENSORCAMENTO_ID",
                    strategy= GenerationType.SEQUENCE)
    private Integer id;
    @Column(length=80,nullable=false)
    private int quantidade;
     @Column(length=20,nullable=false)
     private float valorUnitario;
      @Column(length=20,nullable=false)
      private float valorTotal;

    public ItensOrçamento() {
    }

    public ItensOrçamento(Integer id, int quantidade, float valorUnitario, float valorTotal) {
        this.id = id;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
       
      
}
