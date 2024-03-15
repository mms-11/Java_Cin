import java.util.ArrayList;
import java.util.Collections;

public class Queue<T extends Pessoa> { //classe  de fila de pessoas
    //fila só pode aceitar pessoas
    //ou seja, essa classe só pode instanciar objetos que são da classe pessoas


    //atributos da classe
    private ArrayList<T> pessoas;


    //construtor da classe
    public Queue(int tamanhoFila){
         this.pessoas = new ArrayList<>(tamanhoFila);
    }
    public ArrayList<T> getPessoas(){
        return this.pessoas;
    }


    //métodos da classe queue
    public void push( T pessoa){//pessoas mais velhas sempre inseridas antes das mais novas

        pessoas.add(pessoa);//usar método do objeto ArrayList<qualquertipo>
        
        Collections.sort(pessoas); //ordena a lista com base na idade reversa
        //comparar se o topo 
    }

    public T pop(){//tirar a pessoa do topo da fila e retornar na função

        if(pessoas.isEmpty()){//se a fila está vazia,  retornar null
            return null;
        }
        return pessoas.remove(pessoas.size() -1);//remove o ultimo elemento

    }



    
}
