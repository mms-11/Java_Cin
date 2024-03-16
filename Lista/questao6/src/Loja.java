public class Loja {
    
    public void venderProduto(ProdutoEletronico produtoEletronico){
        int valor = produtoEletronico.getQuantidade() -1;
        produtoEletronico.setQuantidade(valor);
        if(produtoEletronico instanceof Notebook ){
            Notebook notebook  = (Notebook) produtoEletronico;
            notebook.exibirInformacoes();
        }
        if(produtoEletronico instanceof Tablet){
            Tablet tablet = (Tablet) produtoEletronico;
            tablet.exibirInformacoes();
        }
        if(produtoEletronico instanceof Smartphone){
            Smartphone smartphone = (Smartphone) produtoEletronico;
            smartphone.exibirInformacoes();
        }
        
}
}
