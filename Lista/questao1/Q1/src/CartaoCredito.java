import java.util.Scanner;

public class CartaoCredito implements FormaDePagamento {

    Scanner myObj = new Scanner(System.in);
    CartaoClient[] cartaoClients;
    int i = 0;

    private String senha; //atributos privados
    private String codSeguranca;

    public void setSenha(String senha){//construtos
        this.senha = senha;
    }
    public void setCodSeguranca(String cod){//construtos
        this.codSeguranca = cod;
    }
    public void setClients(){//construtos
        cartaoClients = new CartaoClient[10];
    }

    //implementar metodos com override
    @Override
    public boolean autenticar(){

        System.out.print("digite a senha");
        String inputSenha = myObj.nextLine();

        System.out.print("digite o código de segurança");
        String inputCod = myObj.nextLine();

        cartaoClients[i+1] = new CartaoClient(inputSenha, inputCod);
        i = i+1;


        // Loop through existing clients to check authentication
        for (int j = 0; j < i; j++) {
            if (cartaoClients[j].getSenha().equals(this.senha) && cartaoClients[j].getCodSeguranca().equals(this.codSeguranca)) {
                return true;
            }
        }
        return false;
    }

       
    

    @Override
    public void processarPagamento(double valor){
        if (! this.autenticar()){
             System.out.print("Pagamento não autorizado");
        }else{
            System.out.printf("Pagamento com cartão de crédito no valor ", valor, " processado com sucesso");
        }
    }
}
