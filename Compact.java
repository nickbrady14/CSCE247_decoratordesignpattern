package decoratordesignpattern;
/**
 * @author nbrady
 * This class createst the compact type of vehicle
 */
public class Compact extends Vehicle{
    /**
     * this sets the vehicle description to Compact and calls
     * the getCost method
     */
    public Compact() {
        this.description = "Compact";
        getCost();
    }
   /**
    * adds the correct value to the vehicle
    */
    public double getCost()
    {
        
        return +15000;
    }
    
}
