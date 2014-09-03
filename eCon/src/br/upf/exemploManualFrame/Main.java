/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.exemploManualFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Rodrigo
 */
public class Main extends JFrame{

    JLabel l;

    public void start() {
        l = new JLabel();
        l.setText("Name: ");
        JTextField txt = new JTextField();
        txt.setText("Anurag jain(csanuragjain)");
        JPasswordField ps = new JPasswordField(10);
        JButton but = new JButton();
        but.setText("Submit");
        add(l);
        add(txt);
        add(ps);
        add(but);
        but.addActionListener(
                new ActionListener() {
                    public void actionPerformed(
                            ActionEvent e) {
                                l.setText("Button clicked");
                            }
                }
        );
        setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new Main().start();
    }

}
