public abstract class Coffee {

    private String name;
    private double waterRequired, milkRequired, coffeeRequired;
    public Coffee(String n, double w, double m, double c){
        this.name = n;
        this.waterRequired = w;
        this.milkRequired = m;
        this.coffeeRequired = c;
    }

    public abstract void prepare();
    
    public double getWaterRequired() {
        return waterRequired;
        
    }
    public double getCoffeeRequired() {
        return coffeeRequired;
        
    }
    public double getMilkRequired() {
        return milkRequired;
        
    }

    public String getName(){
        return this.name;
    }
    
}