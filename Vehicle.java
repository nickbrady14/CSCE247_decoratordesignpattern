package decoratordesignpattern;
/**
 * @author nbrady
 * This class createst the compact type of vehicle
 */
public abstract class Vehicle {
    /**
     * description is protected and getCost is a public
     * abstract double so it will be used in all children
     * 
     */
    protected String description;
    public abstract double getCost();
    /**
     * this returns the vehicle despcription string
     */
    public String toString()
    {
        return description;
    }
    
}
