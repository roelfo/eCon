/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.upf.model.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "fichaEntrega")
public class fichaEntrega implements Serializable {

    @Id
    @SequenceGenerator(name = "GEN_FICHA_ID", allocationSize = 1, sequenceName = "GEN_FICHA_ID")
    @GeneratedValue(generator = "GEN_FICHA_ID", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(length = 80, nullable = false, unique = true)
    private String nomeCliente;
    @Column(length = 300)
    private int codCliente;
    @Column(nullable = false)
    private Date dataEntrega;
      @Column(length = 400)
    private String local;
    @Column(length = 400)
    private String nomeProduto;

    public fichaEntrega() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    @Override
    public String toString() {
        return nomeCliente;
    }



}