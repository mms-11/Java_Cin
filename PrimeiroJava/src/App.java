





public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("123");
       
        c1.setSaldo(30);

        String numero = c1.getNumero();
        double saldo = c1.getSaldo();


        System.out.printf("%.2f é o saldo%n", saldo);

        RepositorioContas repositorio = new RepContasArray();

        Banco banco = new Banco(repositorio);
    
        ContaAbstrata contaEspecial = new ContaEspecial("21.342-7");
        ContaAbstrata poupanca = new Poupanca("32.234-4");
        ContaAbstrata conta = new Conta("47.465-2");
        
        banco.cadastrarConta(contaEspecial);
        banco.cadastrarConta(poupanca);
        banco.cadastrarConta(conta);
    
        banco.creditarConta("21.342-7", 200.00);
        banco.creditarConta("32.234-4", 200.00);
        banco.creditarConta("47.465-2", 200.00);
        banco.debitarConta("21.342-7", 100.00);
        banco.debitarConta("32.234-4", 100.00);
        banco.debitarConta("47.465-2", 100.00);
  
        banco.renderJuros("32.234-4"); // Só terá efeito se a conta for de poupança
        banco.renderBonus("21.342-7"); // Só terá efeito se a conta for especial
    
        banco.transferir("32.234-4", "47.465-2", 50);
        System.out.println("Saldo da conta 21.342-7 = " + banco.procurarConta("21.342-7").getSaldo());
        System.out.println("Saldo da conta 32.234-4 = " + banco.procurarConta("32.234-4").getSaldo());
        System.out.println("Saldo da conta 47.465-2 = " + banco.procurarConta("47.465-2").getSaldo());

    }
}
