import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner myObj = new Scanner(System.in);

        PayPal pay = new PayPal();
        //pay.setClients();

        BoletoBancario boleto = new BoletoBancario();
        //boleto.setClients();

        CartaoCredito cartao = new CartaoCredito();
        //cartao.setClients();


        System.out.println("Digite (1): Cartão de Crédito \n");
        System.out.println("Digite (2): Boleto Bancário \n");
        System.out.println("Digite (3): Paypal \n");

        String inputOperacao = myObj.nextLine();

        if(inputOperacao.equals("1")){

         System.out.print("Digite a senha do cartao: ");
         String inputSenha = myObj.nextLine();

         System.out.print("Digite o codigo de seguranca: ");
         String inputCod = myObj.nextLine();

         System.out.print("Digite o valor: ");
         String valor = myObj.nextLine();
         Double n = Double.parseDouble(valor);

         cartao.setCodSeguranca(inputCod);
         cartao.setSenha(inputSenha);
         try {
            cartao.processarPagamento(n);
         } catch (Excecao e) {
           
            e.msg();
         }
         


        }else if(inputOperacao.equals("2")){

            System.out.println("Digite o codigo do boleto");
            String inputCod = myObj.nextLine();

            System.out.print("Digite o valor: ");
            String valor = myObj.nextLine();
            Double n = Double.parseDouble(valor);

            boleto.setCodigo(inputCod);
            
            try {
                cartao.processarPagamento(n);
             } catch (Excecao e) {
               
                e.msg();
             }
             





        }else if(inputOperacao.equals("3")){

         System.out.print("Digite o login: ");
         String inputLogin = myObj.nextLine();

         System.out.print("Digite a senha: ");
         String inputSenha = myObj.nextLine();

         System.out.print("Digite o valor: ");
         String valor = myObj.nextLine();
         Double n = Double.parseDouble(valor);

         pay.setLogin(inputLogin);
         pay.setSenha(inputSenha);
         try {
            cartao.processarPagamento(n);
         } catch (Excecao e) {
           
            e.msg();
         }
         

        }

    }
}
