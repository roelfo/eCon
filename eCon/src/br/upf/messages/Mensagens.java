package br.upf.messages;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Mensagens {

    public void infoMessage(JFrame tela, String mensagem, String titulo) {
        JOptionPane.showMessageDialog(tela, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public Integer AskMessage(JFrame tela, String mensagem, String titulo){
        return JOptionPane.showConfirmDialog(tela, mensagem, titulo, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }
    
    public void errorMessage(JFrame tela, String mensagem, String titulo) {
        JOptionPane.showMessageDialog(tela, mensagem, titulo, JOptionPane.ERROR_MESSAGE);
    }
    
    public void warningMessage(JFrame tela, String mensagem, String titulo) {
        JOptionPane.showMessageDialog(tela, mensagem, titulo, JOptionPane.WARNING_MESSAGE);
    }
}
