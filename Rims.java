package decoratordesignpattern;
/**
 * @author nbrady
 * This class createst the compact type of vehicle
 */
public class Rims extends VehicleDecorator{
    private Vehicle vehicle;

   /**
     * this sets the object type to vehicle, sets the vehicle,
     * and calls toString and getCost
     * @param vehicle assigns correct vehicle type
     */
    public Rims(Vehicle vehicle)
    {
        this.vehicle = vehicle;
        toString();
        getCost();

    }
    /**
     * concatonates information for printing
     */
    public String toString()
    {
        return vehicle + ", cool rims";
    }
    /**
     * adds additional cost on top of vehicle cost
     */
    public double getCost()
    {
        return vehicle.getCost()+200;
    }
}
