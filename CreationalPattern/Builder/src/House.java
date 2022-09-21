public class House {

    private final String basement;
    private final String structure;
    private final String roof;
    private final String interior;

    House(HouseBuilder builder) {
        this.basement = builder.basement;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.interior = builder.interior;
    }

    public String getBasement() {
        return basement;
    }

    public String getStructure() {
        return structure;
    }

    public String getRoof() {
        return roof;
    }

    public String getInterior() {
        return interior;
    }

//--------------------------------------------------------------------
    public static class HouseBuilder {
        String basement;
        String structure;
        String roof;
        String interior;

        public HouseBuilder() {
        }

        public HouseBuilder Basement(String basement) {
            this.basement = basement;
            return this;
        }

        public HouseBuilder Structure(String structure) {
            this.structure = structure;
            return this;
        }

        public HouseBuilder Roof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder Interior(String interior) {
            this.interior = interior;
            return this;
        }

        public House Build() {
            return new House(this);
        }
    }

}
