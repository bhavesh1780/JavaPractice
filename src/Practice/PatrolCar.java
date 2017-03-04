package Practice;

/**
 * Created by Dell on 04/03/2017.
 */
public class PatrolCar extends Car{

    @Override
    public void Features() {
        Mileage = 10;
        RoadTax = 200;

        super.Features();
    }
}
