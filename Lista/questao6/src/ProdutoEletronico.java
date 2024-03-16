public abstract class ProdutoEletronico {
    private String modelo;
    private int anoLancamento;
    private double preco;
    private String sistemaOperacional;
    private int quantidadeDisponivel;

    public abstract void exibirInformacoes();

    //construtor
    public ProdutoEletronico(String modelo, int ano, double preco, String so, int quantidadeDisponivel){

        this.modelo = modelo;
        this.anoLancamento = ano;
        this.preco = preco;
        this.sistemaOperacional = so;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
    public String getModelo() {
        return this.modelo;
    }
    public int getQuantidade(){
        return this.quantidadeDisponivel;
    }
    public void setQuantidade(int valor){
        this.quantidadeDisponivel = valor;
    }
    public int getAno(){
        return this.anoLancamento;
    }
    public double getPreco(){
        return this.preco;
    }
    public String getSO(){
        return this.sistemaOperacional;
    }
   
}