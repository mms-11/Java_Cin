public class BoletoBancario implements FormaDePagamento{
    private String codigo;

    public BoletoBancario(String cod){
        this.codigo = cod;
    }


    @Override
    public boolean autenticar(){
        System.out.print("digite o código do boleto");
        String inputCod = java.util.Scanner.nextLine();

        if( inputCod.equals(this.codigo) ){
            return true;
        }
        return false;
    }

    @Override
    public void processarPagamento(double valor){
        if (! this.autenticar()){
             System.out.print("Pagamento não autorizado");
        }else{
            System.out.printf("Pagamento com boleto bancário no valor ", valor, " processado com sucesso");
        }
    }

}
