// This program will show what the new price will be
// on a $59 store item that is discounted by 20%

public class PercentageDiscount
{
  public static void main(String[] args)
  {
    // Variables to hold the item's price, the discount and the new price.
    double item = 59, discount, newPrice;
    
    // Calculate the amount of the discount by multiplying .2 by the item cost.
    discount = item * .2;
    System.out.println("A 20% discount on a $59 item will be $" + discount + ".");
    
    // Calculate the item's new price by deducting the discount price from the item's price.
    newPrice = item - discount;
    System.out.println("The item's new price is $" + newPrice + ".");                         
    
    
  }
}
