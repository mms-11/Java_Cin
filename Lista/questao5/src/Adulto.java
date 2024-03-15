public class Adulto extends Pessoa {
    
    public Adulto(int idade, String nome ){
        super(idade, nome);

    } //chamando a super para o construtor da subclasse

    //implementar o corpo da função abstrata criada na classe abstrada pessoa
     @Override
     public Ticket getTicketType(){
        return Ticket.ADULTO;
     }

}
