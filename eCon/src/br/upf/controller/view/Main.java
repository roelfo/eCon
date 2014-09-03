package br.upf.controller.view;

import br.upf.view.MainForm;
import javax.swing.JFrame;

public class Main extends JFrame {

    public static void main(String[] args) {
        MainForm mainForm = new MainForm();
        mainForm.setTitle("Sistema de gestão e controle de estoque");
        mainForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainForm.setExtendedState(MAXIMIZED_BOTH);
        mainForm.setLocationRelativeTo(null);
        mainForm.setVisible(true);

    }
}
