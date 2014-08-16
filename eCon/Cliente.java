
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

@Entity
public class Cliente implements Serializable{
     @Id
    @SequenceGenerator(name="GEN_CLIENTE_ID",
            allocationSize=1,
            sequenceName="GEN_CLIENTE_ID")
    @GeneratedValue(generator="GEN_CLIENTE_ID",
                    strategy= GenerationType.SEQUENCE)
    private Integer id;
    @Column(length=80,nullable=false)
    private String nome;
    @Column(length=60,nullable=false)
    private String endereco;
     @Column(length=60,nullable=false)
    private float cpf;
    @ManyToOne(optional=false)
    private Cidade cidade;
    @Column(length=9,nullable=false)
    private String telefone;
    @ManyToMany
    private Collection<Produto> produtos;

    public Cliente() {
    }

    @Override
    public String toString() {
        return nome;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getCpf() {
        return cpf;
    }

    public void setCpf(float cpf) {
        this.cpf = cpf;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Collection<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Collection<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente(Integer id, String nome, String endereco, float cpf, Cidade cidade, String telefone, Collection<Produto> produtos) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.cidade = cidade;
        this.telefone = telefone;
        this.produtos = produtos;
    }

}
