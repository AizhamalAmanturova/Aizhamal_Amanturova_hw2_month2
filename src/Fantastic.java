public class Fantastic extends Book {
    public Fantastic(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Genre: " + getName());

    }
}
