import java.util.Scanner;
/**
 *
 * @author Rafael Dana
 */
public class Main {
    static void botaoligarDesligar(Televisao tv){
        if (tv.ligada == null){tv.ligada = true;return;}
        if (tv.ligada == true){tv.ligada = false;return;}
        if (tv.ligada == false){tv.ligada = true;return;}
    }
    static void mudarCanal(Televisao tv){
        Scanner teclado = new Scanner(System.in);
        System.out.println("qual o canal desejado?: "); 
        tv.canal = teclado.nextInt();
        verificar:
        if (tv.canal >99 || tv.canal<0){
            System.out.println("Os canais so vao de 0 a 99 escolha outro: "); 
            tv.canal = teclado.nextInt();
            if (tv.canal <=99 && tv.canal>=0){break verificar;}
        }
    }
    static void canalAnterior(Televisao tv){
        tv.canal -= 1;
        verificar:
        if (tv.canal >99 || tv.canal<0){ 
            if (tv.canal >=99){
                tv.canal = 99;
                break verificar;
            }
            if (tv.canal <= 0){
                tv.canal = 0;
                break verificar;
            }
        }
    }
    static void proximoCanal(Televisao tv){
        tv.canal += 1;
        verificar:
        if (tv.canal >99 || tv.canal<0){ 
            if (tv.canal >= 99){
                tv.canal = 99;
                break verificar;
            }
            if (tv.canal <= 0){
                tv.canal = 0;
                break verificar;
            }
        }
    }
    static void botaoSilenciarDesilenciar(Televisao tv){
        if (tv.silencioso == null){tv.silencioso = true;return;}
        if (tv.silencioso == true){tv.silencioso = false;return;}
        if (tv.silencioso == false){tv.silencioso = true;return;}
    }
    
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        
        botaoligarDesligar(tv);
        botaoligarDesligar(tv);
        
        mudarCanal(tv);
        proximoCanal(tv);
        canalAnterior(tv);
        
        botaoSilenciarDesilenciar(tv);
        botaoSilenciarDesilenciar(tv);
        
        System.out.println("Estado: ");
        if (tv.ligada == true){System.out.println("ligada");}else{System.out.println("desligada");}
        System.out.println("Canal:\n"+ tv.canal);
        System.out.println("Silenciada/Desilenciada: ");
        if (tv.silencioso == true){System.out.println("silenciada");}else{System.out.println("com som!!");}
    }
    
}
