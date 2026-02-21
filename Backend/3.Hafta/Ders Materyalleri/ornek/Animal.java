package ornek;

public abstract class Animal {
    // Encapsulation
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        setAge(age);
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter (Validation var)
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Yaş negatif olamaz!");
        }
    }

    // Abstract method (Abstraction)
    public abstract void makeSound();

    // Normal method
    public void eat() {
        System.out.println(name + " yemek yiyor.");
    }
}
