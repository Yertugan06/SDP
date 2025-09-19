package AbstractFactory;

class Car implements LandTransport {
    @Override
    public void drive() {
        System.out.println("Driving a AbstractFactory.Car on the road.");
    }
}