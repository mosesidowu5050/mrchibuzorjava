/*
3.14 (Clock Class) Create a class called Clock that includes three instance 
variables—an hour (type int), a minute (type int) and a second (type int). 
Provide a constructor that initializes the three instance variables and assumes
that the values provided are correct. Provide a set and a get method for each
instance variable. The set method should set the value of all three variables 
to 0 if the value of hour is more than 23, the value of minute is more than 59, 
and the value of second is more than 59. Provide a method displayTime that 
display the time in an “hh:mm:ss” format. Write a test app named ClockTest 
that demonstrates class Clock’s capabilities. 
*/


public class Clock {
   private int hour;
   private int minutes;
   private int seconds;

public Clock(){
   this.hour = hour;
   this.minutes = minutes;
   this.seconds = seconds;
}
public void hour (int hourTime){
    if (hourTime >= 0 && hourTime <= 23){
    hour = hourTime;
    this.hour = hour;
} else {
            System.out.println("Invalid hour. Must be between 0-23.");
        }
}
public int getHour (){
   return hour;
}

public void minutes (int minutesTime){
    if (minutesTime >= 0 && minutesTime <= 59) {
    minutes = minutesTime;
    this.minutes = minutes;
} else {
            System.out.println("Invalid hour. Must be between 0-23.");
        }
 }
public int getMinutes (){
    return minutes;
}

public void seconds (int secondsTime){
    if (secondsTime >= 0 && secondsTime <= 59){
    seconds = secondsTime;
    this.seconds = seconds;
} else {
            System.out.println("Invalid seconds. Must be between 0-59.");
        }
}
public int getSeconds (){
    return seconds;
}

 public String getDisplayTime() {
        return String.format("%02d:%02d:%02d", hour, minutes, seconds);
    }


}