package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        TransportFactory factory = new CarFactory();
        factory.planDelivery();
    }
}