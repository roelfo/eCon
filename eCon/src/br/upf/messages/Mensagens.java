package br.upf.messages;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Mensagens {

    JFrame tela;

    public Mensagens(JFrame tela) {
        this.tela = tela;
    }

    public void infoMessage(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(tela, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    public Integer AskMessage(String mensagem, String titulo) {
        return JOptionPane.showConfirmDialog(tela, mensagem, titulo, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

    public void errorMessage(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(tela, mensagem, titulo, JOptionPane.ERROR_MESSAGE);
    }

    public void warningMessage(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(tela, mensagem, titulo, JOptionPane.WARNING_MESSAGE);
    }

    public void sucessoInsert() {
        infoMessage("Dados inseridos com sucesso", "Insert");
    }
 
    public void falhaInsert() {
        errorMessage("Os dados não foram inseridos.", "Erro de insert");
    }
    
    public void camposNaoPreenchidos() {
        infoMessage("Existem campos não preenchidos\n Favor verificar", "Erro de validação");
    }
    
    public void erroExcluir() {
        infoMessage("Erro ao excluir", "Erro");
    }
    
    public void sucessoExcluir() {
        infoMessage("Sucesso, ecluido com sucesso", "Erro");
    }
    
    public Integer questionExcluir() {
        return AskMessage("Deseja mesmo excluir?", "Confirmação");
    }
    
    public void exceptionDB(String exception) {
        JOptionPane.showMessageDialog(tela, "Ocorreu uma excessão no Banco de dados \n"+exception, "Exception", JOptionPane.ERROR_MESSAGE);
    }
}
