import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class MovieRatingSystem {
   public static void main(String[] args){

Scanner userInput = new Scanner(System.in);

ArrayList<String> allMoviesAdded = new ArrayList<>();
ArrayList<String> namesOfMoviesRated = new ArrayList<>();
ArrayList<Double> allRatings = new ArrayList<>();



while(true){
    printMenu();
    int userChoice = validateForIntegersOnly ("Enter your preferred choice between (1-4): ");

while (userChoice < 1 || userChoice > 4){
  userChoice = validateForIntegersOnly ("Invalid, enter choice between (1-4): ");

}
System.out.println();


if (userChoice == 1){
    System.out.print("Enter the movie name: ");
    String movieName = userInput.nextLine();

    System.out.println("Your Movie '" + movieName + "' added!");
        allMoviesAdded.add(movieName);
        getFormattedDateTime();
}



if (userChoice == 2) {
    System.out.print("Enter the movie name: ");
    String movieRatingName = userInput.nextLine();

    boolean movieExists = allMoviesAdded.stream().anyMatch(movie -> movie.equalsIgnoreCase(movieRatingName));

    if (movieExists) {
	namesOfMoviesRated.add(movieRatingName);
        System.out.println("Movie found! You can now rate it.");

    System.out.print("Enter your rating (1-5): ");
    double rateMovie = validateRatingInput("rate");

    System.out.println("Your Movie '" + movieRatingName + "' " + rateMovie);
    allRatings.add(rateMovie);

    } else {
        System.out.println("Movie name not added, cannot be rated.");
    }
}
System.out.println();



if (userChoice == 3){
   if (namesOfMoviesRated.isEmpty() && allRatings.isEmpty()){
    System.out.println("No movie rating yet...");

  } else {
    System.out.println("Average Ratings: ");
for (int count = 0, counter = 0; count < namesOfMoviesRated.size(); count++, counter++){
    System.out.printf("-%s:%2.2f ", namesOfMoviesRated.get(count), allRatings.get(counter));
System.out.println();

}
  }
}
System.out.println();




if (userChoice == 4){
System.out.println("Goodbye...");

break;
}





   }
}




public static void printMenu(){
  System.out.println("""
     Movie Rating System
===================================
1. Add a movie
2. Rate a movie
3. View Average Ratings of all movies
4. Exit...
====================================
""");
}


public static int validateForIntegersOnly (String input){
    Scanner userInput = new Scanner(System.in);

while (true) {
   try {
       System.out.print(input);
       return Integer.parseInt(userInput.nextLine().trim());

   } catch (NumberFormatException e) {
     System.out.println("Invalid input. Please enter a valid integer.");
   }
  }
}




public static String getFormattedDateTime() {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy, MMMM dd, hh:mm a");

     System.out.println("Date & Time: " + now.format(formatter));
  return now.format(formatter);
 }




public static String validEmptyString(String input){
   Scanner userInput = new Scanner(System.in);
while (true){
      System.out.print(input);
      input = userInput.nextLine().trim();
   if (!input.isEmpty() && input.matches("[a-zA-Z ]+")){
   return input;
    }
    return "Invalid Input";
  }
 }



public static double validateRatingInput(String input){
    Scanner userInput = new Scanner(System.in);
while (true){
   if (userInput.hasNextInt()){
   double number = userInput.nextDouble();
    if (number >= 1 && number <= 5) {

      return number;

   } else {
      System.out.println("Invalid input. Please enter a number between (1-5): ");
     } 

  } else {
         System.out.print("Invalid input. Please enter a valid number: ");
         userInput.next();
    }
  }
}




public static boolean validatingMovieNameToBeRated(String movieName){
    Scanner userInput = new Scanner(System.in);

while(true){
   movieName = userInput.nextLine().trim();
   if (movieName.equalsIgnoreCase(movieName)){
     //allMoviesAdded.contains(movieName);
       System.out.print(movieName);
return true;

  } else {
    System.out.print("Movie name doesn't exist...");
  return false;

   }
}
}




}