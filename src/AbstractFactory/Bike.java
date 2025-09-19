package AbstractFactory;

class Bike implements LandTransport {
    @Override
    public void drive() {
        System.out.println("Riding a AbstractFactory.Bike on the road.");
    }
}