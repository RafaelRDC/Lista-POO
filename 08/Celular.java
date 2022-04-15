package com.mycompany.appcelular;

import java.util.Scanner;

/**
 *
 * @author Rafael Dana
 */
public class Celular {
    Scanner teclado = new Scanner(System.in);
    public void Celular() {
        
        
        /*Exemplo de celulares*/
        Bateria celular1 = new Bateria();
        celular1.nome = ("Celular 1");
        celular1.capacidade = (20);
        celular1.capacidadeIn = (20);
        celular1.carga = (100);
        
        Bateria celular2 = new Bateria();
        celular2.setNome("Celular 2");
        celular2.setCapacidade(15);
        celular2.capacidadeIn = (15);
        celular2.setCarga(100);
        
        /*Utilizando o celular*/
        int celular;
        System.out.println("Qual celular deseja usar? 1 ou 2: ");
        celular = teclado.nextInt();
        switch(celular){
            case 1:
                UsarCelular(celular1);
            case 2:
                UsarCelular(celular2);
        }
    }
    public void Mensagem(Bateria celular){
        String mensagem;
        System.out.println("Insira a mensagem: ");
        mensagem = teclado.next();
        celular.capacidade -= 1;
    }
    public void Ligacao(Bateria celular){
        long tempoInicial = System.currentTimeMillis();
        int tempoLigacao;
        String desliga;
        System.out.println("Aperte qualquer botao para desligar ");
        desliga = teclado.next();
        tempoLigacao =(int)((System.currentTimeMillis() - tempoInicial)/1000);
        System.out.println("A ligacao durou " +tempoLigacao+" segundos");
        celular.capacidade -= (tempoLigacao/5);    
    }
    public void VerificarCarga(Bateria celular){
        celular.carga = ((celular.capacidade*100)/celular.capacidadeIn);
        System.out.println("\nAinda restam "+celular.carga+"% de bateria!");
    }
    public void UsarCelular(Bateria celular){
        int i = 0;
        while(true){
            int acao;
            System.out.println("1 - Fazer Ligacao\n2 - Enviar Mensagem\n3 - Verificar Carga\n4 - Desligar");
            acao = teclado.nextInt();
            switch(acao){
                case 1:
                    Ligacao(celular);
                case 2:
                    Mensagem(celular);
                case 3:
                    VerificarCarga(celular);
                case 4:
                    System.exit(0);;
            }
            i++;            
        }  
    }
}