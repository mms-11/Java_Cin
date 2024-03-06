import java.util.Scanner;
public class CartaoCredito implements FormaDePagamento {
    private String senha; //atributos privados
    private String codSeguranca;

    public CartaoCredito(String senha, String valor){//construtos
        this.senha = senha;
        this.codSeguranca = valor;
    }

    //implementar metodos com override
    @Override
    public boolean autenticar(){

        System.out.print("digite a senha");
        String inputSenha = java.util.Scanner.nextLine();

        System.out.print("digite o código de segurança");
        String inputCod = java.util.Scanner.nextLine();

        if(inputSenha.equals(this.senha) && inputCod.equals(this.codSeguranca) ){
            return true;
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
