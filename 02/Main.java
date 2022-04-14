package apppessoa;
/**
 *
 * @author Rafael Dana
 */
public class Main {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.nome = "Rafael";
        pessoa.idade = 19;
        
        aniversario(pessoa);
        aniversario(pessoa);
        
        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);   
    }
    static void aniversario(Pessoa pessoa){
        pessoa.idade += 1;
    }
    
}