package com.mycompany.appagenda;
import java.util.Scanner;
/**
 *
 * @author Rafael Dana
 */
public class Agenda {
    Scanner teclado = new Scanner(System.in);
    Contato[] contatos = new Contato[100];
    Contato contato = new Contato();
    
    public void newContato(){
        for (int i = 0; !"-".equals(contato.nome); i++){
            System.out.println("Nome: ");
            contato.nome = teclado.next();
            if ("-".equals(contato.nome)){
                break;
            }
            System.out.println("Idade: ");
            contato.idade = teclado.next();
            System.out.println("Telefone: ");
            contato.telefone = teclado.next();
            contatos[i] = contato;
            Contato contato = new Contato();
        }
    }



}