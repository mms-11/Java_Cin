import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        MembroEquipe membro1 = new MembroEquipe("João");
        MembroEquipe membro2 = new MembroEquipe("Maria");

        LiderEquipe lider1 = new LiderEquipe("Pedro");

        //criar tarefas

        Tarefa<MembroEquipe> tarefa1 = new Tarefa<>("desenvolvimento de codigo", membro1);
        Tarefa<MembroEquipe> tarefa2 = new Tarefa<>("correcao de bugs", membro2);
        Tarefa<LiderEquipe> tarefa3 = new Tarefa<>("revisao de codigo",lider1);



        //criar array de tarefas, cada elemento do vetor tarefa pode ter tipos de responsável
        //por isso utilizamos generics
        //o arraylist vai ser do tipo Tarefa
        //Tarefa, por ser generics, pode receber um membro ou um lider como tipo

        ArrayList<Tarefa<? extends Responsavel>> tarefas = new ArrayList<>();
        tarefas.add(tarefa1);
        tarefas.add(tarefa2);
        tarefas.add(tarefa3);

        int i = 0;
        for(Tarefa<? extends Responsavel> tarefa: tarefas){

            if(i == 0){
                System.out.println("a carga de trabalho de Joao "+ tarefa.calcularCargaDeTrabalho( membro1));
            }
            if( i == 1){
                System.out.println("a carga de trabalho de Maria "+ tarefa.calcularCargaDeTrabalho(membro2));
            }
            if( i == 2){
                System.out.println("a carga de trabalho de Pedro "+ tarefa.calcularCargaDeTrabalho( lider1));
            }
            i++;
        }
        

        
            //.out.println("a carga de trabalho de Joao"+ tarefas.get(0).calcularCargaDeTrabalho(tarefas, membro1));
            //System.out.println("a carga de trabalho de Maria"+ tarefas(1).calcularCargaDeTrabalho(tarefas, membro1));
            //System.out.println("a carga de trabalho de Pedro"+ tarefas(2).calcularCargaDeTrabalho(tarefas, membro1));
        
    }
}
