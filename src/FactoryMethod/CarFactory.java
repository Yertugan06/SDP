package FactoryMethod;

class CarFactory extends TransportFactory {
    public Transport createTransport() {
        return new Car();
    }
}
