package AbstractFactory;

class LuxuryTransportFactory implements TransportFactory {
    public LandTransport createLandTransport() {
        return new Car();
    }
    public SeaTransport createSeaTransport() {
        return new Ship();
    }
}