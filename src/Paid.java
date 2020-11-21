
/**
 *
 * @author JB
 */
public class Paid extends ConfirmOrder{
    
    
    private double receivedCash;
    private double change;
    
    public void setReceivedCash(double givenReceivedCash){
    receivedCash=givenReceivedCash;
    }  
    public void setReceivedCash(String givenReceivedCash){
    receivedCash= Double.valueOf(givenReceivedCash);
    }
    
    
    public double getReceivedCash(){
    return receivedCash;
    }
    public double getChange(){    
        change = receivedCash - getTotal();
        return change;
    }
}
