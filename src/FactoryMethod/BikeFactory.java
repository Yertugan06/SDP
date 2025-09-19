package FactoryMethod;

class BikeFactory extends TransportFactory {
    public Transport createTransport() {
        return new Bike();
    }
}
