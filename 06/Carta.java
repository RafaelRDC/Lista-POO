package com.mycompany.appcarta;
/**
 *
 * @author Rafael Dana
 */
public class Carta {
    String nome;
    String naipe;

    public void defNome(String nome) {
        this.nome = nome;
    }
    public void defNaipe(String naipe) {
        this.naipe = naipe;
    }     
    public String pegaNome() {
        return nome;
    }
    public String pegaNaipe() {
        return naipe;
    }    
}