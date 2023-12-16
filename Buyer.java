public class Buyer extends Person{
    protected int age;

    Buyer(){
        super();
        System.out.println(" Возраст: ");
        age = scan.nextInt();
    }

    @Override
    public void printInfo(){
        System.out.println("Информация о покупателе:");
        System.out.println("Имя: "+name);
        System.out.println("Возраст: "+age+"\n");
    }
}

