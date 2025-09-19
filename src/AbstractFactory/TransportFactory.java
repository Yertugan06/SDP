package AbstractFactory;

interface TransportFactory {
    LandTransport createLandTransport();
    SeaTransport createSeaTransport();
}
