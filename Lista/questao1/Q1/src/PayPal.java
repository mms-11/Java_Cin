import java.util.Scanner;

public class PayPal implements FormaDePagamento{

    Scanner myObj = new Scanner(System.in);
    private String login;
    private String senha;
    private PayPalClient[] clientes; // vetor para clientes
    private int i = 0; // contador da posicao atual de clientes
    
    // Constructor
   

    public void setLogin(String login){
        this.login = login;
    }
    public void setSenha(String s){
        this.senha = s;
    }
    public void setClients(){
        clientes = new PayPalClient[10]; 
    }


    @Override
    public boolean autenticar() {
        System.out.print("Digite o login: ");
        String inputLogin = myObj.nextLine();

        System.out.print("Digite a senha: ");
        String inputSenha = myObj.nextLine();

        clientes[i+1] = new PayPalClient(inputLogin, inputSenha);
        i = i+1;


        // Loop through existing clients to check authentication
        for (int j = 0; j < i; j++) {
            if (clientes[j].getSenha().equals(this.senha) && clientes[j].getLogin().equals(this.login)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void processarPagamento(double valor) {
        if (!autenticar()) {
            System.out.println("Pagamento não autorizado");
        } else {
            System.out.printf("Pagamento com PayPal no valor %.2f processado com sucesso\n", valor);
        }
    }
}
