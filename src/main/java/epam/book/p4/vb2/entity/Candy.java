package epam.book.p4.vb2.entity;

public class Candy {
    private String name;
    private int weigt;
    private int sugar;

    public Candy(String name, int weigt, int sugar) {
        this.name = name;
        this.weigt = weigt;
        this.sugar = sugar;
    }

    public String getName() {
        return name;
    }

    public int getWeigt() {
        return weigt;
    }

    public int getSugar() {
        return sugar;
    }

    @Override
    public String toString() {
        return String.format("Candy - Имя: %s, вес: %d, сахар: %d;", name, weigt, sugar);
    }
}
