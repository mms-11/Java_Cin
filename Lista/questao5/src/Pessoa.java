public abstract class Pessoa implements Comparable<Pessoa> {
    private int idade;//atributos privados
    private String nome;

    public Pessoa(int idade,String nome){ //construtor
        this.idade = idade;
        this.nome = nome;
    }

    public abstract Enum<Ticket> getTicketType();


    public String getName(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public int compareTo(Pessoa person){ //método da interface comparable
        //compara a idade da pessoa passada como parametro e da pessoa atual (this)
        //se a idade da pessoal passada for maior, a função retorna um numero positivo
        //se for igual, retorna zero
        //se for menor, retorna negativo

        return Integer.compare(person.idade, this.idade);

    }
    public String toString(){
        return this.nome +":" + this.idade + "[" + getTicketType()+ "]";
    }
}