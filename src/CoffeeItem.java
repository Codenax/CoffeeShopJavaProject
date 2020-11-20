/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JB
 */
public class CoffeeItem extends PriceCalculation{
    private String coffeeName;
    
    public void setCoffeeName(String givenCoffeeName){
    coffeeName = givenCoffeeName;
    }
    public String getCoffeeName(){
    return coffeeName;
    }
}
