package FactoryMethod;

interface Transport {
    void deliver();
}

class Car implements Transport {
    public void deliver() {
        System.out.println("Delivering by Car");
    }
}

class Bike implements Transport {
    public void deliver() {
        System.out.println("Delivering by Bike");
    }
}

abstract class TransportFactory {
    public abstract Transport createTransport();

    // Reusable business logic
    public void planDelivery() {
        Transport t = createTransport();
        t.deliver();
    }
}

class CarFactory extends TransportFactory {
    public Transport createTransport() {
        return new Car();
    }
}

class BikeFactory extends TransportFactory {
    public Transport createTransport() {
        return new Bike();
    }
}
