import java.sql.SQLOutput;

public class Person {
    private String name;
    private int age;

    public Person(){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void displayInformation(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
