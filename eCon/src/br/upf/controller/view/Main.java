package br.upf.controller.view;

import br.upf.view.LoginPanel;
import br.upf.view.MainForm;
import javax.swing.JFrame;

public class Main extends JFrame {

    public static void main(String[] args) {
        new Main().loginPanel();
    }

    public void loginPanel() {
        LoginPanel login = new LoginPanel();
        login.setTitle("Efetue Login");
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

    public void principal() {
        MainForm mainForm = new MainForm();
        mainForm.setTitle("Sistema de gestão e controle de estoque");
        mainForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainForm.setExtendedState(MAXIMIZED_BOTH);
        mainForm.setLocationRelativeTo(null);
        mainForm.setVisible(true);
    }
}
