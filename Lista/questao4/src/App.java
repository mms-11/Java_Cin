public class App {
    public static void main(String[] args) throws Exception {
        

        Espresso cafezin = new Espresso("mari", 3, 0, 6);
        Latte cafeCleite = new Latte("vegancoffe", 3,5,8);
        Cappuccino capu = new Cappuccino("Vegan cappucino", 4, 2, 8);

        CoffeeMachine maquina = new CoffeeMachine();
         maquina.makeCoffee(cafezin);
         maquina.makeCoffee(capu);
         maquina.makeCoffee(cafeCleite);


    }
}
