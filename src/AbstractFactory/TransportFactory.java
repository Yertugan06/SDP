package AbstractFactory;

interface LandTransport {
    void drive();
}

interface SeaTransport {
    void sail();
}

class Car implements LandTransport {
    @Override
    public void drive() {
        System.out.println("Driving a AbstractFactory.Car on the road.");
    }
}

class Bike implements LandTransport {
    @Override
    public void drive() {
        System.out.println("Riding a AbstractFactory.Bike on the road.");
    }
}

class Boat implements SeaTransport {
    @Override
    public void sail() {
        System.out.println("Sailing a AbstractFactory.Boat on the river.");
    }
}

class Ship implements SeaTransport {
    @Override
    public void sail() {
        System.out.println("Sailing a AbstractFactory.Ship on the sea.");
    }
}

interface TransportFactory {
    LandTransport createLandTransport();
    SeaTransport createSeaTransport();
}

class LuxuryTransportFactory implements TransportFactory {
    public LandTransport createLandTransport() {
        return new Car();
    }
    public SeaTransport createSeaTransport() {
        return new Ship();
    }
}

class EconomyTransportFactory implements TransportFactory {
    public LandTransport createLandTransport() {
        return new Bike();
    }
    public SeaTransport createSeaTransport() {
        return new Boat();
    }
}
