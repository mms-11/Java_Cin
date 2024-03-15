public class Excecao extends Exception {
    public Excecao(String msg){

        super("pagamento nao autorizado");
    }
    public String msg(){
        return super.getMessage();
    }
    
}
