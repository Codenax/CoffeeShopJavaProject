/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JB
 */
public class TeaItem extends PriceCalculation{
   private String teaName;
    
    public void setTeaName(String givenTeaName){
     teaName = givenTeaName ;
    }
    
    
    public String getTeaName(){
    return teaName;
    }
}
