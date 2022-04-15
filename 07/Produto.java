package com.mycompany.appmercado2;
/**
 *
 * @author Rafael Dana
 */
public class Produto {
    String nome;
    double preco;
    int qntEstoque;
    int qntFinal;

    public void defNome(String nome) {
        this.nome = nome;
    }
    public void defPreco(double preco) {
        this.preco = preco;
    }
    public void defQntEstoque(int qntEstoque) {
        this.qntEstoque = qntEstoque;
    } 
    public void defQntPedido(int qntFinal) {
        this.qntFinal = qntFinal;
    }
    public String pegaNome() {
        return nome;
    }
    public String pegaPreco() {
        return Double.toString(preco);
    }
    public String pegaQntEstoque() {
        return Integer.toString(qntEstoque);
    }
}