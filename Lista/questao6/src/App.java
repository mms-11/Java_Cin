public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");



        Loja loja = new Loja();
        Notebook notebook = new Notebook("samsung",2008,  1000, "windows", 3, true);
        Smartphone smartphone = new Smartphone("Iphone 13", 2010, 2000, "IOS", 2);
        Tablet tablet = new Tablet("tablet", 2010, 2000, "IOS", 2);

        loja.venderProduto(notebook);
        loja.venderProduto(notebook);
        loja.venderProduto(notebook);
        loja.venderProduto(notebook);
        loja.venderProduto(smartphone);
        loja.venderProduto(smartphone);
        loja.venderProduto(tablet);
        loja.venderProduto(tablet);
        loja.venderProduto(tablet);

    }
}
