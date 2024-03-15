import java.util.Scanner;

public class CartaoCredito implements FormaDePagamento {

    Scanner myObj = new Scanner(System.in);
    //CartaoClient[] cartaoClients;
    int i = 2;

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

    CartaoClient[] cartaoClients = new CartaoClient[]{
        new CartaoClient("123", "abc"),
        new CartaoClient("1234", "abcd"),

    };

    //implementar metodos com override
    @Override
    public boolean autenticar(){

        System.out.print("digite a senha");
        String inputSenha = myObj.nextLine();

        System.out.print("digite o código de segurança");
        String inputCod = myObj.nextLine();

        //cartaoClients[i+1] = new CartaoClient(inputSenha, inputCod);
        //i = i+1;


        // Loop through existing clients to check authentication
        for (int j = 0; j < i; j++) {
            if (cartaoClients[j].getSenha().equals(inputSenha) && cartaoClients[j].getCodSeguranca().equals(inputCod)) {
                return true;
            }
        }
        return false;
    }

       
    

    @Override
    public void processarPagamento(double valor) throws Excecao {
        if (!autenticar()) {
            throw new Excecao("Pagamento não autorizado");
           
        }  
            System.out.printf("Pagamento com PayPal no valor %.2f processado com sucesso\n", valor);
        
    }
}
