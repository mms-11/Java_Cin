public class Tablet extends ProdutoEletronico {
    public Tablet(String modelo, int anoLancamento, double preco, String sistemaOperacional, int quantidadeDisponivel){
        super(modelo,anoLancamento,preco,sistemaOperacional,quantidadeDisponivel);
    }
    @Override
    public void exibirInformacoes(){
        
        if(this.getQuantidade() <= 0){
            System.out.println("Não há mais estoque de "+ this.getModelo());
        }else{
            System.out.println("Tablet: "+ this.getModelo());
            System.out.println("Ano de Lançamento: "+ this.getAno());
            System.out.println("Preço: "+ this.getPreco());
            System.out.println("Sistema Operacional: "+ this.getSO()); 
            System.out.println("----------------------------------------------------------");
        }

    }
}

