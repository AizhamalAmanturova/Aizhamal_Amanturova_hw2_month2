public class Main {
    public static void main(String[] args) {
        Printable[] elements = {createObject("Fantastic"), createObject("Science"), createObject("Romantic")};
        System.out.println("------MY BOOKLIST------");
        for (Printable element : elements) {
            element.print();
        }
    }

    public static Book createObject(String className) {
        return switch (className) {
            case "Romantic" -> new Romantic("Silence", 23);
            case "Science" -> new Science("The human being", 3.21);
            case "Fantastic" -> new Fantastic("The world");
            default -> throw new IllegalArgumentException("Недопустимый класс: " + className);
        };
    }
}