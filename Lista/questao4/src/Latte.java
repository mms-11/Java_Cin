public class Latte extends Coffee {
    public Latte(String n, double w, double m, double c){
        super(n,w,m,c);
    }
    @Override
    public void prepare(){
        System.out.printf("-- Preparo do  " + this.getName() + "--\n" );
        System.out.printf("1- Adicionar " + this.getCoffeeRequired() + "mde cafe \n" );
        System.out.printf("2- Adicionar " + this.getMilkRequired() + "mde leite \n" );
    }
}
