import java.util.ArrayList;

public class Tarefa<P extends Responsavel> {
    private String descricao;
    private P membroDaEquipe;

   public Tarefa(String descricao, P membroDaEquipe) {//construtor
    this.descricao = descricao;
    this.membroDaEquipe = membroDaEquipe;
   }

    public  double calcularCargaDeTrabalho( Responsavel responsavel){
        if(responsavel instanceof LiderEquipe){//RESPONSAVEL É DO TIPO LIDER

            return 6.14;
        }
        else {//responsavel eh to tipo membro

           if(this.descricao.equals("desenvolvimento de codigo")){
            return 7.14;
           }
           else if(this.descricao.equals("correcao de bugs")){
            return 8.14;
           }
           else{
            return 9.14;
           }
        }

    }

    public P getResponsavel(){
        return this.membroDaEquipe;
    }
    public String getDescricao(){
        return this.descricao;
    }


    
}
