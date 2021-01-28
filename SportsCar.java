package decoratordesignpattern;
/**
 * @author nbrady
 * This class createst the compact type of vehicle
 */
public class SportsCar extends Vehicle{
    /**
     * this sets the vehicle description to SportsCar and calls
     * the getCost method
     */
    public SportsCar() {
        this.description = "SportsCar";
        getCost();
    }
    /**
    * adds the correct value to the vehicle
    */
    public double getCost()
    {
        
        return +30000;
    }
    
}
