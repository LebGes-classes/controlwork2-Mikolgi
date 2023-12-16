public class Employee extends Person{
    protected String job;

    Employee(){
        super();
        System.out.println(" Должность: ");
        job = scan.nextLine();
    }

    @Override
    public void printInfo(){
        System.out.println("Информация о сотруднике:");
        System.out.println("Имя: "+name);
        System.out.println("Должность: "+job+"\n");
    }
}
