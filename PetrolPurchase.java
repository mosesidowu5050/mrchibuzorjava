/*
3.12 (Class PetrolPurchase) Create a class called PetrolPurchase to represent information
about the petrol you purchase. The class should include five pieces of information in the form of
the station’s location (type String), the type of petrol (type String), the quantity (type int) 
of the purchase in liters, the price per liter (double), and the percentage discount (double). 
Your class should have a constructor that initializes the five instance variables. 

Provide a set and a get method for each instance variable. In addition, provide a method 
named getPurchaseAmount that calculates the net purchase amount (i.e., multiplies the 
quantity by the price per liter) minus the discount, then returns the net amount you had to 
pay as a double value. Write an application class named Petrol that demonstrates the 
capabilities of class PetrolPurchase.
*/

public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int quantity;
    private double pricePerLiter;
    private double discount;

public PetrolPurchase (String location, String petrolType){
     this.location = location;
     this.petrolType = petrolType;
     this.quantity = quantity;
     this.discount = discount;
     this.pricePerLiter = pricePerLiter;
   }

public void setLocation (String location){
     this.location = location;
}
public String getLocation(){
     return location;
}

public void setPetrolType (String petrolType){
     this.petrolType = petrolType;
}
public String getPetroType(){
     return petrolType;
}

public void theQuantity (int quantityLiter){
     if (quantityLiter > 0) quantity += quantityLiter;
}
public int getQuantity (){
     return quantity;
}

public void thePricePerLiter (double AmountPerLiter){
     if (AmountPerLiter > 0.0) pricePerLiter += AmountPerLiter;
}
public double getPricePerLiter (){
     return pricePerLiter;
}

public void theDiscount (double discountRate){
     if (discountRate > 0) discount = quantity * pricePerLiter * (discountRate / 100);
}
public double getDiscount(){
     return discount;
}

public double getPurchaseAmount (){
    return quantity * pricePerLiter - discount;
    }
}
