public class Pet {
    private final String name;
    private boolean clean;

    // constructor
    public Pet(String name) {
        this.name = name;
        this.clean = false;
    }

    // getters
    public String getName() {
        return name;
    }

    public boolean isClean() {
        return clean;
    }
}
