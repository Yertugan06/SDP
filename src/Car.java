class Car {
    private String brand;
    private String model;
    private String engine;
    private int doors;
    private boolean hasGPS;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.engine = builder.engine;
        this.doors = builder.doors;
        this.hasGPS = builder.hasGPS;
    }

    @Override
    public String toString() {
        return String.format("Brand=%s, Model=%s, Engine=%s, Doors=%d, GPS=%s",
                brand, model, engine, doors, hasGPS ? "Yes" : "No");
    }

    public static class Builder {
        private String brand;
        private String model;
        private String engine;
        private int doors;
        private boolean hasGPS;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder doors(int doors) {
            if (doors <= 0) {
                throw new IllegalArgumentException("Doors must be greater than zero");
            }
            this.doors = doors;
            return this;
        }

        public Builder withGPS(boolean hasGPS) {
            this.hasGPS = hasGPS;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
