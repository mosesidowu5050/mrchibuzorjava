import java.util.Scanner;

public class PersonApplication {
    public static void main(String[] args) {

        Person personOne =  new Person();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        personOne.setName(name);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        personOne.setAge(age);

        personOne.displayInformation();

//      System.out.printf("%s%d", personOne.getName(), personOne.getAge());
        scan.close();

    }
}
