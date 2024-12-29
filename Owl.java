public class Owl extends Animal implements Flyable {
    @Override
    public void sound() {
        System.out.println("Hoot");
    }

    @Override
    public void fly() {
        System.out.println("Owl is flying");
    }

    @Override
    public void glide() {
        System.out.println("Owl is gliding");
    }
}
