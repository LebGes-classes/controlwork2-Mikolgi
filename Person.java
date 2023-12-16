import java.util.Scanner;

public abstract class Person {
    protected String name;
    public static Scanner scan = new Scanner(System.in);

    Person(){
        System.out.println("Имя: ");
        name = scan.nextLine();
    }

    public abstract void printInfo();
}
