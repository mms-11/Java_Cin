public class Banco {
    private RepositorioContas repositorio;
   
    private double taxa = 0.01;

    public Banco(RepositorioContas repositorio){//construtor

        this.repositorio = repositorio; //banco tem 10 contas
        
    }

    public void cadastrarConta(ContaAbstrata c){
        if (!repositorio.existe(c.getNumero())) {
            repositorio.inserir(c);
        } else {
            System.out.println("Conta já existe.");
        }
    }

    public ContaAbstrata acharConta(String numero){
       return repositorio.procurar(numero);
    }
    public void debitarConta(String n,double valor){
       ContaAbstrata c = repositorio.procurar(n);
       if(c != null){
        c.debitar(valor);
        repositorio.atualizar(c);
       }else{
        System.out.println("conta nao encontrada");
       }
    }

    public void creditarConta(String n,double valor){
        ContaAbstrata c = repositorio.procurar(n);
        if(c != null){
         c.creditar(valor);
         repositorio.atualizar(c);
        }else{
         System.out.println("conta nao encontrada");
        }
    }

    public void transferir(String contaOrigem, String contaDestino, double valor) {
        ContaAbstrata origem = repositorio.procurar(contaOrigem);
        ContaAbstrata destino = repositorio.procurar(contaDestino);
        if (origem != null && destino != null) {
            origem.debitar(valor);
            destino.creditar(valor);
            repositorio.atualizar(origem);
            repositorio.atualizar(destino);
        } else {
            System.out.println("Uma das contas não foi encontrada.");
        }
    }
  
    public void renderJuros(String numero) {
        ContaAbstrata c = repositorio.procurar(numero);
        if (c instanceof Poupanca) {
            ((Poupanca) c).renderJuros(taxa);
            repositorio.atualizar(c);
        } else {
            System.out.println("Conta não é uma poupança.");
        }
    }
  
    public void renderBonus(String numero) {
        ContaAbstrata c = repositorio.procurar(numero);
        if (c instanceof ContaEspecial) {
            ((ContaEspecial) c).renderBonus();
            repositorio.atualizar(c);
        } else {
            System.out.println("Conta não é uma conta especial.");
        }
    }
    public ContaAbstrata procurarConta(String numero){
        return repositorio.procurar(numero);
    }
}

