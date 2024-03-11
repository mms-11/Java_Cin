public class Espresso extends Coffee{

    public Espresso(String n, double w, double m, double c) {
        super(n, w, m, c);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void prepare() {
      
        System.out.printf("-- Preparo do  " + this.getName() + "--\n" );
        System.out.printf("1- Adicionar " + this.getWaterRequired() + "de agua \n" );
        System.out.printf("2- Adicionar " + this.getCoffeeRequired() + "de café \n" );

    }
}
