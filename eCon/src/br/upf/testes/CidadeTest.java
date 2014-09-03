/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.upf.testes;

import br.upf.controller.ControleCidade;
import br.upf.model.bean.Cidade;

/**
 *
 * @author Rodrigo
 */
public class CidadeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cidade c = new Cidade();
        ControleCidade cc = new ControleCidade();
        
        c.setNome("Veranópolis");
        c.setCep("9988779900");
        
        boolean retorno = cc.inserirCidade(c);
        
        
    }
    
}
