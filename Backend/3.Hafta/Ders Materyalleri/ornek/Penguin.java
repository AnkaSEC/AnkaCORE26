package ornek;

public class Penguin extends Bird implements Swimmable {
    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Penguen ses çıkarıyor!");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " yüzüyor.");
    }
}
