public abstract class Pessoa {
    private int idade;
    private String nome;

    public Pessoa(int idade,String nome){
        this.idade = idade;
        this.nome = nome
    }

    public abstract String getTicketType();
}