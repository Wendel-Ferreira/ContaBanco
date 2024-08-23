
package contabanco;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ContaBanco {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaTerminal cliente = new ContaTerminal();
        
        System.out.println("Por Favor,digite o número !");
        cliente.setNumero(sc.nextInt());
        
        System.out.println("Por Favor, Digite o número da Agencia");
        cliente.setAgencia(sc.next());
        
        System.out.println("Por Favor, Qual seu nome?");
        cliente.setNomeCliente(sc.next());
        
       System.out.println("Qual é seu saldo atual?");
       cliente.setSaldo(sc.nextDouble());
        
        System.out.println("Olá " + cliente.getNomeCliente() + ",obrigado por criar uma conta em nosso banco"
                + ",sua agência é " + cliente.getAgencia() + ",conta" + cliente.getNumero() + "e seu saldo " + 
                cliente.getSaldo() + "Já está disponivel para saque");
        
        sc.close();

        
    }
    
}
