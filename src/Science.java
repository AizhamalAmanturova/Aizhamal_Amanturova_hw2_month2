public class Science extends Book {
    private double length;

    public Science(String name, double length) {
        super(name);
        this.length = length;
    }

    @Override
    public void print() {
        System.out.println("Science: " + getName() + " | Length: " + length);
    }
}
