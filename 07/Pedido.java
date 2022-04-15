package com.mycompany.appmercado2;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author Rafael Dana
 */
public class Pedido {
    Scanner teclado = new Scanner(System.in);
    public ArrayList<Produto> produtos;
    Produto[] pedidos = new Produto[3];
    int quantidadePedido;
    String nomePedido;
    String item;
    String pagamento;
    int defPagamento;
    String metodoPag;
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
        produto.defPreco(6);
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
    public String getNomePedido() {
        return nomePedido;
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
        Produto pedido;
        String item;
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
                    pedido = new Produto();
                    pedido.nome = (getNome(cod));
                    pedido.preco = getPreco(cod);
                    pedido.qntFinal = quantidadePedido;
                    pedidos[i]= pedido;
                    if (i+1<pedidos.length){}else{break;}
                    System.out.println("Selecione o numero do produto que deseja adicionar: ");
                    item = teclado.next();                    
                }else{break;}
            }
        System.out.println("Selecione o pagamento:\n1 - Cartao\n2 - Dinheiro\n3 - Cheque\n");
        defPagamento = teclado.nextInt();
        switch(defPagamento){
            case 1:
                metodoPag = "Cartao";
                break;
            case 2:
                metodoPag = "Dinheiro";
                break;
            case 3:
                metodoPag = "Cheque";
                break;   
        }
        
        }else{System.exit(0);}
    }
    public void imprimirLista(){
        System.out.println("Pagamento em "+metodoPag);
        System.out.println("Carrinho:\n");
        try{
            
            for(int i = 0; i < pedidos.length; i++){
                System.out.println(pedidos[i].nome+" | "+pedidos[i].qntFinal+" unidades"+" | preco: R$"+(pedidos[i].preco)*pedidos[i].qntFinal);
            }
            
        }catch(NullPointerException e){System.exit(0);}
    }  
}