public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Espresso cafezin = new Espresso("mari", 3, 0, 6);
        cafezin.prepare(); //okay :)

        Latte cafeCleite = new Latte("vegancoffe", 3,5,8);
        cafeCleite.prepare();

        Object tipo = cafezin.getClass();
         System.out.print(tipo);
         if( cafezin instanceof Espresso){
            System.out.print("eh um tipo de espresso");
         }

         CoffeeMachine maquina = new CoffeeMachine();
         maquina.makeCoffee(cafeCleite);


    }
}
