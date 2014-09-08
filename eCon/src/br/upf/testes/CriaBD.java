/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.testes;

import br.upf.JPA.EntityManagerUtil;
import br.upf.JPA.controller.CidadeJPA;
import br.upf.JPA.controller.NivelUserJPA;
import br.upf.JPA.controller.UsuarioJPA;
import br.upf.model.bean.Cidade;
import br.upf.model.bean.NivelAdmin;
import br.upf.model.bean.Usuario;
import br.upf.security.Encrypt;
import javax.persistence.EntityManager;

/**
 *
 * @author Rodrigo
 */
public class CriaBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        Cidade c = new Cidade();
        c.setNome("Admin");
        c.setCep("00000000");
        new CidadeJPA().persistirCidade(c);
        
        NivelAdmin nivel = new NivelAdmin();
        nivel.setNome("Administrador");
        nivel.setDescricao("Gerencia o sistema");
        new NivelUserJPA().inserirNivel(nivel);
        
        Usuario u = new Usuario();
        u.setNome("admin");
        u.setEndereco("Rua");
        u.setCidade(new CidadeJPA().buscaID(1).get(0));
        u.setNivelUser(new NivelUserJPA().findByID(1).get(0));
        u.setSenha(Encrypt.encrypt("admin"));
        u.setTipo("CPF");
        u.setDocumento("0000000000");
        u.setFone("0000000000");
        
        new UsuarioJPA().inserir(u);
        
    }

}
