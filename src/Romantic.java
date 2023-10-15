public class Romantic extends Book{
    private int popularity;
    public Romantic(String name, int popularity) {
        super(name);
        this.popularity = popularity;
    }

    @Override
    public void print() {
        System.out.println("Romantic: " + getName() + " | TopList: " + popularity);

    }
}
