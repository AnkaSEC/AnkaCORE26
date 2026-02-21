package ornek;

public abstract class Bird extends Animal{
    public Bird(String name, int age) {
        super(name, age);
    }

    public void layEgg() {
        System.out.println(getName() + " yumurtladı.");
    }
}
