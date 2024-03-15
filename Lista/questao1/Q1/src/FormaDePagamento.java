public interface FormaDePagamento {
    public abstract boolean autenticar();
    public abstract void processarPagamento(double valor) throws Excecao;
}
