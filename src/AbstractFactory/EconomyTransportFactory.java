package AbstractFactory;

class EconomyTransportFactory implements TransportFactory {
    public LandTransport createLandTransport() {
        return new Bike();
    }
    public SeaTransport createSeaTransport() {
        return new Boat();
    }
}
