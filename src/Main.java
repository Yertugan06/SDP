public class Main {
    public static void main(String[] args) {
        Car camry = new Car.Builder()
                .brand("Toyota")
                .model("Camry 70")
                .engine("2.5L Petrol")
                .doors(4)
                .withGPS(true)
                .build();

        Car accent = new Car.Builder()
                .brand("Hyundai")
                .model("Accent")
                .engine("1.6L Petrol")
                .doors(4)
                .withGPS(false)
                .build();

        Car lada = new Car.Builder()
                .brand("Lada")
                .model("Granta")
                .engine("1.6L Petrol")
                .doors(4)
                .withGPS(false)
                .build();

        System.out.println(camry);
        System.out.println(accent);
        System.out.println(lada);
    }
}
