/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.testes;

/**
 *
 * @author Rodrigo
 */
public class ramdom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            double loteria = Math.random() * 100;
            System.out.println(Math.round(loteria));
        }
    }

}
