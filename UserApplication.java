public class UserApplication {
    public static void main(String[] args) {
        Users users = new Users();

//        System.out.println("Enter your score");
//        java.util.Scanner scanner = new java.util.Scanner(System.in);
//        int score = scanner.nextInt();
//        // Adding users
        users.add(new User("Glory", 23));
        users.add(new User("Alex", 22));

        // Greeting all users
        users.greet();
    }
}
