//Вариант 4
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Person> peopleList = new ArrayList<Person>();
        System.out.println("Сколько человек хотите записать?: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Сотрудник  или Посетитель: ");
            scan.nextLine();
            String choice = scan.nextLine();
            if (choice.equals("Сотрудник")){
                peopleList.add(new Employee());
            } else if (choice.equals("Посетитель")){
                peopleList.add(new Buyer());
            }
        }
        System.out.println("Общий список людей: ");
        for (int i = 0; i < peopleList.size(); i++){
            peopleList.get(i).printInfo();
        }
    }
}
