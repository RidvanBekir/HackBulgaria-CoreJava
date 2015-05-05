package Cars;

public class Audi extends Car {
    
    double mileage;

    public Audi(double mileage,int tank, int doors, int max_speed) {
        super(tank, doors, max_speed);
        this.mileage = mileage;
    }
    
    public double getMileage(){
        return mileage;
    }
}
