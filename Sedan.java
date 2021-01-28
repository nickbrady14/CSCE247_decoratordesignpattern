package decoratordesignpattern;
/**
 * @author nbrady
 * This class createst the compact type of vehicle
 */
public class Sedan extends Vehicle {
    /**
     * this sets the vehicle description to Sedan and calls
     * the getCost method
     */
    public Sedan() 
    {
        this.description = "Sedan";
        getCost();
    }
    /**
    * adds the correct value to the vehicle
    */
    public double getCost()
    {
        return +20000;
    }
}
