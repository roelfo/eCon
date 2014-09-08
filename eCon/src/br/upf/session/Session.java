
package br.upf.session;

import br.upf.model.bean.Usuario;
//Classe singleton para criação de uma sessão, controle de usuário.
public class Session {
    private static Session instance;
    private Usuario user;

    public Session() {
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    public static Session getInstance(){
        if(instance == null){
            instance = new Session();
        }
        return instance;
    }
    
    public void clearSession(){
        instance = new Session();
    }
}
