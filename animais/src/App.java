public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Papagaio papaio = new Papagaio("Tico");
        System.out.printf("o nome da ave = %s\n", papaio.getNome());

        Cachorro dog = new Cachorro(5, "puddle");
        dog.SetNome("dino");
        System.out.printf("o nome do dog = %s e seu tamanho = %s\n", dog.getNome(), dog.getTamanho());

        Cavalo horse = new Cavalo();
        horse.SetNome("rufus");
        System.out.printf("o nome do cavalo = %s", horse.getNome());
    }
}
