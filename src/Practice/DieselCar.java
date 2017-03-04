package Practice;

/**
 * Created by Dell on 04/03/2017.
 */
public class DieselCar extends Car {

    @Override
    public void Features() {
        Mileage = 20;
        RoadTax = 50;
        super.Features();
    }
}
