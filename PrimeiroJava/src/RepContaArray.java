public class RepContasArray implements RepositorioContas {
    private ContaAbstrata[] contas; //chaves da classe RepContas
    private int indice;//chave de cada conta;

/**
 * 
 */
public RepContasArray(){ //construtor da classe
    contas = new ContaAbstrata[10];//gerar 10 instancias pertencentes a classe ContaAbstrata no vetor contas
    indice = 0;
}

public void inserir(ContaAbstrata novaConta) {

    //se a conta não existir,inserir
    if(indice < contas.length){

        contas[indice] = novaConta;
        indice++;
    }
    else System.out.println("Repositório cheio");

}

public ContaAbstrata procurar( String numero){
    for(int i = 0; i < indice; i++){
        if(contas[i].getNumero().equals(numero)){
            //numero encontrado está no array

            return contas[i];
        }
    }
    return null;
}

public void remover(String numero) {
    //se a conta estiver no array, remover
    int contador = 0;
    for(int i = 0; i < indice; i++){
        if(contas[i].getNumero().equals(numero)){ //conta encontrada
            //remover
            contas[i] = contas[indice-1]; // substituir a conta a ser removida pela ultima conta do vetor
            contas[indice-1] = null; //remover
            indice--;
            return;
        }
    }
}

public void atualizar(ContaAbstrata conta){
    for(int i = 0; i < indice; i++){
        if(conta.getNumero().equals(contas[i].getNumero())){
            contas[i] = conta;
            return;
        }
    }
}

public boolean existe(String numero) {
    for (int i = 0; i < indice; i++) {
        if (contas[i].getNumero().equals(numero)) {
            return true;
        }
    }
    return false;
}

}
