
import java.text.DecimalFormat;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author JB
 */
public class PriceCalculation {
    private int quantity;
    private double itemPrice;
    private double totalPrice;
    public void setQuantity(int givenQuantity){
        quantity = givenQuantity;
    }
    public void setItemPrice(double givenItemPrice){
        itemPrice = givenItemPrice;
    }
    
    public void setItemPrice(int givenItemPrice){
        itemPrice = Double.valueOf(givenItemPrice);
    }
    
    public int getQuantity(){
        return quantity;
    }
    public double getItemPrice(){
        return itemPrice;
    }
    
    DecimalFormat df = new DecimalFormat("0.00");
    public String getTotalPrice(){
        totalPrice = itemPrice * Double.valueOf(quantity);
        return df.format(totalPrice);
    }
    
    public void countTotalItem(){
        int count = getQuantity();
        int count2 = count + 1;
        setQuantity(count2); 
    }
}
