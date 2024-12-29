public class PekingDuck extends Duck {
    @Override
    public void clean(Animal animal) {
        System.out.println("PekingDuck is cleaning " + animal.getClass().getSimpleName() + " elegantly");
    }

    public void beCrispy() {
        System.out.println("PekingDuck is crispy and delicious!");
    }
}
