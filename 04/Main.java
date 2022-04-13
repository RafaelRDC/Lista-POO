/**
 *
 * @author Rafael Dana
 */
public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa();
        
        casa.cor = "Vermelho";
        casa.cor = "Verde";
        
        casa.porta1 = true;
        casa.porta2 = true;
        casa.porta3 = true;
        casa.porta2 = false;
        
        quantasPortasEstaoAbertas(casa);
    }
    static void quantasPortasEstaoAbertas(Casa casa){
        int portasAbertas = 0;
        if(casa.porta1 == true){
            portasAbertas += 1;
        } 
        if(casa.porta2 == true){
                portasAbertas += 1;
        }
        if(casa.porta3 == true){
                portasAbertas += 1;
        }
        System.out.println(portasAbertas + " porta(s)");
    }
    
}