public abstract class Animal {
    private String nome;
    public abstract void emitirSom();

    public String getNome(){
        return this.nome;
    }
    public void SetNome(  String nome){
        this.nome = nome;
    }
}
