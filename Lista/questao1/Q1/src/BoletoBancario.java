import java.util.Scanner;

public class BoletoBancario implements FormaDePagamento{

    Scanner myObj = new Scanner(System.in);
    
    int i = 2;
    private String codigo;

   
   
    public void setCodigo(String cod){
        this.codigo = cod;
    }

    
    BoletoClient clientes[] = new BoletoClient[]{
        new BoletoClient("123"),
        new BoletoClient("1234"),
    };

    @Override
    public boolean autenticar(){
        System.out.print("digite o código do boleto");
        String inputCod = myObj.nextLine();

        //clientes[i+1] = new BoletoClient(inputCod);
        //i = i +1;

        for(int j = 0; j < i; j++){ // procurar no vetor clientes
            if(clientes[j].getCodigo().equals(inputCod)){
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
