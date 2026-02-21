package ornek;

public class Main {
    public static void main(String[] args) {

        Animal eagle = new Eagle("Kartal", 5);
        Animal penguin = new Penguin("Penguen", 3);

        System.out.println(eagle.getName() + " yaşı: " + eagle.getAge());
        System.out.println(penguin.getName() + " yaşı: " + penguin.getAge());


        eagle.makeSound();
        eagle.eat();

        penguin.makeSound();
        penguin.eat();

        // Interface referansı
        Flyable flyingBird = new Eagle("Yeni Kartal", 2);
        flyingBird.fly();

        Swimmable swimmingBird = new Penguin("Yeni Penguen", 1);
        swimmingBird.swim();
    }
}
