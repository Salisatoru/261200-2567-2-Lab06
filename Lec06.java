public class Lec06 {
    public static void main(String[] args) {
        // Creating instances of the animals
        Animal cow = new Cow();
        Animal owl = new Owl();
        Animal duck = new Duck();
        Animal pig = new Pig();
        Duck pekingDuck = new PekingDuck();

        // Calling sound() method for each animal
        cow.sound();
        owl.sound();
        duck.sound();
        pig.sound();
        pekingDuck.sound();

        // Demonstrating Duck-specific methods
        Duck standardDuck = new Duck();
        standardDuck.fly();
        standardDuck.glide();
        standardDuck.clean(cow);

        // Demonstrating PekingDuck-specific methods
        pekingDuck.clean(owl);
        ((PekingDuck) pekingDuck).beCrispy();
    }
}

