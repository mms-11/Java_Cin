public class Cappuccino extends Coffee{
    public Cappuccino(String n, double w, double m, double c){
        super(n,w,m,c);
    }
    @Override
    public void prepare(){

        System.out.printf("-- Preparo do  " + this.getName() + "--\n" );
        System.out.printf("1- Adicionar " + this.getCoffeeRequired() + " de cafe \n" );
        System.out.printf("2- Adicionar " + this.getMilkRequired() + " de leite \n" );
        System.out.printf("3- Adicionar ", + this.getWaterRequired() + " de agua\n");
    }
    
}