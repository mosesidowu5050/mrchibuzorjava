/*
3.16 (Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see
that your heart rate stays within a safe range suggested by your trainers and doctors. 
The American Heart Association (AHA) (http://bit.ly/TargetHeartRates), the formula for calculating 
your maximum heart rate in beats per minute is 220 minus your age in years. Your target
heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are 
estimates provided by the AHA. Maximum and target heart rates may vary based on the health, 
fitness and gender of the individual. Always consult a physician or qualified health-care 
professional before beginning or modifying an exercise program.] Create a class called 
HeartRates.

The class attributes should include the person’s first name, last name and 
date of birth (consisting of separate attributes for the month, day and year of birth). 
Your class should have a constructor that receives this data as parameters. For each attribute 
provide set and get methods. The class also should include a method that calculates and 
returns the person’s age (in years), a method that calculates and returns the person’s maximum 
heart rate and a method that calculates and returns the person’s target heart rate. 

Write a Java app that prompts for the person’s information, instantiates an object of class 
HeartRates and prints the information from that object—including the person’s first name, 
last name and date of birth—then calculates and prints the person’s age in (years), maximum 
heart rate and targetheart-rate range.
*/

public class TargetHeartRateCalculator {
   private String firstName;
   private String lastName;
   private int dateOfBirth;

public TargetHeartRateCalculator (String firstName, String lastName, int dateOfBirth){
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
}
public void setFirstName (String firstNames){
    if (firstNames.matches("[A-Z][a-zA-Z]*")){
    this.firstName = firstName;
   }
}
public void setLastName (String lastNames){
    if (lastNames.matches("[a-zA-z]+(['-][a-zA-Z]+)*")){
    this.lastName = lastName;
   }
}
public void setDateOfBirth (int month, int day, int yearOfBirth){
    if (month >= 1 && month <= 12 && day >= 1 && day <= 31 && yearOfBirth >= 1000 && yearOfBirth <= 2025){
    //dateOfBirth = String.format ("%-02d%-02d%-02d", month, day, yearOfBirth) ;
    this.dateOfBirth = dateOfBirth;
  }
}
public String getFirstName(){
   return firstName;
}

public String getlastName(){
   return lastName;
}
public int getDateOfBirth (){
   return dateOfBirth;
   //return String.format ("%-02d%-02d%-02d", month, day, yearOfBirth) ;
}
public String getAge (){
   int currentYear = 2025;
   int result = currentYear - dateOfBirth;
   return String.format ("%d%s", result, "years");
}
public String getMaxHeartRate (){
   int age = 0;
   int currentYear = 2025;
   age = currentYear - dateOfBirth;
   int heartRateBeat = 220;
   int heartRate = heartRateBeat - age;

return String.format ("%d%s", heartRate, "bpm");
}
public String getTargetHeartRate (){
   int age = 0;
   int discountRate = 0;
   int discount = discountRate / 100;
   int heartRateBeat = 220;
   int heartRate = heartRateBeat - age;
   int targetHeartRate = heartRate * discount;

return String.format ("%d%s", targetHeartRate, "bpm");
}

}