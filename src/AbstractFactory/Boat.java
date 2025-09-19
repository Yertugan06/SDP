package AbstractFactory;

class Boat implements SeaTransport {
    @Override
    public void sail() {
        System.out.println("Sailing a AbstractFactory.Boat on the river.");
    }
}