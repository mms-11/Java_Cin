public class Crianca extends Pessoa {
    
    //construtor da subclasse
    public Crianca(int idade, String nome){
        super(idade,nome);//chamar o super(construtor da classe pai)
    }

    //sobrescrever o metodo abstrato criado na superclasse
    
    @Override
    public Ticket getTicketType(){

        return Ticket.CRIANCA;
    }
}
