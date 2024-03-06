public class PayPal implements FormaDePagamento{
    private String login;
    private String senha;

    public PayPal(String login, String senha){//construtos
        this.senha = senha;
        this.login = login;
    }


    @Override
    public boolean autenticar(){

        
        System.out.print("digite o login");
        String inputLogin = java.util.Scanner.nextLine();

        System.out.print("digite a senha");
        String inputSenha = java.util.Scanner.nextLine();

        if(inputSenha.equals(this.senha) && inputLogin.equals(this.login) ){
            return true;
        }
        return false;
    }
    @Override
    public void processarPagamento(double valor){
        if (! this.autenticar()){
             System.out.print("Pagamento não autorizado");
        }else{
            System.out.printf("Pagamento com PayPal no valor ", valor, " processado com sucesso");
        }
    }
}
