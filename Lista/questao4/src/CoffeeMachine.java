public class CoffeeMachine {
   public void makeCoffee(Coffee coffee){
    String n = coffee.getName();
    double w = coffee.getWaterRequired();
    double m = coffee.getMilkRequired();
    double c = coffee.getCoffeeRequired();

    

    if(coffee instanceof Espresso){
        Espresso cafe = new Espresso(n, w, m, c);
        cafe.prepare();
    }
    if(coffee instanceof Latte){
        
        Latte late = new Latte(n, w, m, c);
        late.prepare();
    }
    if(coffee instanceof Cappuccino){
        Cappuccino cappuccino = new Cappuccino(n, w, m, c);
        cappuccino.prepare();
    }

   }
}
