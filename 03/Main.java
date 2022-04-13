/**
 *
 * @author Rafael Dana
 */
public class Main {
    
    public static void main(String[] args) {
        Porta porta = new Porta();
        
        porta.cor = "vermelho";
        porta.cor = "verde";
        porta.cor = "amarelo";
        
        porta.tamanho = 1.0;
        porta.tamanho = 2.0;
        porta.tamanho = 3.0;
        
        porta.aberta = true;
        porta.aberta = false;
        porta.aberta = true;

        
        System.out.println("Cor: "+porta.cor);
        System.out.println("Tamanho: "+porta.tamanho+'m');
        System.out.println("Estado: ");
        estaAberta(porta);
        
 
    }
    static void estaAberta(Porta porta){
        if (porta.aberta == true){
            System.out.println("Esta aberta!!");
        }else{
            System.out.println("Esta fechada!!");
        }
    }

}