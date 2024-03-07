public class PayPalClient {
    private String login,senha;

    public PayPalClient(String l, String s){
        this.login = l;
        this.senha = s;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha(){
        return this.senha;
    }
    
}
