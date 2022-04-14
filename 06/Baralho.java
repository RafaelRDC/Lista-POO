package com.mycompany.appcarta;

import java.util.*;

/**
 *
 * @author Rafael Dana
 */
public class Baralho {
        private final List<Carta> listaCartas;

    public Baralho() {
        listaCartas = new ArrayList<>();

        String[] naipes = {"Paus", "Ouros", "Copas", "Espadas"};
        int cont = 0;
        Carta carta;

        while (cont < 4) {
            carta = new Carta();
            carta.defNome("As");
            carta.defNaipe(naipes[cont]);
            listaCartas.add(carta);
            
            for (int i = 2; i <= 10; i++) {
                carta = new Carta();
                carta.defNome(i + "");
                carta.defNaipe(naipes[cont]);

                listaCartas.add(carta);
            }

            carta = new Carta();
            carta.defNome("Valete");
            carta.defNaipe(naipes[cont]);
            listaCartas.add(carta);
            carta = new Carta();
            carta.defNome("Dama");
            carta.defNaipe(naipes[cont]);
            listaCartas.add(carta);
            carta = new Carta();
            carta.defNome("Rei");
            carta.defNaipe(naipes[cont]);
            listaCartas.add(carta);

            cont++;
        }
    }
    
    public void printBaralhoEmOrdem(){
        StringBuilder baralho = new StringBuilder();
        
        listaCartas.forEach((carta) -> {
            baralho.append(carta.pegaNome()).append(" de ").append(carta.pegaNaipe()).append("\n");
        });
        
        System.out.println(baralho.toString());
    }
}