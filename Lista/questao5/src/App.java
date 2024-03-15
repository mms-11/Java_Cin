public class App {
    public static void main(String[] args) throws Exception {
        Queue<Pessoa> fila = new Queue<>(5);

        fila.push(new Crianca(5, "Crianca 1"));
        fila.push(new Crianca(30, "Crianca 2"));
        fila.push(new Crianca(6, "Crianca 3"));
        fila.push(new Adulto(20, "Adulto 1"));
        fila.push(new Adulto(8, "Adulto 2"));

            while(!fila.getPessoas().isEmpty()){
                System.out.println(fila.pop());
            }
    }
}
