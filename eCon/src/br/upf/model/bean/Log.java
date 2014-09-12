package br.upf.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "log")
public class Log {

    @Id
    @SequenceGenerator(name = "GEN_LOG_ID", allocationSize = 1, sequenceName = "GEN_LOG_ID")
    @GeneratedValue(generator = "GEN_LOG_ID", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column (name = "acao",nullable = false, length = 100)
    private String acao;
    @Column (name = "sql",nullable = false, length = 100)
    private String sql;
    @Column (name = "classe",nullable = false, length = 100)
    private String classe;
    @ManyToOne
    @JoinColumn(name="USUARIO", referencedColumnName="ID", nullable=false)
    private Usuario usuario;
    @Column (name = "timestamp",nullable = false, length = 14)
    private String timestamp;

    public Log() {
    }

    public Log(String acao, String sql, String classe, Usuario usuario, String timestamp) {
        this.acao = acao;
        this.sql = sql;
        this.classe = classe;
        this.usuario = usuario;
        this.timestamp = timestamp;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
