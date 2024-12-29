public class Duck extends Animal implements Flyable {
    @Override
    public void sound() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void glide() {
        System.out.println("Duck is gliding");
    }

    public void clean(Animal animal) {
        System.out.println("Duck is cleaning " + animal.getClass().getSimpleName());
    }
}
