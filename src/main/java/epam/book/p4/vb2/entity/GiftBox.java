package epam.book.p4.vb2.entity;

import epam.book.p4.vb2.action.sort.CandyNameComparator;
import epam.book.p4.vb2.action.sort.CandySugarComparator;
import epam.book.p4.vb2.action.sort.CandyWeightComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GiftBox {

    private String name;
    private int weight;
    private List<Candy> candyList = new ArrayList<>();

    public GiftBox(String name) {
        this.name = name;
    }

    public List<Candy> getCandies() {
        return candyList;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void add(Candy candy) {
        candyList.add(candy);
        weight += candy.getWeigt();
    }

    public void sort(String value) {
        switch (value.toUpperCase()) {
            case "SUGAR":
                Collections.sort(candyList, new CandySugarComparator());
                break;
            case "WEIGHT":
                Collections.sort(candyList, new CandyWeightComparator());
                break;
            case "NAME":
                Collections.sort(candyList, new CandyNameComparator());
                break;
            default:
                throw new IllegalArgumentException("Неверный параметр сертировки: " + value);
        }
    }

    @Override
    public String toString() {
        String s = String.format("GiftBox - Имя: %s, вес: %d%n", name, weight);
        for (Candy candy : candyList) {
            s += String.format("\t%s%n", candy);
        }
        return s;
    }
}
