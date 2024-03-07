import java.util.Scanner;

public class BoletoBancario implements FormaDePagamento{

    Scanner myObj = new Scanner(System.in);
    BoletoClient[] clientes;
    int i = 0;
    private String codigo;

   
    public void setCodigo(String cod){
        this.codigo = cod;
    }

    public void setClients(){
        clientes = new BoletoClient[10]; 
    }


    @Override
    public boolean autenticar(){
        System.out.print("digite o código do boleto");
        String inputCod = myObj.nextLine();

        clientes[i+1] = new BoletoClient(inputCod);
        i = i +1;

        for(int j = 0; j < i; j++){ // procurar no vetor clientes
            if(clientes[j].getCodigo().equals(inputCod)){
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
            System.out.printf("Pagamento com boleto bancário no valor ", valor, " processado com sucesso");
        }
    }

}
