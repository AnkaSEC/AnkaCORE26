package ornek;

public class Eagle extends Bird implements Flyable {
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Kartal çığlık atıyor!");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " yüksekten süzülüyor.");
    }
}
