
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author JB
 */
public class ConfirmOrder {
    private int invoiceId;
    private String invoiceNo;
    private String cashirName;
    private String dateTime;
    private double discount;
    private double subTotal;
    private double total;
    private double itemSubTotal;
      
    public void setInvoiceId(int givenInvoiceId){
    invoiceId = givenInvoiceId;
    }
    
    public String getInvoiceNo(){
    invoiceNo = "jb000" + String.valueOf(invoiceId);
    return invoiceNo;
    }
    
    public void setCashirName(String givenCashirName){
     cashirName =givenCashirName;
    }
    public  String getCashirName(){
    return cashirName;
    }

    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy , hh.mm aa");
    public String getDateTime(){
      dateTime = dateFormat.format(new Date());
      return dateTime;
    }
   
       
    
    
    public void setDiscount(double givenDiscount){
       discount = givenDiscount;
    }
     public void setDiscount(String givenDiscount){
       discount = Double.valueOf(givenDiscount);
    }
     
     
    public void setItemSubTotal(double givenItemSubTotal){
    itemSubTotal =givenItemSubTotal;
    }
    
    public void setItemSubTotal(String givenItemSubTotal){
    itemSubTotal =Double.valueOf(givenItemSubTotal) ;
    }
    
    
    public void setSubTotal(){
    subTotal = subTotal+itemSubTotal;
    }
    public void setTotal(){
     total = getSubTotal() - ((getSubTotal() * getDiscount()) / 100);
    }
    
    
 
    public double getDiscount(){
    return discount;
    }
    public double getSubTotal(){
     return subTotal;
    } 
    public double getTotal(){
      return total;
    }
}
