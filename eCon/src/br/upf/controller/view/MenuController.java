/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.controller.view;

import br.upf.model.bean.Cidade;
import br.upf.model.bean.Cliente;
import br.upf.model.bean.Fornecedor;
import br.upf.model.bean.Produto;
import br.upf.view.FormCidade;
import br.upf.view.FormCliente;
import br.upf.view.FormFornecedores;
import br.upf.view.FormProdutos;
import br.upf.view.ListCidades;
import br.upf.view.ListClientes;
import br.upf.view.ListFornecedores;
import br.upf.view.ListProdutos;
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

    public void CadastrarCidade() {
        Cidade cidade = new Cidade();
        FormCidade formCidade = new FormCidade(cidade);
        formCidade.setLocationRelativeTo(null);
        formCidade.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        formCidade.setResizable(false);
        formCidade.setTitle("Cadastrar Nova Cidade");
        formCidade.setVisible(true);
    }

    public void editarCidade(Cidade c, ListCidades list) {
        Cidade cidade = c;
        FormCidade formCidade = new FormCidade(cidade, list);
        formCidade.setLocationRelativeTo(null);
        formCidade.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        formCidade.setResizable(false);
        formCidade.setTitle("Editar Cidade");
        formCidade.setVisible(true);
    }

    public void ListaCidades() {
        ListCidades lista = new ListCidades();
        lista.setTitle("Cidades Cadastradas");
        lista.setLocationRelativeTo(null);
        lista.setResizable(false);
        lista.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        lista.setVisible(true);
        lista.toFront();
    }

    public void CadastrarFornecedor() {
        Fornecedor fornecedor = new Fornecedor();
        FormFornecedores form = new FormFornecedores(fornecedor);
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        form.setResizable(false);
        form.setTitle("Cadastrar Fornecedor");
        form.setVisible(true);
    }

    public void editarFornecedor(Fornecedor f, ListFornecedores list) {
        FormFornecedores form = new FormFornecedores(f, list);
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        form.setResizable(false);
        form.setTitle("Editar Fornecedor");
        form.setVisible(true);
    }
    
    public void listarFornecedores() {
        ListFornecedores listF = new ListFornecedores();
        listF.setLocationRelativeTo(null);
        listF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        listF.setResizable(false);
        listF.setTitle("Lista de Fornecedor");
        listF.setVisible(true);
    }
    
    public void CadastrarCliente() {
        Cliente c = new Cliente();
        FormCliente form = new FormCliente(c);
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        form.setResizable(false);
        form.setTitle("Cadastrar Cliente");
        form.setVisible(true);
    }
    
    public void ListarClientes() {
        ListClientes list = new ListClientes();
        list.setLocationRelativeTo(null);
        list.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        list.setResizable(false);
        list.setTitle("Lista de Cliente");
        list.setVisible(true);
    }
    
    public void EditarCliente(Cliente cli, ListClientes list) {
        FormCliente form = new FormCliente(cli, list);
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        form.setResizable(false);
        form.setTitle("Editar Cliente");
        form.setVisible(true);
    }
    
    public void cadastrarProduto() {
        Produto p = new Produto();
        FormProdutos form = new FormProdutos(p);
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        form.setResizable(false);
        form.setTitle("Cadastrar Produto");
        form.setVisible(true);
    }
    
    public void listarProduto() {
        ListProdutos list = new ListProdutos();
        list.setLocationRelativeTo(null);
        list.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        list.setResizable(false);
        list.setTitle("Lista de produtos");
        list.setVisible(true);
    }
    
    public void editarProduto(Produto p, ListProdutos list) {
        FormProdutos form = new FormProdutos(p, list);
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        form.setResizable(false);
        form.setTitle("Lista de Produtos");
        form.setVisible(true);
    }
}
