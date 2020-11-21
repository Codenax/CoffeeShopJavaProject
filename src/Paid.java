/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
