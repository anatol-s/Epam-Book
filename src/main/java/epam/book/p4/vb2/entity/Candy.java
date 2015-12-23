package epam.book.p4.vb2.entity;

public class Candy {
    private String name;
    private int weight;
    private int sugar;

    public Candy(String name, int weight, int sugar) {
        this.name = name;
        this.weight = weight;
        this.sugar = sugar;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getSugar() {
        return sugar;
    }

    @Override
    public String toString() {
        return String.format("Candy - Имя: %s, вес: %d, сахар: %d;", name, weight, sugar);
    }
}
