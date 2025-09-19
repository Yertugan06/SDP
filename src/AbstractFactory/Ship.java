package AbstractFactory;

class Ship implements SeaTransport {
    @Override
    public void sail() {
        System.out.println("Sailing a AbstractFactory.Ship on the sea.");
    }
}