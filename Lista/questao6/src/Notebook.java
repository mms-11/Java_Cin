public class Notebook extends ProdutoEletronico {
    private boolean isTouchScreen;
    public Notebook(String modelo, int anoLancamento, double preco, String sistemaOperacional, int quantidadeDisponivel,boolean flag){
        super(modelo,anoLancamento,preco,sistemaOperacional,quantidadeDisponivel);
        this.isTouchScreen = flag;
    }
    
    @Override
    public void exibirInformacoes(){

        if(this.getQuantidade() <= 0){
            System.out.println("Não há mais estoque de "+ this.getModelo());
        }else{

            System.out.println("Notebook: "+ this.getModelo());
            System.out.println("Ano de Lançamento: "+ this.getAno());
            System.out.println("Preço: "+ this.getPreco());
            System.out.println("Sistema Operacional: "+ this.getSO());
            System.out.print("Touch Screen: ");
            this.getScreen();
            System.out.println("----------------------------------------------------------");
        }

        
    }

    
    public void getScreen(){
        if(this.isTouchScreen) System.out.print("Sim");
        else System.out.print("Não");
    }
    

}
