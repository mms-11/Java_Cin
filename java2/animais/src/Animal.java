public abstract class Animal {
    public String nome;

    public abstract void emitirSom();

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
