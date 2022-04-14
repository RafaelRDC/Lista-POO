package com.mycompany.appmercado2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Rafael Dana
 */
public class Pedido {
    Scanner teclado = new Scanner(System.in);
    public ArrayList<Produto> produtos;
    public List<Pedido> pedidos;
    int quantidadePedido;
    String item;
    public Pedido() {
        produtos = new ArrayList<>();
        Produto produto;
        
        /*Exemplo lista de produtos no estoque:*/
        produto = new Produto();
        produto.defNome("Tomate");
        produto.defPreco(5.5);
        produto.defQntEstoque(20);
        produtos.add(produto);
        
        produto = new Produto();
        produto.defNome("Saco de Arroz");
        produto.defPreco(13.5);
        produto.defQntEstoque(70);
        produtos.add(produto);
        
        produto = new Produto();
        produto.defNome("Batata");
        produto.defPreco(5.5);
        produto.defQntEstoque(130);
        produtos.add(produto);   
    }
    public void defQntPedido(int quantidadePedido) {
        this.quantidadePedido = quantidadePedido;
    }
    public void defNomePedido(String item) {
        this.item = item;
    }
    public Integer getQntPedido() {
        return quantidadePedido;
    }
    public String getNome(int i) {
        return produtos.get(i).nome;
    }   
    public Double getPreco(int i) {
        return produtos.get(i).preco;
    }
    public Integer getQntEstoque(int i) {
        return produtos.get(i).qntEstoque;
    }
    public void fazerPedido(){
        Pedido pedido;
        String item;
        pedidos = new ArrayList<>();
        for(int i = 0; i < produtos.size(); i++){System.out.println(i+" - "+getNome(i)+" | R$"+getPreco(i));}        
        System.out.println("Selecione o numero do produto que deseja adicionar: ");
        item = teclado.next();
        if (!"x".equals(item)){
            int cod = Integer.parseInt(item);
            for (int i = 0; !"x".equals(cod); i++){
                if (!"x".equals(item)){
                    cod = Integer.parseInt(item);
                    System.out.println("Quantas unidades: ");
                    quantidadePedido = teclado.nextInt();
                    Verificar:
                    if(quantidadePedido>produtos.get(cod).qntEstoque){System.out.println("Quantidade acima do estoque, escolha a nova quantidade: ");quantidadePedido = teclado.nextInt();}else{break Verificar;}
                    pedido = new Pedido();
                    pedido.defNomePedido(getNome(cod));
                    pedido.defQntPedido(cod);
                    pedidos.add(pedido);
                    System.out.println("Selecione o numero do produto que deseja adicionar: ");
                    item = teclado.next();
                }else{break;}
            }
        }else{System.exit(0);}
    }
    public void imprimirLista(){
        System.out.println("Lista de compras:\n");
        for(int i = 0; i < pedidos.size(); i++){
            System.out.println(getNome(i)+" | "+getQntPedido()+" unidades"+" | preco: R$"+getPreco(i)*getQntPedido()+"\n");
        }

    }
    
}
