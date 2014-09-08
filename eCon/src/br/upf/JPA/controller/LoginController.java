
package br.upf.JPA.controller;

import br.upf.JPA.EntityManagerUtil;
import br.upf.messages.Mensagens;
import br.upf.model.bean.Usuario;
import br.upf.security.Encrypt;
import br.upf.session.Session;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class LoginController {
    private EntityManager em;

    public LoginController() {
        em = EntityManagerUtil.getEntityManager();
    }
    
    public Integer login(String usuario, String senha){
        String senhaMD5 = Encrypt.encrypt(senha);
        String hql = "from Usuario where nome = :nome and senha = :senha";
        
        Query query = em.createQuery(hql);
        query.setParameter("nome", usuario);
        query.setParameter("senha", senhaMD5);
        
        List<Usuario> lista = query.getResultList();
        
        if(lista.size() > 0){
            Session.getInstance().setUser(lista.get(0));
            new Mensagens(null).infoMessage("Bem vindo ao Sistema", "Logado");
            return 1;
        } else {
            new Mensagens(null).errorMessage("Erro de login\nCheque suas credenciais", "Erro de login");
            return 0;
        }
    }
}