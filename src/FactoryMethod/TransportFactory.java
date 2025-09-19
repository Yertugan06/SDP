package FactoryMethod;

abstract class TransportFactory {
    public abstract Transport createTransport();

    // Reusable business logic
    public void planDelivery() {
        Transport t = createTransport();
        t.deliver();
    }
}

