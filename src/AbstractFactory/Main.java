package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        // Choose a factory (e.g., luxury or economy)
        TransportFactory factory = new LuxuryTransportFactory();

        LandTransport land = factory.createLandTransport();
        SeaTransport sea = factory.createSeaTransport();

        land.drive();
        sea.sail();

        System.out.println("-----");

        // Switch to another factory
        factory = new EconomyTransportFactory();
        land = factory.createLandTransport();
        sea = factory.createSeaTransport();

        land.drive();
        sea.sail();
    }
}