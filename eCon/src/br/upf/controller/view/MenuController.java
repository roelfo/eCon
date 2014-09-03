/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.controller.view;

import br.upf.model.bean.Cidade;
import br.upf.view.FormCidade;
import br.upf.view.SobreDlg;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class MenuController {

    public void Sair(JFrame tela) {
        int val = JOptionPane.showConfirmDialog(tela, "Deseja sair do sistema?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (val == 0) {
            tela.dispose();
        }
    }

    public void MostraSobre(JFrame tela) {
        SobreDlg dlg = new SobreDlg(tela, true);
        dlg.setLocationRelativeTo(null);
        dlg.setSize(300, 330);
        dlg.setVisible(true);
        dlg.toFront();
    }
    
    public void CadastrarCidade(){
        Cidade cidade = new Cidade();
        FormCidade formCidade = new FormCidade(cidade);
        formCidade.setLocationRelativeTo(null);
        formCidade.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        formCidade.setResizable(false);
        formCidade.setTitle("Cadastrar Nova Cidade");
        formCidade.setVisible(true);
    }
}
